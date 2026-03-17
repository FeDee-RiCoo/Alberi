# Alberi

##  Cos’è un albero
Un **albero** è una struttura dati gerarchica composta da **nodi** collegati tra loro.

- Esiste un nodo principale chiamato **radice (root)**
- Ogni nodo può avere **figli (children)**
- Non ci sono cicli (non puoi tornare indietro formando un loop)

---

## 🔹 Terminologia importante

- **Nodo (node)** → elemento dell’albero  
- **Radice (root)** → nodo iniziale  
- **Foglia (leaf)** → nodo senza figli  
- **Padre (parent)** → nodo che ha figli  
- **Figlio (child)** → nodo derivato da un altro  
- **Sottoalbero (subtree)** → porzione di albero  
- **Profondità (depth)** → distanza dalla radice  
- **Altezza (height)** → lunghezza del percorso massimo verso una foglia  

---

##  Tipi di alberi

### 1. Albero generico
Ogni nodo può avere un numero qualsiasi di figli.

### 2. Albero binario
Ogni nodo ha **al massimo 2 figli**:
- sinistro
- destro

### 3. Albero binario di ricerca (BST)
Un albero binario con una regola:
- valori a sinistra < nodo
- valori a destra > nodo

Serve per **ricerca veloce**.

---

##  Visite (Traversal)

### 🔹 In profondità (DFS)

- **Pre-order** → nodo → sinistra → destra  
- **In-order** → sinistra → nodo → destra  
- **Post-order** → sinistra → destra → nodo  

> In un BST, l’**in-order** restituisce i valori ordinati.

---

###  In ampiezza (BFS)
Visita livello per livello.

---

##  Operazioni principali

- Inserimento
- Ricerca
- Cancellazione
- Attraversamento (visita)

---

##  Complessità

Dipende dall’altezza dell’albero:

- Migliore (bilanciato): **O(log n)**
- Peggiore (sbilanciato): **O(n)**

---

##  Alberi bilanciati

Esempi:
- AVL
- Red-Black

> Mantengono l’altezza bassa → operazioni più veloci

---

##  A cosa servono

- Strutture dati efficienti
- Database (indici)
- File system
- Intelligenza artificiale e grafi
