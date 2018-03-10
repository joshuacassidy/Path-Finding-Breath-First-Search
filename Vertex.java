import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private String data;
    private boolean visited;
    private List<Vertex> vertices;
    private Vertex cameFrom;


    public Vertex(String data) {
        this.data = data;
        vertices = new ArrayList<>();
    }


    public Vertex getCameFrom() {
        return cameFrom;
    }

    public void setCameFrom(Vertex cameFrom) {
        this.cameFrom = cameFrom;
    }

    public void addAdjacency(Vertex vertex) {
        this.vertices.add(vertex);
    }


    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Vertex> getVertices() {
        return vertices;
    }

    public void setVertices(List<Vertex> vertices) {
        this.vertices = vertices;
    }

    @Override
    public String toString() {
        return data;
    }
}
