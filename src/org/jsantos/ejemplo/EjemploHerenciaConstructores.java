package org.jsantos.ejemplo;

import org.jsantos.pooherencia.*;



public class EjemploHerenciaConstructores {

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
        System.out.println("Imprimiendo datos en comun del tipo persona");
        System.out.println("Nombre: " +persona.getNombre()+ " Apellido: "+ persona.getApellido()
            +" Edad: " + persona.getEdad()+" email: " + persona.getEmail());

        if(persona instanceof Alumno){
            System.out.println("Imprimiendo los datos del tipo Alumno");
            System.out.println("Institucion: "+((Alumno) persona).getInstituto());
            System.out.println("Nota matematicas: "+ ((Alumno) persona).getNotaMatematicas());
            System.out.println("Nota historia: "+((Alumno) persona).getNotaHistoria());
            System.out.println("Nota ciencias: "+ ((Alumno) persona).getNotaCiencias());

            if(persona instanceof AlumnoInternacional){
                System.out.println("Imprimiendo los datos del tipo alumno internacional");
                System.out.println("Nota Idioma: "+((AlumnoInternacional) persona).getNotaIdiomas());
                System.out.println("Pais: "+ ((AlumnoInternacional) persona).getPais());
            }
            System.out.println("=========Sobre escritura Promedio======");
            System.out.println("promedio: "+((Alumno) persona).calcularPromedio());
            System.out.println("=========Sobre escritura Promedio======");
        }
        if(persona instanceof Profesor){
            System.out.println("Imprimiendo los datos del tipo profesor");
            System.out.println("Asignatura: " + ((Profesor) persona).getAsignatura());
        }

        System.out.println("====================Sobre Escritura Saludar ================");
        System.out.println(persona.saludar());
        System.out.println("==================== ================");
    }
}
