/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package picoada;

/**
 *
 * @author David
 */
public class Funcion {

    public String id = "";
    public String tipo = null;
    public String type = "";

    Funcion() {

    }

    Funcion(String id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Funcion{" + "id=" + id + ", tipo=" + tipo + ", type=" + type + '}';
    }

}
