package org.jsantos.poointerfaces.repository;

public interface OrdenablePaginableCrudRepositorio <T> extends OrdenableRepositorio <T>,
        PaginableRepositorio <T>,CrudRepositorio <T>,ContableRepositorio{
}
