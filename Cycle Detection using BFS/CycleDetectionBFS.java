
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
// UNDIRECTED GRAPH

class Node {
    int first, second;
    Node(int first, int second) {
        this.first = first;
        this.second = second;
    }
}


public class CycleDetectionBFS {

    public static boolean checkCycle(int node, boolean[] vis, ArrayList<ArrayList<Integer>> adjList) {
        // same as bfs, only change is add <node, parent> in queue instead of only node
        // condition - if adj ele is not visited and is not equal to parent then cycle detected

        Queue<Node> q = new LinkedList<>();
        q.add(new Node(node, -1));
        vis[node] = true;

        while(!q.isEmpty()) {
            int no = q.peek().first;
            int par = q.peek().second;

            for(Integer i : adjList.get(no)) {
                if(!vis[i]) {
                    vis[i] = true;
                    q.add(new Node(i, no));
                } else if(i != par) return true;
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

        boolean detected = false;

        for(int i=1; i<=v; i++) {
            if(!vis[i]) {
                if(checkCycle(i, vis, adjList)) detected = true;
            }
        }

        if(detected) System.out.println("Detected");
        else System.out.println("Not detected");
    }
}
