package org.jsantos.poointerfaces.repository;

import org.jsantos.poointerfaces.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio {

    List<Cliente> listar(int desde, int hasta);
}
