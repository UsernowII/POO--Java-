package org.jsantos.pooherencia;

public class Alumno extends Persona{

    private String instituto;
    private double notaMatematicas;
    private double notaCiencias;
    private double notaHistoria;

    //
    public Alumno(){
        System.out.println("Alumno: Inicializando un constructor vacio..");
    }


    public Alumno(String nombre, String apellido){
        super(nombre, apellido);

    }

    public Alumno(String nombre, String apellido, int edad){
        super(nombre, apellido, edad);

    }

    public Alumno(String nombre, String apellido, int edad, String instituto){
        super(nombre, apellido, edad);
        this.instituto = instituto;

    }

    public Alumno(String nombre, String apellido, int edad,
                  String instituto, double notaMatematicas,double notaCiencias,
                  double notaHistoria){
        this(nombre, apellido, edad,instituto);
        this.notaMatematicas = notaMatematicas;
        this.notaCiencias = notaCiencias;
        this.notaHistoria = notaHistoria;

    }




    public String getInstituto() {
        return instituto;
    }

    public void setInstituto(String instituto) {
        this.instituto = instituto;
    }

    public double getNotaMatematicas() {
        return notaMatematicas;
    }

    public void setNotaMatematicas(double notaMatematicas) {
        this.notaMatematicas = notaMatematicas;
    }

    public double getNotaCiencias() {
        return notaCiencias;
    }

    public void setNotaCiencias(double notaCiencias) {
        this.notaCiencias = notaCiencias;
    }

    public double getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }

    //
    @Override
    public String saludar(){
        String saludar = super.saludar();
        return  saludar+" soy un alumno y mi nombre es " +getNombre();
    }

    public double calcularPromedio(){
        System.out.println("Calcular promedio "+Alumno.class.getCanonicalName());
        return (notaHistoria+notaCiencias+notaCiencias)/3;
    }


    @Override
    public String toString() {
        return super.toString() + instituto + '\'' +
                ", notaMatematicas=" + notaMatematicas +
                ", notaCiencias=" + notaCiencias +
                ", notaHistoria=" + notaHistoria +
                ", promedio= "+this.calcularPromedio();
    }
}
