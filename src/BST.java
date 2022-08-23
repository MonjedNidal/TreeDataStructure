public class BST {

    Node root;

    BST(){
        root = null;
    }

    public void printInOrder(){
        if (root!= null){
            printInOrderRec(root);
        }else {
            System.out.println("Empty tree!");
        }
    }
    private void printInOrderRec(Node root){
        if (root != null){
            printInOrderRec(root.left);
            System.out.println(root.data);
            printInOrderRec(root.right);
        }
    }
    public void printPreOrder(){
        if (root!= null){
            printPreOrderRec(root);
        }else {
            System.out.println("Empty tree!");
        }
    }
    private void printPreOrderRec(Node root){
        if (root != null){
            System.out.println(root.data);
            printPreOrderRec(root.left);
            printPreOrderRec(root.right);
        }
    }
    public void printPostOrder(){
        if (root!= null){
            printPostOrderRec(root);
        }else {
            System.out.println("Empty tree!");
        }
    }
    private void printPostOrderRec(Node root){
        if (root != null){
            printPostOrderRec(root.left);
            printPostOrderRec(root.right);
            System.out.println(root.data);
        }
    }

    public void find(int key){
        if (root == null){
            System.out.println("Tree is empty!");
        } else if (findRec(root, key)) {
            System.out.println("Found!");
        }else {
            System.out.println("Not Found");
        }
    }
    public boolean findRec(Node root, int key) {
        if(root == null){
            return false;
        }
        if (root.data == key){
            return true;
        } else if (root.data < key) {
            return findRec(root.right, key);
        }else {
            return findRec(root.left, key);
        }
    }

    public void insert(Node node){
        if (root == null){
            root = node;
        }else {
            insertRec(root,node);
        }
    }

    private void insertRec(Node root, Node node) {
        if (node.data < root.data){
            if (root.left == null){
                root.left = node;
            }else {
                insertRec(root.left, node);
            }
        }else {
            if (root.right == null){
                root.right = node;
            }else {
                insertRec(root.right, node);
            }
        }
    }

}
