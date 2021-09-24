package org.jsantos.ejemplo;

import org.jsantos.pooherencia.Alumno;
import org.jsantos.pooherencia.AlumnoInternacional;
import org.jsantos.pooherencia.Persona;
import org.jsantos.pooherencia.Profesor;


public class EjemploHerenciaTooString {

    public static void main(String[] args) {

        System.out.println("============Creando instancia Alumno=====");
        Alumno alumno = new Alumno("Andres","Guzman",15,"Instituto Nacional");
        alumno.setNotaCiencias(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematicas(4.9);
        alumno.setEmail("andres@gmail.com");


        System.out.println("=========Creeando instancia Alumno Internacional====");
        AlumnoInternacional alumnoInt = new AlumnoInternacional("Peter","Gosling","Australia");
        alumnoInt.setEdad(15);
        alumnoInt.setInstituto("Instituto Nacional");
        alumnoInt.setNotaIdiomas(7.5);
        alumnoInt.setNotaCiencias(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematicas(6.5);
        alumnoInt.setEmail("peter@gmail.com");


        System.out.println("=======Creando instancia Profesor==========");

        Profesor profesor = new Profesor("Lucia","Perez","matematicas");
        profesor.setEdad(24);
        profesor.setEmail("lupita@outlook.com");

        imprimir(alumno);
        imprimir(alumnoInt);
        imprimir(profesor);



    }

    public static void imprimir(Persona persona){
        System.out.println("=====================================");
        System.out.println(persona);
    }
}
