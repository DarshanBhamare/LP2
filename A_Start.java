import java.util.*;

public class A_Start {
    static class Node {
        String name;
        int g; // cost from start
        int h; // heuristic
        int f; // total cost
        Node(String name, int g, int h) {
            this.name = name;
            this.g = g;
            this.h = h;
            this.f = g + h;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Node> pq =
                new PriorityQueue<>((a, b) -> a.f - b.f);
        // Add nodes
        pq.add(new Node("A", 0, 10));
        pq.add(new Node("B", 4, 6));
        pq.add(new Node("C", 3, 7));
        pq.add(new Node("D", 5, 2));
        pq.add(new Node("Goal", 7, 0));
        System.out.println("A* Search Path:");
        while (!pq.isEmpty()) {
            Node current = pq.poll();
            System.out.println(
                    current.name +
                    " -> f(n)=" + current.f);
            if (current.name.equals("Goal")) {
                System.out.println("Goal Reached");
                break;
            }
        }
    }
}



// import java.util.*;
// public class A_Start {
//     static class Pair {
//         String node;
//         int g;
//         int h;
//         int f;
//         String path;
//         Pair(String node, int g, int h, String path) {
//             this.node = node;
//             this.g = g;
//             this.h = h;
//             this.f = g + h;
//             this.path = path;
//         }
//     }
//     public static void main(String[] args) {
//         // Graph
//         HashMap<String, List<String>> graph = new HashMap<>();

//         graph.put("A", Arrays.asList("B", "C"));
//         graph.put("B", Arrays.asList("D"));
//         graph.put("C", Arrays.asList("D"));
//         graph.put("D", Arrays.asList("Goal"));
//         graph.put("Goal", new ArrayList<>());

//         // Heuristic values
//         HashMap<String, Integer> h = new HashMap<>();

//         h.put("A", 10);
//         h.put("B", 6);
//         h.put("C", 7);
//         h.put("D", 2);
//         h.put("Goal", 0);

//         // Priority Queue
//         PriorityQueue<Pair> pq =
//                 new PriorityQueue<>((a, b) -> a.f - b.f);

//         // Start node
//         pq.add(new Pair("A", 0, h.get("A"), "A"));

//         Set<String> visited = new HashSet<>();

//         while (!pq.isEmpty()) {

//             Pair current = pq.poll();

//             // Skip visited node
//             if (visited.contains(current.node))
//                 continue;

//             visited.add(current.node);

//             System.out.println(
//                     "Visited: " + current.node +
//                     " Path: " + current.path +
//                     " f=" + current.f);

//             // Goal found
//             if (current.node.equals("Goal")) {

//                 System.out.println("\nGoal Reached");
//                 System.out.println("Final Path: " + current.path);

//                 break;
//             }

//             // Visit neighbors
//             for (String neighbor : graph.get(current.node)) {

//                 if (!visited.contains(neighbor)) {

//                     int newG = current.g + 1;

//                     pq.add(new Pair(
//                             neighbor,
//                             newG,
//                             h.get(neighbor),
//                             current.path + " -> " + neighbor
//                     ));
//                 }
//             }
//         }
//     }
// }





