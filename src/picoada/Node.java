package picoada;

import java.util.ArrayList;
//nodos de los arboles

public class Node {

    public String valor;
    public int idNode;
    public ArrayList<Node> hijos = new ArrayList<>();
    public Node padre;

    //Intermedio
    public String siguiente;
    public String comienzo;
    public String verdadero;
    public String falso;

    Node() {
    }

    Node(String valor, int ref) {
        this.valor = valor;
        this.idNode = ref;
    }

    //Getters y setters
    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    public void setID(int id) {
        this.idNode = id;
    }

    public int getID() {
        return idNode;
    }

    public ArrayList<Node> getHijos() {
        return hijos;
    }

    public Node getHijo(int num) {
        return hijos.get(num);
    }

    public void addHijos(ArrayList<Node> n) {
        for (Node nodo : n) {
            nodo.setPadre(this);
        }
        hijos.addAll(n);
    }

    //FUnciones importantes
    public void addHijo(Node hijo) {
        hijo.setPadre(this);
        hijos.add(hijo);
    }

    public void addHijo(String valor, int ref) {
        Node node = new Node(valor, ref);
        node.setPadre(this);
        hijos.add(node);
    }

    public void setPadre(Node n) {
        this.padre = n;
    }

    // Intermedio 
    public void setComienzo(String comienzo) {
        this.comienzo = comienzo;
    }

    public String getComienzo() {
        return this.comienzo;
    }

    public void setSiguiente(String etiq) {
        this.siguiente = etiq;
    }

    public String getSiguiente() {
        return this.siguiente;
    }

    public void setVerdadero(String verdadero) {
        this.verdadero = verdadero;
    }

    public String getVerdadero() {
        return verdadero;
    }

    public void setFalso(String falso) {
        this.falso = falso;
    }

    public String getFalso() {
        return falso;
    }

    public void recorrido(Node root, int espacio) {
        if (!root.hijos.isEmpty()) {
            for (int i = 0; i < espacio; i++) {
                System.out.print("····");
            }
            System.out.println(root);

            recorrido(root.hijos.get(0), espacio + 1);
            for (int i = 1; i < root.hijos.size(); i++) {
                recorrido(root.hijos.get(i), espacio + 1);
            }
        } else {
            for (int i = 0; i < espacio; i++) {
                System.out.print("····");
            }
            System.out.println(root);
        }
    }

    @Override
    public String toString() {
        return "ID Nodo: " + idNode + " | Valor: " + valor;
    }
}
