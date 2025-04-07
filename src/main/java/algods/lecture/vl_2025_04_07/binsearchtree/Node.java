package algods.lecture.vl_2025_04_07.binsearchtree;

import java.util.ArrayList;
import java.util.List;

public class Node {

    public int value;
    public int height;

    public Node left;
    public Node right;

    public Node() {
        value = 0;
        height = 0;

        left = null;
        right = null;
    }

    public boolean isEmpty() {
        return left == null && right == null;
    }

    public void add(int value) {
        if (this.isEmpty()) {
            this.value = value;
            left = new Node();
            right = new Node();
            height = 1;
            return;
        }

        if (value < this.value) {
            left.add(value);
            left = rotate(left);
        } else {
            right.add(value);
            right = rotate(right);
        }

        this.height = Math.max(left.height, right.height) + 1;

    }

    public List<Integer> elementsInOrder() {
        List<Integer> result = new ArrayList<>();

        if (this.isEmpty()) {
            return result;
        }

        result.addAll(left.elementsInOrder());
        result.add(value);
        result.addAll(right.elementsInOrder());

        return result;
    }

    public List<Integer> elementsPreOrder() {
        List<Integer> result = new ArrayList<>();

        if (this.isEmpty()) {
            return result;
        }

        result.add(value);
        result.addAll(left.elementsPreOrder());
        result.addAll(right.elementsPreOrder());

        return result;
    }

    public int height() {
        return this.height;
        // if (this.isEmpty()) {
        // return 0;
        // }

        // return Math.max(left.height(), right.height()) + 1;
    }

    public int balance() {
        if (this.isEmpty()) {
            return 0;
        }

        return right.height() - left.height();
    }

    public static Node rotate(Node root) {
        int bf = root.balance();
        if (bf == -2) {
            if (root.left.balance() == -1) {
                return rotateRight(root);
            } else {
                return rotateLeftRight(root);
            }
        } else if (bf == 2) {
            if (root.right.balance() == 1) {
                return rotateLeft(root);
            } else {
                return rotateRightLeft(root);
            }
        }
        return root;
    }

    public static Node rotateRight(Node root) {
        Node A = root;
        Node B = root.left;
        // Node C = root.right;
        // Node D = B.left;
        Node E = B.right;

        B.right = A;
        A.left = E;

        return B;
    }

    public static Node rotateLeft(Node root) {
        Node B = root;
        // Node D = B.left;
        Node A = B.right;
        Node E = A.left;
        // Node C = A.right;

        A.left = B;
        B.right = E;

        return A;
    }

    public static Node rotateLeftRight(Node root) {
        root.left = rotateLeft(root.left);
        return rotateRight(root);
    }

    public static Node rotateRightLeft(Node root) {
        root.right = rotateRight(root.right);
        return rotateLeft(root);
    }
}
