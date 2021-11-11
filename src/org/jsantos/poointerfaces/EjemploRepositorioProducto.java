package org.jsantos.poointerfaces;

import org.jsantos.poointerfaces.modelo.Cliente;
import org.jsantos.poointerfaces.modelo.Producto;
import org.jsantos.poointerfaces.repository.Direccion;
import org.jsantos.poointerfaces.repository.OrdenablePaginableCrudRepositorio;
import org.jsantos.poointerfaces.repository.listas.ClienteListRepositorio;
import org.jsantos.poointerfaces.repository.listas.ProductoListRepositorio;

import java.util.List;

public class EjemploRepositorioProducto {

    public static void main(String[] args) {


        OrdenablePaginableCrudRepositorio<Producto> repo = new ProductoListRepositorio();
        repo.crear(new Producto("Televisor",150000 ));
        repo.crear(new Producto("Memoria Ram", 86000));
        repo.crear(new Producto("Silla", 22000));
        repo.crear(new Producto("Lampara", 15000.37));

        List<Producto> productos = repo.listar();

        productos.forEach(System.out::println);
        System.out.println("====== Paginable=====");
        List<Producto> paginable = repo.listar(0,4);
        paginable.forEach(System.out::println);


        System.out.println("===== ordenar Descendente=====");
        List<Producto> productosOrdenDesc = repo.listar("precio", Direccion.DESC);

        for (Producto p : productosOrdenDesc) {
            System.out.println(p);
        }

        System.out.println("===== Editar ====");
        Producto lamparaActualizar = new Producto("lamara escritorio", 170000.86);
        lamparaActualizar.setId(3);
        repo.editar(lamparaActualizar);
        Producto lampara = repo.byId(3);
        System.out.println(lampara);


        System.out.println("===== Eliminar =====");
        repo.eliminar(3);
        repo.listar().forEach(System.out::println);

        System.out.println("===== Total =====");
        System.out.println("total de registros: "+ repo.total());

    }

}
