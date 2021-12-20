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
    public int offset = 0;

    Ambitos(String NombreAmbito) {
        this.NombreAmbito = NombreAmbito;
        this.TablaSimbolos = new HashMap<String, Valor>();
        this.TablaFunciones = new HashMap<String, Funcion>();
    }

    public boolean agregarValor(String key, Valor value) {
        int cur_offset = 0;
        if (value.type.equals("TypeInteger")) {
            cur_offset = 4;
        } else if (value.type.equals("TypeFloat")) {
            cur_offset = 8;
        } else if (value.type.equals("TypeBoolean")) {
            cur_offset = 1;
        }
        this.offset += cur_offset;
        value.offset = this.offset;
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

    public Valor getValor(String key) {
        if (this.TablaSimbolos.get(key) != null) {
            return (Valor) this.TablaSimbolos.get(key);
        } else {
            Ambitos papa = this.padre;
            while (papa != null) {
                Object v = papa.getValor(key);
                if (v != null) {
                    return (Valor) v;
                } else {
                    papa = papa.padre;
                }
            }
        }
        return null;
    }

    public Funcion getFuncion(String key) {
        if (this.TablaFunciones.get(key) != null) {
            return (Funcion) this.TablaFunciones.get(key);
        } else {
            Ambitos papa = this.padre;
            while (papa != null) {
                Object v = papa.getFuncion(key);
                if (v != null) {
                    return (Funcion) v;
                } else {
                    papa = papa.padre;
                }
            }
        }
        return null;
    }

    public Funcion getFuncionLLamada(String key) {
        for (Object f : this.TablaFunciones.values()) {
            Funcion F = (Funcion) f;
            String id = "%s|%s".formatted(F.id, F.type.substring(0, F.type.indexOf("->")));
            if (key.equals(id)) {
                return F;
            }
        }
        Ambitos papa = this.padre;
        while (papa != null) {
            Object v = papa.getFuncionLLamada(key);
            if (v != null) {
                return (Funcion) v;
            } else {
                papa = papa.padre;
            }
        }
        return null;
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
