public class Main {

    public static void main(String[] args) {
        Vertex vertex0 = new Vertex("A");
        Vertex vertex1 = new Vertex("B");
        Vertex vertex2 = new Vertex("C");

        vertex0.addAdjacency(vertex1);
        vertex0.addAdjacency(vertex2);
        vertex1.addAdjacency(vertex2);

        BreathFirstSearch bfs = new BreathFirstSearch();
        System.out.println(bfs.findPath(vertex0, vertex2));

    }

}
