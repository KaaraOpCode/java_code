
import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

public class GraphsAdjecencyMatrix {
    Node root;

    GraphsAdjecencyMatrix() {
        root = null;
    }

    void insert(int key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.data)
            root.left = insertRec(root.left, key);
        else if (key > root.data)
            root.right = insertRec(root.right, key);
        return root;
    }

    void adjacencyMatrix() {
        boolean[][] matrix = new boolean[4][4];
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                matrix[i][j] = false;

        adjacencyMatrixBFS(root, matrix);

        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print((matrix[i][j] ? 1 : 0) + " ");
            }
            System.out.println();
        }
    }

    void adjacencyMatrixBFS(Node root, boolean[][] matrix) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            if (current.left != null) {
                matrix[current.data][current.left.data] = true;
                queue.add(current.left);
            }
            if (current.right != null) {
                matrix[current.data][current.right.data] = true;
                queue.add(current.right);
            }
        }
    }

    public static void main(String[] args) {
        GraphsAdjecencyMatrix g = new GraphsAdjecencyMatrix();
        g.insert(1);
        g.insert(2);
        g.insert(3);
        g.insert(4);

        g.adjacencyMatrix();
    }
}
