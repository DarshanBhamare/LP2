import java.util.*;
public class Single_Source_Shortest_Dijkstra {
    static class pair{
        int vertex;
        int weight;
        pair(int vertex,int weight){
            this.vertex=vertex;
            this.weight=weight;
        }
    }
    public static void dijkstra(int source,ArrayList<ArrayList<pair>>adjlist,int vertices){
        PriorityQueue<pair>pq=new PriorityQueue<>((a,b)->a.weight-b.weight);
        int[]distance=new int[vertices];
        Arrays.fill(distance,Integer.MAX_VALUE);
        distance[source]=0;
        pq.add(new pair(source,0));
        while(!pq.isEmpty()){
            pair p=pq.poll();
            int node=p.vertex;
            for(pair neigh:adjlist.get(node)){
                int neighbour=neigh.vertex;
                int weight=neigh.weight;
                if(distance[node]+weight<distance[neighbour]){
                    distance[neighbour]=distance[node]+weight;
                    pq.add(new pair(neighbour,distance[neighbour]));   
                }
            }
        }
        System.out.println("Shortest Distances from source vertex "+source+":");
        for(int i=0;i<vertices;i++){
            System.out.println(source+" -> "+i+" : "+distance[i]);
        }
    }
    public static void main(String[]args){
        int vertices=5;
        ArrayList<ArrayList<pair>>adjlist=new ArrayList<>();
        for(int i=0;i<vertices;i++){
            adjlist.add(new ArrayList<>());
        }
        Scanner sc=new Scanner(System.in);
        int edges=5;
        for(int i=0;i<edges;i++){
            System.out.println("Enter Edge From to From:");
            int u=sc.nextInt();
            int v=sc.nextInt();
            System.out.println("Enter edge weight:");
            int wt=sc.nextInt();
            adjlist.get(u).add(new pair(v,wt));
            adjlist.get(v).add(new pair(u,wt));
        }

        dijkstra(0,adjlist,vertices);
    }
}
 