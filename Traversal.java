import java.util.*;
import java.util.ArrayList;

public class Traversal
{

    private final int N;
    private final List<List<Integer>>  graph;

    public Traversal(int nodes)
    {
        this.N = nodes;
        this.graph = new ArrayList<>(nodes);

        for(int i = 0; i < nodes; i++) {
            this.graph.add(new ArrayList<Integer>());

        }

    }


    public void constructGraph(int src, int dest) 
    {
        graph.get(src).add(dest);
        graph.get(dest).add(src);

    }

    public void BFS(int startNode)
    {
        boolean[] vistied = new boolean[N];

        Queue<Integer> queue = new LinkedList<>();

        vistied[startNode] = true;
        queue.add(startNode);

        while(!queue.isEmpty())
        {
            int currNode = queue.poll();
            System.out.print(currNode + " ");

            for(int neighbor : graph.get(currNode))
            {
                if(!vistied[neighbor])
                {
                    vistied[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }

    }

    public void DFSRecursive(int startNode, boolean[] visited)
    {
        visited[startNode] = true;
        System.out.print(startNode + " ");

        for(int neighbor : graph.get(startNode))
        {
            if(!visited[neighbor])
            {
                DFSRecursive(neighbor, visited);
            }
        }
    }

    public void DFSIterative(int startNode)
    {
        boolean[] visited = new boolean[N];
        Stack<Integer> stack = new Stack<>();

        stack.push(startNode);

        while(!stack.isEmpty())
        {
            int currNode = stack.pop();

            if(!visited[currNode])
            {
                visited[currNode] = true;
                System.out.print(currNode + " ");

                for(int neighbor : graph.get(currNode))
                {
                    if(!visited[neighbor])
                    {
                        stack.push(neighbor);
                    }
                }
            }
        }
    }




    public static void main(String[] args)
    {
        Traversal t = new Traversal(5);
        t.constructGraph(0, 1);
        t.constructGraph(0, 2);
        t.constructGraph(1, 3);
        t.constructGraph(2, 4);
        t.constructGraph(3, 4);
        t.BFS(0);   
        System.out.println();
        t.DFSRecursive(0, new boolean[5]);
        System.out.println();
        t.DFSIterative(0);
    }
}