import java.util.ArrayList;

public class DepthFirstSearch {

    public static void dfs(int node, ArrayList<Integer> trs, ArrayList<ArrayList<Integer>> adjList, boolean[] vis) {
        // add to result and mark visited
        trs.add(node);
        vis[node] = true;

        // check adjacent list
        for(Integer i : adjList.get(node)) {
            if(!vis[i]) dfs(i, trs, adjList, vis);
        }
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        int n = 8;
        for(int i=0; i<n; i++) adjList.add(new ArrayList<>());

        // adding edges
        adjList.get(1).add(2);

        adjList.get(2).add(1);
        adjList.get(2).add(4);
        adjList.get(2).add(7);

        adjList.get(3).add(5);

        adjList.get(4).add(2);
        adjList.get(4).add(6);

        adjList.get(5).add(3);

        adjList.get(6).add(4);
        adjList.get(6).add(7);

        adjList.get(7).add(2);
        adjList.get(7).add(6);

        // visited array
        boolean[] vis = new boolean[n];

        // to store final traversal
        ArrayList<Integer> trs = new ArrayList<>();

        // looping through all edges
        for(int i=1; i<=n-1; i++) {
            if(!vis[i]) {
                dfs(i, trs, adjList, vis);
            }
        }

        for(Integer i : trs) System.out.print(i+ " ");
    }
}
