package Alghorithms;


public class BellmanFord {
    static class Edge {
        int source = 0;
        int destination = 0;
        int weight = 0;
    }

    static class Graph {
        int V;
        int E;
        Edge[] edge;

        public Graph(int vertices, int edges) {
            this.V = vertices;
            this.E = edges;
            this.edge = new Edge[edges];
            for (int i = 0; i < edges; i++) {
                edge[i] = new Edge();
            }
        }

        void bellmanFord(Graph graph) {
            int source = 0;
            int vertices = graph.V;
            int edges = graph.E;
            int[] distance = new int[vertices];
            for (int i = 0; i < vertices; i++) {
                distance[i] = Integer.MAX_VALUE;
                distance[source] = 0;
            }
            for (int i = 0; i < vertices; i++) {
                for (int j = 0; j < E; j++) {
                    int y = graph.edge[j].source;
                    int z = graph.edge[j].destination;
                    int weight = graph.edge[j].weight;
                    if (distance[y] != Integer.MAX_VALUE &&
                            distance[y] + weight < distance[z])
                        distance[z] = distance[y] + weight;
                }
            }
            for (int i = 0; i < edges; i++) {
                int y = graph.edge[i].source;
                int z = graph.edge[i].destination;
                int weight = graph.edge[i].weight;
                if (distance[y] != Integer.MAX_VALUE &&
                        distance[y] + weight < distance[z]) {
                    System.out.println("Graph contains negative Vertices");
                    return;
                }
            }
            System.out.println("Vertices \t Distance from Source");
            for (int i = 0; i < V; ++i)
                System.out.println(i + "\t\t\t " + distance[i]);
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(5, 8);

        // add edge 0-1
        graph.edge[0].source = 0;
        graph.edge[0].destination = 1;
        graph.edge[0].weight = -1;

        // add edge 0-2
        graph.edge[1].source = 0;
        graph.edge[1].destination = 2;
        graph.edge[1].weight = 4;

        // add edge 1-2
        graph.edge[2].source = 1;
        graph.edge[2].destination = 2;
        graph.edge[2].weight = 3;

        // add edge 1-3
        graph.edge[3].source = 1;
        graph.edge[3].destination = 3;
        graph.edge[3].weight = 2;

        // add edge 1-4
        graph.edge[4].source = 1;
        graph.edge[4].destination = 4;
        graph.edge[4].weight = 2;

        // add edge 3-2
        graph.edge[5].source = 3;
        graph.edge[5].destination = 2;
        graph.edge[5].weight = 5;

        // add edge 3-1
        graph.edge[6].source = 3;
        graph.edge[6].destination = 1;
        graph.edge[6].weight = 1;

        // add edge 4-3
        graph.edge[7].source = 4;
        graph.edge[7].destination = 3;
        graph.edge[7].weight = -3;

        graph.bellmanFord(graph);
    }
}


