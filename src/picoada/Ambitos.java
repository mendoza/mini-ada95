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

    public String NombreAmbito = "";
    public ArrayList<Ambitos> hijos = new ArrayList<>();
    public Ambitos padre;

    Ambitos(String NombreAmbito) {
        this.NombreAmbito = NombreAmbito;
        this.TablaSimbolos = new HashMap<String, Valor>();
    }

    public boolean agregarValor(String key, Valor value) {
        if (this.TablaSimbolos.get(key) == null) {
            this.TablaSimbolos.put(key, value);
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

    @Override
    public String toString() {
        return "Ambito: " + this.NombreAmbito + " Valores: " + this.TablaSimbolos + " hijos: " + this.hijos.size();
    }
}
