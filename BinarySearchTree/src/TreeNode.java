public class TreeNode {

    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    // constructor
    public TreeNode(int data){
        this.data = data;
    }

    // Binary Search Tree Insertion : Insert a node

    public void insert(int value){

        if(value == data){
            return;
        }

        if(value < data){

            if(leftChild == null){
                leftChild = new TreeNode(value);
            }else{

                leftChild.insert(value);
            }
        }else{
            if(rightChild == null){
                rightChild = new TreeNode(value);
            }else{
                rightChild.insert(value);
            }
        }
    }

    // In Order Traversal of BST

    public void traverseInOrder(){

        if(leftChild != null){

            leftChild.traverseInOrder();
        }
        System.out.print(data + ",");



        if(rightChild != null){
            rightChild.traverseInOrder();
        }
    }

    //ToDO: Pre-order traversal

    //ToDO: Post-order traversal

    //ToDO: levels traversal

    // get a node data
    public TreeNode get(int value){

        if(value == data){
            return this;
        }

        if(value < data){
            if(leftChild != null){
                return leftChild.get(value);
            }
        }else {
            if(rightChild != null){
                return rightChild.get(value);
            }
        }

        return null;
    }
    //Getters and Setters
    public int getData() {
        return data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    // Min value in a tree
    public int min(){

        if(leftChild == null){
            return data;
        }else{
            return leftChild.min();
        }
    }

    // Max value in a tree
    public int max(){

        if(rightChild == null){
            return data;
        }else{
            return rightChild.max();
        }

    }

    @Override
    public String toString() {
        return "data=" + data;

    }
}
