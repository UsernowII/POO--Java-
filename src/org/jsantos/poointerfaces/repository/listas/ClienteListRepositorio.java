package org.jsantos.poointerfaces.repository.listas;

import org.jsantos.poointerfaces.modelo.Cliente;
import org.jsantos.poointerfaces.repository.AbstractaListRepositorio;
import org.jsantos.poointerfaces.repository.Direccion;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClienteListRepositorio extends AbstractaListRepositorio<Cliente> {


    // UPDATE
    @Override
    public void editar(Cliente cliente) {
        Cliente c = this.byId(cliente.getId());
        c.setApellido(cliente.getApellido());
        c.setNombre(cliente.getNombre());
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

}
