public class Main {
    public static void main(String[] args) {
        BST tree = new BST();

        tree.insert(new Node(50));
        tree.insert(new Node(10));
        tree.insert(new Node(2));
        tree.insert(new Node(100));
        tree.insert(new Node(70));
        tree.insert(new Node(12));
        tree.insert(new Node(18));

        tree.find(187);
//        tree.printInOrder(tree.root);
        tree.printPostOrder();
    }
}
