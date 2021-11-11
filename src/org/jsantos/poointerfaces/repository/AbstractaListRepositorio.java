package org.jsantos.poointerfaces.repository;


import org.jsantos.poointerfaces.modelo.EntidadGenerica;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractaListRepositorio <T extends EntidadGenerica> implements OrdenablePaginableCrudRepositorio <T> {

    protected List<T> dataSource;


    public AbstractaListRepositorio() {
        this.dataSource =  new ArrayList<>();
    }

    // READ
    @Override
    public List<T> listar() {
        return dataSource;
    }

    //   READ  Buscar por ID
    @Override
    public T byId(Integer id) {
        T resultado = null;
        for (T t:dataSource) {
           if(t.getId()!= null && t.getId().equals(id)){
               resultado = t;
               break;
           }
        }
        return resultado;
    }


    // CREATE
    @Override
    public void crear(T t) {
        this.dataSource.add(t);
    }


    //DELETE
    @Override
    public void eliminar(Integer id) {
        this.dataSource.remove(this.byId(id));
    }



    @Override
    public List<T> listar(int desde, int hasta) {
        return dataSource.subList(desde,hasta);
    }


    //Total
    @Override
    public int total() {
        return this.dataSource.size();
    }
}
