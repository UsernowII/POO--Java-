package org.jsantos.clasesabstractas.form.validador;

public class NoNullValidador extends Validador{

    protected  String mensaje = "El campo %s no puede estar vacio";



    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;

    }

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        return (valor != null);
    }
}
