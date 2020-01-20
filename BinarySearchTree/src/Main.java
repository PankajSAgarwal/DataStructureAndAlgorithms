public class Main {

    public static void main(String[] args) {
        Tree intTree = new Tree();

        intTree.insert(25);
        intTree.insert(20);
        intTree.insert(15);
        intTree.insert(27);
        intTree.insert(30);
        intTree.insert(29);
        intTree.insert(26);
        intTree.insert(22);
        intTree.insert(32);
        intTree.insert(17);

        intTree.traverseInOrder();
        System.out.println();

        //intTree.delete(15);
        // deleting a leaf node
//        intTree.delete(17);
//        intTree.delete(27);

        // deleting the root

        //intTree.delete(25);
        // deleting A node that is not present
        intTree.delete(8888);


        intTree.traverseInOrder();
        System.out.println();



//        System.out.println(intTree.get(27));
//        System.out.println(intTree.get(25));
//        System.out.println(intTree.get(888));
//
//        System.out.println("Min Value = " + intTree.min());
//        System.out.println("Max Value = " + intTree.max());
    }
}
