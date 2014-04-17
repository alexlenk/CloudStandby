package deployment;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.ListenableDirectedGraph;
import org.jgrapht.traverse.TopologicalOrderIterator;

public class DeploymentGraph {

	private ListenableDirectedGraph<Object, DefaultEdge> graph;

	public DeploymentGraph(HashMap<Object, List<Object>> requiresRelations) {
		this.graph = new ListenableDirectedGraph<Object, DefaultEdge>(DefaultEdge.class);
		for (Object vertex : requiresRelations.keySet()) {
			this.graph.addVertex(vertex);
		}
		for (Object vertex : requiresRelations.keySet()) {
			if (requiresRelations.get(vertex) != null) {
				for (Object targetVertex : requiresRelations.get(vertex)) {
					this.graph.addVertex(targetVertex);
					this.graph.addEdge(targetVertex, vertex);
				}
			}
		}
	}

	private Collection<Object> getIncomingEdgesOf(Object o) {
		Set<DefaultEdge> incoming = this.graph.incomingEdgesOf(o);
		List<Object> ancestors = new LinkedList<Object>();
		for (DefaultEdge edge : incoming) {
			ancestors.add(this.graph.getEdgeSource(edge));
		}
		return ancestors;
	}

	private Collection<Object> getOutgoingEdgesOf(Object o) {
		Set<DefaultEdge> incoming = this.graph.edgesOf(o);
		List<Object> children = new LinkedList<Object>();
		for (DefaultEdge source : incoming) {
			children.add(this.graph.getEdgeSource(source));
		}
		return children;
	}

	public HashMap<Object, MpmKennzahl> mpmCalculation() {
		LinkedList<Object> topSort = new LinkedList<Object>();
		TopologicalOrderIterator graphIterator = new TopologicalOrderIterator(graph);
		while (graphIterator.hasNext()) {
			Object o = graphIterator.next();
			topSort.add(o);
		}
		HashMap<Object, MpmKennzahl> mpmCalculation = new HashMap<Object, MpmKennzahl>();
		int startTime = 0;
		int max = 0;
		MpmKennzahl mpmKennzahl;
		for (Object node : topSort) {
			if (this.getIncomingEdgesOf(node).isEmpty()) {
				startTime = 0;
				mpmKennzahl = new MpmKennzahl(0, 1, 1);
			} else {
				for (Object ancestor : this.getIncomingEdgesOf(node)) {
					max = mpmCalculation.get(ancestor).getEft();
					if (max > startTime) {
						startTime = max;
					}
				}
				mpmKennzahl = new MpmKennzahl(startTime, startTime + 1, 1);
			}
			mpmCalculation.put(node, mpmKennzahl);
		}
		return mpmCalculation;
	}

}
