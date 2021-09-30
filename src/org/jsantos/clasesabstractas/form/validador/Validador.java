package org.jsantos.clasesabstractas.form.validador;

abstract public class Validador {

    protected String mensaje;



    public abstract void setMensaje(String mensaje);
    public abstract String getMensaje();

    abstract public boolean esValido(String valor);
}
