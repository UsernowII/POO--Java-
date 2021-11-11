package org.jsantos.poointerfaces.repository;


import java.util.List;

public interface CrudRepositorio<T> {

    List<T>listar();

    T byId(Integer id);

    void crear(T t);

    void editar (T t);

    void eliminar(Integer id);
}
