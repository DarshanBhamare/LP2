// 1. Implement depth first search algorithm and Breadth First Search algorithm, Use an undirected
// graph and develop a recursive algorithm for searching all the vertices of a graph or tree data
// structure.
import java.util.*;
public class DFS_BFS{
    public static void bfs(int start,ArrayList<ArrayList<Integer>>adjlist,boolean[]visit_bfs){
        Queue<Integer>q=new LinkedList<>();
        q.add(start);
        visit_bfs[start]=true;
        while(!q.isEmpty()){
            int node=q.poll();
            System.out.print(node+" ");
            for(int neighbour:adjlist.get(node)){
                if(!visit_bfs[neighbour]){
                    q.add(neighbour);
                    visit_bfs[neighbour]=true;
                }
            }
        }
    }
    public static void dfs(int start,ArrayList<ArrayList<Integer>>adjlist,boolean[]visit_dfs){
        visit_dfs[start]=true;
        System.out.print(start+" ");
        for(int neighbour:adjlist.get(start)){
            if(!visit_dfs[neighbour]){
                dfs(neighbour,adjlist,visit_dfs);
            }
        }

    }
    public static void main(String[]args){
        int vertices=7;
        ArrayList<ArrayList<Integer>>adjlist=new ArrayList<>();
        for(int i=0;i<vertices;i++){
            adjlist.add(new ArrayList<>());
        }
        adjlist.get(0).add(1);
        adjlist.get(1).add(0);
        adjlist.get(0).add(2);
        adjlist.get(2).add(0);
        adjlist.get(1).add(3);
        adjlist.get(3).add(1);
        adjlist.get(1).add(4);
        adjlist.get(4).add(1);
        adjlist.get(2).add(5);
        adjlist.get(5).add(2);
        adjlist.get(2).add(6);
        adjlist.get(6).add(2);
        //BFS
        System.out.println("BFS:");
        boolean[]visite_bfs=new boolean[vertices];
        bfs(0,adjlist,visite_bfs);
        //DFS
        System.out.println("\nDFS:");
        boolean[]visite_dfs=new boolean[vertices];  
        dfs(0,adjlist,visite_dfs);
    }
}