/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package picoada;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author David
 */
public class Ambitos {

    public HashMap TablaSimbolos;
    public HashMap TablaFunciones;

    public String NombreAmbito = "";
    public ArrayList<Ambitos> hijos = new ArrayList<>();
    public Ambitos padre;

    Ambitos(String NombreAmbito) {
        this.NombreAmbito = NombreAmbito;
        this.TablaSimbolos = new HashMap<String, Valor>();
        this.TablaFunciones = new HashMap<String, Funcion>();
    }

    public boolean agregarValor(String key, Valor value) {
        if (this.TablaSimbolos.get(key) == null) {
            this.TablaSimbolos.put(key, value);
            return true;
        } else {
            return false;
        }
    }

    public boolean agregarFuncion(String key, Funcion value) {
        if (this.TablaFunciones.get(key) == null) {
            this.TablaFunciones.put(key, value);
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Ambitos> getHijos() {
        return hijos;
    }

    public Ambitos getHijo(int num) {
        return hijos.get(num);
    }

    public void addHijos(ArrayList<Ambitos> n) {
        for (Ambitos nodo : n) {
            nodo.setPadre(this);
        }
        hijos.addAll(n);
    }

    //FUnciones importantes
    public void addHijo(Ambitos hijo) {
        hijo.setPadre(this);
        hijos.add(hijo);
    }

    public void addHijo(String nombre) {
        Ambitos node = new Ambitos(nombre);
        node.setPadre(this);
        hijos.add(node);
    }

    public void setPadre(Ambitos n) {
        this.padre = n;
    }

    public boolean esHoja() {
        return this.hijos.isEmpty();
    }

    public void recorrido(Ambitos root, int espacio) {
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
        return NombreAmbito + "{" + "TablaSimbolos=" + TablaSimbolos + ", TablaFunciones=" + TablaFunciones + ", hijos=" + hijos.size() + "}";
    }

}
