import java.util.*;

public class BinaryTree {

    Node root;

    public BinaryTree(Node root) {
        this.root = root;
    }

    /**
     * Calcola il livello di un nodo risalendo fino alla radice.
     * La root è al livello 1.
     * @param n nodo di cui calcolare il livello
     * @return livello del nodo
     */
    public int calcolaLivello(Node n) {
        int livello = 1; // la root è livello 1

        // risalgo fino alla root usando il parent
        while (n.parent != null) {
            livello++;
            n = n.parent;
        }

        return livello;
    }

    /**
     * Restituisce il percorso tra due nodi passando per il loro antenato comune.
     * Il percorso può includere risalite e discese nell'albero.
     * @param start nodo di partenza, @param end nodo di arrivo
     * @return stringa con il percorso (es. "3 -> 5 -> 10")
     */
    public String mostraPercorso(Node start, Node end) {

        // Lista per salvare il percorso da start alla root
        List<Node> pathStart = new ArrayList<>();

        // Lista per salvare il percorso da end alla root
        List<Node> pathEnd = new ArrayList<>();

        // riempiamo i percorsi risalendo
        Node temp = start;
        while (temp != null) {
            pathStart.add(temp);
            temp = temp.parent;
        }

        temp = end;
        while (temp != null) {
            pathEnd.add(temp);
            temp = temp.parent;
        }

        // troviamo il nodo comune più vicino (LCA)
        int i = pathStart.size() - 1;
        int j = pathEnd.size() - 1;

        Node lca = null; // Lowest Common Ancestor

        while (i >= 0 && j >= 0 && pathStart.get(i) == pathEnd.get(j)) {
            lca = pathStart.get(i);
            i--;
            j--;
        }

        // costruiamo il percorso finale
        StringBuilder result = new StringBuilder();

        // da start fino al LCA
        for (int k = 0; k <= i + 1; k++) {
            result.append(pathStart.get(k).value).append(" -> ");
        }

        // da LCA fino a end (al contrario)
        Stack<Node> stack = new Stack<>();
        for (int k = 0; k <= j + 1; k++) {
            stack.push(pathEnd.get(k));
        }

        // togliamo il LCA duplicato
        if (!stack.isEmpty()) stack.pop();

        while (!stack.isEmpty()) {
            result.append(stack.pop().value);
            if (!stack.isEmpty()) result.append(" -> ");
        }

        return result.toString();
    }
}