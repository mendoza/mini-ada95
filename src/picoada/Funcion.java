/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package picoada;

import java.util.ArrayList;
import java.util.Arrays;

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
    
    public ArrayList<String> getParams (String x) {
        String[] parametros = this.type.substring(0,type.indexOf("->")).split("X");
        ArrayList<String> tempParams = new ArrayList<> (Arrays.asList(parametros));
        return tempParams;
    }

    @Override
    public String toString() {
        return "Funcion{" + "id=" + id + ", tipo=" + tipo + ", type=" + type + '}';
    }

}
