import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    public String findPath(Vertex start, Vertex target) {
        Queue<Vertex> queue = new LinkedList<>();
        queue.add(start);
        start.setVisited(true);

        while (!queue.isEmpty()) {
            Vertex currentVertex = queue.poll();
            for (Vertex vertex : currentVertex.getVertices()) {
                if (!vertex.isVisited()) {
                    vertex.setVisited(true);
                    queue.add(vertex);
                    vertex.setCameFrom(currentVertex);
                }
            }
        }
        return rebuildPath(target);
    }

    public String rebuildPath(Vertex target) {
        Vertex current = target;
        ArrayList<Vertex> path = new ArrayList<>();
        while (current != null) {
            path.add(current);
            current = current.getCameFrom();
        }
        Collections.reverse(path);
        return path.toString();
    }

}
