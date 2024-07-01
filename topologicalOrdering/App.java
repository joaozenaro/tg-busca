import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class App {
    public static void main(String[] args) {
        TopologicalOrdering to = new TopologicalOrdering();

        List<Vertex> graph = new ArrayList<>();
        graph.add(new Vertex("A"));
        graph.add(new Vertex("B"));
        graph.add(new Vertex("C"));
        graph.add(new Vertex("D"));
        graph.add(new Vertex("E"));

        graph.get(0).addNeighbor(graph.get(1)); // A -> B
        graph.get(0).addNeighbor(graph.get(2)); // A -> C
        graph.get(1).addNeighbor(graph.get(3)); // B -> D
        graph.get(2).addNeighbor(graph.get(3)); // C -> D
        graph.get(3).addNeighbor(graph.get(4)); // D -> E

        for (int i = 0; i < graph.size(); i++) {
            if (!graph.get(i).isVisited()) {
                to.dfs(graph.get(i));
            }
        }
        
        Stack<Vertex> stack = to.getStack();
        for (int i = 0; i < graph.size(); i++) {
            Vertex v = stack.pop();
            System.out.println(v + " ");
        }
    }
}
