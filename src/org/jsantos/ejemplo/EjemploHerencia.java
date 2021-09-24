package org.jsantos.ejemplo;

import org.jsantos.pooherencia.*;


public class EjemploHerencia {

    public static void main(String[] args) {

        System.out.println("============Creando instancia Alumno=====");
        Alumno alumno = new Alumno();
        alumno.setNombre("Andres");
        alumno.setApellido("Guzman");
        alumno.setInstituto("Instituto Nacional");
        alumno.setNotaCiencias(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematicas(4.9);


        System.out.println("=========Creeando instancia Alumno Internacional====");
        AlumnoInternacional alumnoInt = new AlumnoInternacional();
        alumnoInt.setNombre("Peter");
        alumnoInt.setApellido("Gosling");
        alumnoInt.setPais("Australia");
        alumnoInt.setInstituto("Instituto Nacional");
        alumnoInt.setEdad(15);
        alumnoInt.setNotaIdiomas(7.5);
        alumnoInt.setNotaCiencias(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematicas(6.5);


        System.out.println("=======Creando instancia Profesor");

        Profesor profesor = new Profesor();
        profesor.setNombre("Lucia");
        profesor.setApellido("Perez");
        profesor.setAsignatura("matematicas");


        System.out.println("=======   ========");
        System.out.println(alumno.getNombre()+ " "+ alumno.getApellido());
        System.out.println(alumnoInt.getNombre()+ " "+alumnoInt.getApellido()+
                " "+ alumnoInt.getInstituto()+" "+ alumnoInt.getPais());
        System.out.println("profesor: " +profesor.getNombre()+ " "+ profesor.getApellido()
        + " " +profesor.getAsignatura());

        Class clase = alumnoInt.getClass();

        while(clase.getSuperclass() != null){
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija + "Es una clase de hija de la clase padre "+ padre);
            clase = clase.getSuperclass();
        }
    }
}
