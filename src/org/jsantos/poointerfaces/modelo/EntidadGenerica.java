package org.jsantos.poointerfaces.modelo;

import java.util.Objects;

public class EntidadGenerica {


    protected Integer id;
    private static int ultimoId;

    public EntidadGenerica() {
        this.id =++ultimoId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EntidadGenerica entidad = (EntidadGenerica) o;
        return Objects.equals(id, entidad.id);
    }

}
