import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        int n = 4;
        for(int i=0; i<n; i++) adjList.add(new ArrayList<>());

        // adding edges

        adjList.get(2).add(0);
        adjList.get(2).add(3);

        adjList.get(0).add(2);
        adjList.get(0).add(1);

        adjList.get(1).add(2);

        adjList.get(3).add(3);

        // list to store traversal
        ArrayList<Integer> trs = new ArrayList<>();

        // visited array
        int[] vis = new int[n];

        // loop through all nodes to cover all components of graph
        for(int i=0; i<n; i++) {
            // if not visited, add in q and mark visited
            if(vis[i] == 0) {
                Queue<Integer> q = new LinkedList<>();
                q.add(i);
                vis[i] = 1;
                // remove till q is not empty
                while(!q.isEmpty()) {
                    Integer ele = q.poll();
                    trs.add(ele);
                    // explore adjacent elements
                    ArrayList<Integer> list = adjList.get(ele);

                    // traverse adjacent list
                    for(Integer adjEle : list) {
                        if(vis[adjEle] == 0) {
                            q.add(adjEle);
                            vis[adjEle] = 1;
                        }
                    }
                }
            }
        }

        for(Integer i : trs) System.out.print(i+" ");
    }
}
