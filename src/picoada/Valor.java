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
public class Valor {

    public String type = "";
    public int offset = -1;
    public String id = "";
    public String tipo = null;

    Valor(String id, String type) {
        this.id = id;
        this.type = type;
        this.offset = -1;
    }

    Valor(String id, String type, String tipo) {
        this.id = id;
        this.type = type;
        this.offset = -1;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Valor{" + "type=" + type + ", offset=" + offset + ", id=" + id + ", tipo=" + tipo + '}';
    }

}
