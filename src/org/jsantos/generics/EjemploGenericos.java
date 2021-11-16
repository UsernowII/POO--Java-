package org.jsantos.generics;

import org.jsantos.poointerfaces.modelo.Cliente;
import org.jsantos.poointerfaces.modelo.ClientePremium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class EjemploGenericos {

    public static void main(String[] args) {


        List<Cliente> clientes = new ArrayList<Cliente>();
        clientes.add(new Cliente("Andres", "Guzman"));

        Cliente andres = clientes.iterator().next();
        Cliente[] clientesArray = {new Cliente("Andres", "Guzman"),
                new Cliente("luci", "Martinez")};

        Integer[] enterosArray = {1, 2, 3};

        List<Cliente> clientesLista = fromArrayToList(clientesArray);
        List<Integer> enterosLista = fromArrayToList(enterosArray);

        clientesLista.forEach(System.out::println);
        enterosLista.forEach(System.out::println);

        List<String> nombres = fromArrayToList(new String[]{"Andres", "pepe", "Luci"}, enterosArray);
        nombres.forEach(System.out::println);


        List<ClientePremium> clientePremiumList = fromArrayToList(
                new ClientePremium[]{new ClientePremium("paco", "fernandez")});

        imprimirClientes(clientes);
        imprimirClientes(clientesLista);
        imprimirClientes(clientePremiumList);

        System.out.println("Maximo de 1, 9 y 4 es :" + maximo(1,9,4));
        System.out.println("Maximo de 3.9, 11.6 y 7.78 es :" + maximo(3.9,11.6,7.78));
        System.out.println("Maximo de Zanahoria, arandamos, manzana es: "+
             maximo("Zanahoria", "Arandano", "Manzana"));



    }


    public static <T> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }


    public static <T extends Number> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }


    public static <T extends Cliente & Comparable<T>> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }

    public static <T, G> List<T> fromArrayToList(T[] c, G[] x) {
        for (G elemento : x) {
            System.out.println(elemento);
        }
        return Arrays.asList(c);
    }

    public static void imprimirClientes(List<? extends Cliente>clientes){
        clientes.forEach(System.out::println);
    }

    public static <T extends Comparable<T>> T maximo (T a, T b, T c){
        T max = a;
        if(b.compareTo(max)>0){
            max = b;
        }
        if(c.compareTo(max)>0){
            max = c;
        }
        return max;
    }
}