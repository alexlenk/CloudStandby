package experiment;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Collections;
import java.util.Map;

import model.Attribute;
import model.CloudStandby;
import model.ScriptCollection;
import model.impl.ModelPackageImpl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import deployment.Deployer;

public class Experiment {

	public static void main(String[] args) throws URISyntaxException {
		//number of series
		int series = 1;
		// number of experiments
		int runs = 1;
		int startAt = 0;
		java.net.URI model = new java.net.URI(
				"Diss_Experiment_Warm_20140226.model");

		Experiment.runExperiment(series, runs, startAt, model, false);
		//Experiment.terminateModelInstances(model);
	}

	public static void runExperiment(int series, int runs, int startAt,
			java.net.URI model, boolean kill) {
		try {

			for (int i = 0; i < series; i++) {
				try {
					setRunIdInModel(model, startAt);
					for (int j = startAt; j < runs; j++) {
						System.out
								.println("--------------------------------------\nSerie "
										+ i
										+ " Durchlauf Nummer "
										+ j
										+ "\n"
										+ "--------------------------------------");
						Deployer deployer = new Deployer();
						if (deployer.loadModel(model)) {
							if (deployer.startDeployment(0)) {
								if (deployer.stopDeployment(0, false)) {
									System.out.println("Serie" + i + "Run" + j
											+ ": successful");
								} else {
									System.out.println("Serie" + i + "Run" + j
											+ ": stop failed");
								}
							} else {
								System.out.println("Serie" + i + "Run" + j
										+ ": start failed");
							}
						} else {
							System.out.println("Serie" + i + "Run" + j
									+ ": initialization failed");
						}
						increaseRunIdInModel(model);
					}
				} catch (Exception e) {
				}

				System.out.println("--> All experiments finished");
			}
			setRunIdInModel(model, 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void terminateModelInstances(java.net.URI model) {

		Deployer d = new Deployer();
		d.loadModel(model);
		d.stopDeployment(0, true);

	}

	public static CloudStandby loadModel(java.net.URI uri) {
		try {
			// Initialize model
			ModelPackageImpl.init();
			//ModelPackage.eINSTANCE.eClass();
			// Register the XMI resource factory for the .model extension
			Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
			Map<String, Object> map = reg.getExtensionToFactoryMap();
			map.put("model", new XMIResourceFactoryImpl());
			// Obtain a new resource set
			ResourceSet resourceSet = new ResourceSetImpl();
			// Get the resource
			Resource resource = resourceSet.getResource(
					URI.createURI(uri.toString()), true);
			CloudStandby cloudStandby = (CloudStandby) resource.getContents()
					.get(0);
			System.out.println("Model \"" + uri.toString() + "\" loaded.");
			return cloudStandby;
		} catch (Exception e) {
			System.out.println("Model file \"" + uri.toString()
					+ "\" couldn't be loaded.");
			return null;
		}
	}

	/**
	 * Increase RUN_ID in the model file
	 */
	public static void increaseRunIdInModel(java.net.URI uri) {
		try {
			// Create a resource set.
			ResourceSet resourceSet = new ResourceSetImpl();
			// Register the default resource factory -- only needed for stand-alone!
			// this tells EMF to use XML to save the model
			resourceSet
					.getResourceFactoryRegistry()
					.getExtensionToFactoryMap()
					.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
							new XMIResourceFactoryImpl());
			// Get the URI of the model file.
			URI fileURI = URI.createURI(uri.toString());
			// Create a resource for this file.
			Resource resource = resourceSet.createResource(fileURI);
			// Add the model objects to the contents.
			CloudStandby cloudStandby = loadModel(uri);
			EList<ScriptCollection> collections = cloudStandby
					.getInstallation().getScriptCollection();
			for (ScriptCollection collection : collections) {
				EList<Attribute> attributes = collection.getAttribute();
				for (Attribute attribute : attributes) {
					if (attribute.getName().equals("RUN_ID")) {
						Integer value = Integer.parseInt(attribute.getValue());
						value = value + 1;
						attribute.setValue(value.toString());
					}
				}
			}
			resource.getContents().add(cloudStandby);
			// Save the contents of the resource to the file system.
			resource.save(Collections.EMPTY_MAP);
			System.out.println("Resource saved to " + fileURI);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Set RUN_ID to a specific value in the model file
	 */
	public static void setRunIdInModel(java.net.URI uri, int run_id) {
		try {
			// Create a resource set.
			ResourceSet resourceSet = new ResourceSetImpl();
			// Register the default resource factory -- only needed for stand-alone!
			// this tells EMF to use XML to save the model
			resourceSet
					.getResourceFactoryRegistry()
					.getExtensionToFactoryMap()
					.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
							new XMIResourceFactoryImpl());
			// Get the URI of the model file.
			URI fileURI = URI.createURI(uri.toString());
			// Create a resource for this file.
			Resource resource = resourceSet.createResource(fileURI);
			// Add the model objects to the contents.
			CloudStandby cloudStandby = loadModel(uri);
			EList<ScriptCollection> collections = cloudStandby
					.getInstallation().getScriptCollection();
			for (ScriptCollection collection : collections) {
				EList<Attribute> attributes = collection.getAttribute();
				for (Attribute attribute : attributes) {
					if (attribute.getName().equals("RUN_ID")) {
						attribute.setValue(Integer.toString(run_id));
					}
				}
			}
			resource.getContents().add(cloudStandby);
			// Save the contents of the resource to the file system.
			resource.save(Collections.EMPTY_MAP);
			System.out.println("Resource saved to " + fileURI);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
