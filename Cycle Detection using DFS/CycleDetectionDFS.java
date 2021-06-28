import java.util.ArrayList;
import java.util.Arrays;


public class CycleDetectionDFS {

    static boolean checkCycleDFS(int node, int par, boolean[] vis, ArrayList<ArrayList<Integer>> adjList) {

        vis[node] = true;
        for(Integer i : adjList.get(node)) {
            if(!vis[node]) {
                if(checkCycleDFS(i, node, vis, adjList)) return true;
                else if(i != par) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        int v = 11;
        for(int i=0; i<=v; i++) adjList.add(new ArrayList<>());

        // graph
        adjList.get(1).add(2);
        adjList.get(2).add(1);
        adjList.get(2).add(4);
        adjList.get(3).add(5);
        adjList.get(4).add(2);
        adjList.get(5).add(3);
        adjList.get(5).add(10);
        adjList.get(5).add(6);
        adjList.get(6).add(5);
        adjList.get(6).add(7);
        adjList.get(7).add(6);
        adjList.get(7).add(8);
        adjList.get(8).add(7);
        adjList.get(8).add(9);
        adjList.get(8).add(11);
        adjList.get(9).add(10);
        adjList.get(9).add(8);
        adjList.get(10).add(5);
        adjList.get(10).add(9);
        adjList.get(11).add(8);

        // visited array
        boolean[] vis = new boolean[v+1];
        Arrays.fill(vis, false);

        boolean detected = false;

        for(int i=1; i<=v; i++) {
            if(!vis[i]) {
                if(checkCycleDFS(i,-1, vis, adjList)) detected = true;
            }
        }

        if(detected) System.out.println("Detected");
        else System.out.println("Not detected");
    }
}
