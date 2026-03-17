public class App {
    public static void main(String[] args) {

        // Creazione nodi
        Node root = new Node(10);
        Node n5 = new Node(5);
        Node n15 = new Node(15);
        Node n3 = new Node(3);
        Node n7 = new Node(7);

        // Collegamenti
        root.left = n5;
        root.right = n15;
        n5.parent = root;
        n15.parent = root;

        n5.left = n3;
        n5.right = n7;
        n3.parent = n5;
        n7.parent = n5;

        // Creazione albero
        BinaryTree tree = new BinaryTree(root);

        // Test calcolaLivello
        System.out.println("Livello di 7: " + tree.calcolaLivello(n7));

        // Test mostraPercorso
        System.out.println("Percorso 3 -> 15: " + tree.mostraPercorso(n3, n15));
    }
}