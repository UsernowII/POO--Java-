package org.jsantos.poointerfaces.repository.listas;


import org.jsantos.poointerfaces.modelo.Producto;
import org.jsantos.poointerfaces.repository.AbstractaListRepositorio;
import org.jsantos.poointerfaces.repository.Direccion;
import org.jsantos.poointerfaces.repository.excepciones.LecturaAccesoDatosException;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductoListRepositorio extends AbstractaListRepositorio<Producto> {


    @Override
    public void editar(Producto producto) throws LecturaAccesoDatosException {
        Producto c = this.byId(producto.getId());
        c.setDescripcion(producto.getDescripcion());
        c.setPrecio(producto.getPrecio());
    }

    //Ordenable
    @Override
    public List<Producto> listar(String campo, Direccion dir) {
        List<Producto> listaOrdenada = new ArrayList<>(this.dataSource);
        listaOrdenada.sort(new Comparator<Producto>() {
            @Override
            public int compare(Producto a, Producto b) {
                int resultado = 0;
                if (dir == Direccion.ASC) {
                    resultado = this.ordenar(a,b);
                } else if (dir == Direccion.DESC) {
                    resultado = this.ordenar(b,a);
                }
                return resultado;
            }
            private int ordenar (Producto a, Producto b){
                int resultado = 0;
                switch (campo){
                    case "id" ->
                            resultado = a.getId().compareTo(b.getId());
                    case "descripcion" ->
                            resultado = a.getDescripcion().compareTo(b.getDescripcion());
                    case "precio" ->
                            resultado = a.getPrecio().compareTo(b.getPrecio());
                }
                return resultado;
            }

        });
        return listaOrdenada;
    }

}
