public class BST {

    Node root;

    BST(){
        root = null;
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
