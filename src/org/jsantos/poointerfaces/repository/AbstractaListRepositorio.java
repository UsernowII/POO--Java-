package org.jsantos.poointerfaces.repository;


import org.jsantos.poointerfaces.modelo.EntidadGenerica;
import org.jsantos.poointerfaces.repository.excepciones.EscrituraAccesoDatosException;
import org.jsantos.poointerfaces.repository.excepciones.LecturaAccesoDatosException;
import org.jsantos.poointerfaces.repository.excepciones.RegistroDuplicadoAccesoDatosException;

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
    public T byId(Integer id) throws LecturaAccesoDatosException {
        if (id == null || id <= 0){
            throw new LecturaAccesoDatosException("Id invalido debe ser > 0");
        }
        T resultado = null;
        for (T t:dataSource) {
           if(t.getId()!= null && t.getId().equals(id)){
               resultado = t;
               break;
           }
        }
        if(resultado == null){
            throw new LecturaAccesoDatosException("No Existe el registro con el id: " + id);
        }
        return resultado;
    }


    // CREATE
    @Override
    public void crear(T t) throws EscrituraAccesoDatosException {
        if(t == null){
            throw new EscrituraAccesoDatosException("Error al insertar un objeto null");
        }
        if (this.dataSource.contains(t)){
            throw new RegistroDuplicadoAccesoDatosException("Error el objeto con id "
            + t.getId() + " existe en el repositorio");
        }
        this.dataSource.add(t);
    }


    //DELETE
    @Override
    public void eliminar(Integer id) throws LecturaAccesoDatosException {
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
