package org.jsantos.poointerfaces.repository;

import org.jsantos.poointerfaces.modelo.Cliente;

import java.util.List;

public interface CrudRepositorio {

    List<Cliente>listar();

    Cliente byId(Integer id);

    void crear(Cliente cliente);

    void editar (Cliente cliente);

    void eliminar(Integer id);
}
