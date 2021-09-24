package org.jsantos.pooherencia;

public class Profesor extends Persona{

    private String asignatura;

    //COnstructor

    public Profesor(){
        System.out.println("profesor: Inicializando un constructor...");
    }

    public Profesor(String nombre, String apellido){
        super(nombre,apellido);
    }

    public Profesor(String nombre, String apellido, String asignatura){
        super(nombre,apellido);
        this.asignatura = asignatura;
    }




    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    //


    @Override
    public String saludar() {
        return "Buenos dias soy el profesor " + getNombre()+
                " de " + getAsignatura();
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nasignatura='" + asignatura + '\'';
    }
}
