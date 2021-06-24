import java.util.ArrayList;

public class ListRepresentation {
    public static void main(String[] args) {
        int n = 3, m = 3;
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

        // adding list in list (one based index)
        for(int i=0; i<=n; i++) {
            adjList.add(new ArrayList<>());
        }

        // for directed edge
        // 1-->2, 1-->3
        adjList.get(1).add(2);
        adjList.get(1).add(3);

        // for undirected edge
        // 1--2
        adjList.get(1).add(2);
        adjList.get(2).add(1);
    }
}
