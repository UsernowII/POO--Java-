package org.jsantos.poointerfaces.imprenta;

import org.jsantos.poointerfaces.imprenta.modelo.*;
import static org.jsantos.poointerfaces.imprenta.modelo.Genero.*;

public class EjemploImprenta {

    public static void main(String[] args) {


        Curriculo cv = new Curriculo(new Persona("Erick", "Bowein"),"Programacion", "Resumen Laboral");
        cv.addExperiencia("java")
                .addExperiencia("Oracle DBA")
                .addExperiencia("Spring Framework")
                .addExperiencia("Desarrollador fullstack")
                .addExperiencia("CSS");

        Libro libro = new Libro(new Persona("Oscar", "Raniz"),"Patrones de diseño",PROGRAMACION);

        libro.addPagina(new Pagina("Patron Singleton"))
                .addPagina(new Pagina("Patron Observador"))
                .addPagina(new Pagina("Patron Factory"));


        Informe informe = new Informe(new Persona("James", "Fowler"),new Persona("James", "Santos"),
                "Estudio de Microservicios");
        imprimir(cv);
        imprimir(informe);
        imprimir(libro);

        //clase anonima
        imprimir(new Imprimible() {
            @Override
            public String imprimir() {
                return Imprimible.super.imprimir();
            }
        });
    }

    public static void imprimir (Imprimible imprimible){
        System.out.println(imprimible.imprimir());

    }
}
