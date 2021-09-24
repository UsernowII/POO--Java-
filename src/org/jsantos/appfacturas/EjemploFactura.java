package org.jsantos.appfacturas;

import org.jsantos.appfacturas.modelo.*;


import java.util.Scanner;

public class EjemploFactura {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNit("5555-5");
        cliente.setNombre("Andres");


        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la descripcion de la factura: ");
        String desc = sc.nextLine();
        Factura factura = new Factura(desc, cliente);

        Producto producto ;


        System.out.println();

        for (int i = 0; i < 5; i++) {
            producto = new Producto();
            System.out.print("Ingrese producto n "+ producto.getCodigo() + ": ");
            producto.setNombre(sc.nextLine());

            System.out.print("Ingrese precio: ");
            //precio = sc.nextFloat() ;
            producto.setPrecio(sc.nextFloat());

            System.out.print("Ingrese la cantidad: ");
            //cantidad = sc.nextInt();

            //ItemFactura item = new ItemFactura(cantidad, producto);
            //factura.addItemFactura(item);

            factura.addItemFactura(new ItemFactura(sc.nextInt(),producto));

            System.out.println();
            sc.nextLine();

        }

        System.out.println(factura.toString());

    }
}
