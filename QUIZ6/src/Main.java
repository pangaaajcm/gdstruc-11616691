public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insert(25);
        tree.insert(17);
        tree.insert(29);
        tree.insert(10);
        tree.insert(16);
        tree.insert(-5);
        tree.insert(60);
        tree.insert(55);

        System.out.println("Ascending Order: ");
        tree.traverseInOrder();
        System.out.println("\nDescending Order: ");
        tree.Desc();

        System.out.println("\nLowest Value: " + tree.getMin(-5));
        System.out.println("\nHighest Value: "+ tree.getMax(60));
    }}
