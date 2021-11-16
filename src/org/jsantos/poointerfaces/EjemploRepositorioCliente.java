package org.jsantos.poointerfaces;

import org.jsantos.poointerfaces.modelo.Cliente;
import org.jsantos.poointerfaces.repository.*;
import org.jsantos.poointerfaces.repository.excepciones.AccesoDatosException;
import org.jsantos.poointerfaces.repository.excepciones.EscrituraAccesoDatosException;
import org.jsantos.poointerfaces.repository.excepciones.LecturaAccesoDatosException;
import org.jsantos.poointerfaces.repository.listas.ClienteListRepositorio;

import java.util.List;

public class EjemploRepositorioCliente {

    public static void main(String[] args) {

        try {

            OrdenablePaginableCrudRepositorio<Cliente> repo = new ClienteListRepositorio();
            repo.crear(new Cliente("Lucia", "Perez"));
            repo.crear(new Cliente("Bea", "Gonzalez"));
            repo.crear(new Cliente("Jano", "Perez"));
            repo.crear(new Cliente("Andres", "Guzman"));
            repo.crear(null);
            List<Cliente> clientes = repo.listar();

            clientes.forEach(System.out::println);
            System.out.println("====== Paginable=====");
            List<Cliente> paginable = repo.listar(1, 3);
            paginable.forEach(System.out::println);

            System.out.println("===== ordenar Ascendente=====");
            List<Cliente> clientesOrdenAsc = repo.listar("nombre", Direccion.ASC);

            for (Cliente c : clientesOrdenAsc) {
                System.out.println(c);
            }

            System.out.println("===== ordenar Descendente=====");
            clientesOrdenAsc = repo.listar("nombre", Direccion.DESC);

            for (Cliente c : clientesOrdenAsc) {
                System.out.println(c);
            }

            System.out.println("===== Editar ====");
            Cliente beaActualizar = new Cliente("Bea", "Mena");
            beaActualizar.setId(2);
            repo.editar(beaActualizar);
            Cliente bea = repo.byId(2);
            System.out.println(bea);


            System.out.println("===== Eliminar =====");
            repo.eliminar(0);
            repo.listar().forEach(System.out::println);

            System.out.println("===== Total =====");
            System.out.println("total de registros: " + repo.total());

        }catch (LecturaAccesoDatosException e){
            System.out.println("lectura "  + e.getMessage());
            e.printStackTrace();
        }catch (EscrituraAccesoDatosException e) {
            System.out.println("Escritura "  + e.getMessage());
            e.printStackTrace();
        } catch (AccesoDatosException ad) {
            System.out.println("Genérica " + ad.getMessage());
            ad.printStackTrace();
        }

    }

}
