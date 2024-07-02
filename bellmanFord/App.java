import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Vertex> vertexList = new ArrayList<>();

        Vertex vs = new Vertex("VS");
        Vertex vt = new Vertex("VT");
        Vertex vu = new Vertex("VU");
        Vertex vr = new Vertex("VR");

        vertexList.add(vs);
        vertexList.add(vt);
        vertexList.add(vu);
        vertexList.add(vr);

        List<Edge> edgeList = new ArrayList<>();

        edgeList.add(new Edge(3, vr, vs));
        edgeList.add(new Edge(5, vr, vu));
        edgeList.add(new Edge(7, vr, vt));

        edgeList.add(new Edge(3, vs, vt));
        edgeList.add(new Edge(1, vs, vu));

        edgeList.add(new Edge(1, vu, vt));

        BellmanFord bellmanFord = new BellmanFord(vertexList, edgeList);
        bellmanFord.bellmanFord(vr);

        for (Vertex vertex : vertexList) {
            System.out.println("Rota mais curta de R até " + vertex.getName() + " : " + bellmanFord.getShortestPathTo(vertex) + "\n");
        }
    }
}

