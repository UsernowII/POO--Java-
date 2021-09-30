package org.jsantos.poointerfaces.imprenta.modelo;

public interface Imprimible {

    default String imprimir(){
        return "Imprimiendo un valor por defecto";
    }


}
