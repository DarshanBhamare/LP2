// Graph Coloring using Greedy Algorithm in Java

import java.util.*;

public class Graph_Color {

    static void greedyColoring(int graph[][], int V) {

        int result[] = new int[V];

        // Initialize all vertices as unassigned
        Arrays.fill(result, -1);

        // Assign first color to first vertex
        result[0] = 0;

        // Temporary array to store available colors
        boolean available[] = new boolean[V];

        Arrays.fill(available, true);

        // Assign colors to remaining vertices
        for (int u = 1; u < V; u++) {

            // Process all adjacent vertices
            for (int i = 0; i < V; i++) {
                if (graph[u][i] == 1 && result[i] != -1) {
                    available[result[i]] = false;
                }
            }

            // Find first available color
            int color;
            for (color = 0; color < V; color++) {
                if (available[color]) {
                    break;
                }
            }

            result[u] = color;

            // Reset available array
            Arrays.fill(available, true);
        }

        // Print result
        System.out.println("Vertex \t Color");

        for (int u = 0; u < V; u++) {
            System.out.println(u + " \t\t " + result[u]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int V = sc.nextInt();

        int graph[][] = new int[V][V];

        System.out.println("Enter adjacency matrix:");

        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                graph[i][j] = sc.nextInt();
            }
        }

        greedyColoring(graph, V);

        sc.close();
    }
}