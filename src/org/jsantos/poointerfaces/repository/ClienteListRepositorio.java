package org.jsantos.poointerfaces.repository;

import org.jsantos.poointerfaces.modelo.Cliente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClienteListRepositorio implements OrdenablePaginableCrudRepositorio {

    private List<Cliente> dataSource;


    public ClienteListRepositorio() {
        this.dataSource =  new ArrayList<>();
    }

    // READ
    @Override
    public List<Cliente> listar() {
        return dataSource;
    }

    //   READ  Buscar por ID
    @Override
    public Cliente byId(Integer id) {
        Cliente resultado = null;
        for (Cliente cli:dataSource) {
           if(cli.getId()!= null && cli.getId().equals(id)){
               resultado = cli;
               break;
           }
        }
        return resultado;
    }


    // CREATE
    @Override
    public void crear(Cliente cliente) {
        this.dataSource.add(cliente);
    }

    // UPDATE
    @Override
    public void editar(Cliente cliente) {
        Cliente c = this.byId(cliente.getId());
        c.setApellido(cliente.getApellido());
        c.setNombre(cliente.getNombre());
    }

    //DELETE
    @Override
    public void eliminar(Integer id) {
        this.dataSource.remove(this.byId(id));
    }

    //Ordenable
    @Override
    public List<Cliente> listar(String campo, Direccion dir) {
        List<Cliente> listaOrdenada = new ArrayList<>(this.dataSource);
        listaOrdenada.sort(new Comparator<Cliente>() {
            @Override
            public int compare(Cliente a, Cliente b) {
                int resultado = 0;
                if (dir == Direccion.ASC) {
                    resultado = this.ordenar(a,b);
                } else if (dir == Direccion.DESC) {
                    resultado = this.ordenar(b,a);
                }
                return resultado;
            }
            private int ordenar (Cliente a, Cliente b){
                int resultado = 0;
                switch (campo){
                    case "id" ->
                            resultado = a.getId().compareTo(b.getId());
                    case "nombre" ->
                            resultado = a.getNombre().compareTo(b.getNombre());
                    case "apellido" ->
                            resultado = a.getApellido().compareTo(b.getApellido());
                }
                return resultado;
            }

        });
        return listaOrdenada;
    }
    //Paginable

    @Override
    public List<Cliente> listar(int desde, int hasta) {
        return dataSource.subList(desde,hasta);
    }


    @Override
    public int total() {
        return this.dataSource.size();
    }
}
