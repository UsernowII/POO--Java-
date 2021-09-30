package org.jsantos.poointerfaces.repository;

import org.jsantos.poointerfaces.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio {

    List<Cliente>listar(String campo, Direccion dir);
}
