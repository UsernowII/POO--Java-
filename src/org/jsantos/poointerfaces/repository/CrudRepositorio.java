package org.jsantos.poointerfaces.repository;


import org.jsantos.poointerfaces.repository.excepciones.AccesoDatosException;



import java.util.List;

public interface CrudRepositorio<T> {

    List<T>listar();

    T byId(Integer id) throws AccesoDatosException;

    void crear(T t) throws AccesoDatosException;

    void editar (T t) throws AccesoDatosException;

    void eliminar(Integer id) throws AccesoDatosException;
}
