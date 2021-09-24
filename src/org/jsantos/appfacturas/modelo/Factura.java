package org.jsantos.appfacturas.modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {

    private int id;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private ItemFactura[] items;
    private int indiceItems;
    public static final int MAX_ITEMS = 12;
    private static int ultimoId;


    //constructor
    public Factura(String descripcion, Cliente cliente) {
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.items = new ItemFactura[MAX_ITEMS];
        this.id = ++ultimoId;
        this.fecha = new Date();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ItemFactura[] getItems() {
        return items;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void addItemFactura(ItemFactura item) {
        if (indiceItems < MAX_ITEMS) {
            this.items[indiceItems++] = item;
        }
    }

    //Methods

    public float calcularTotal() {
        float total = 0.0F;
        for (int i=0; i<indiceItems; i++) {
            total += this.items[i].calcularImporte();
        }
        return total;
    }


    public String generarDetalle() {
        StringBuilder sb = new StringBuilder("Factura N: ");
        sb.append(id)
                .append("\nCliente: ").append(this.cliente.getNombre())
                .append("\tNIT: ").append(cliente.getNit())
                .append("\nDescripción: ").append(this.descripcion).append("\n");

        SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMMM, yyyy");
        sb.append("Fecha Emisiòn: ").append(df.format(this.fecha)).append("\n")
                .append("\n#\tNombre\t\tPrecio\tCant.\tTotal\n");;

        for (int i=0; i<indiceItems; i++) {
            ItemFactura item = this.items[i];

            /**sb.append(item.getProducto().getCodigo())
                    .append("\t")
                    .append(item.getProducto().getNombre())
                    .append("\t\t")
                    .append(item.getProducto().getPrecio())
                    .append("\t")
                    .append(item.getCantidad())
                    .append("\t")
                    .append(item.calcularImporte())
                    .append("\n");*/

            sb.append(item.toString()).append("\n");
        }
        sb.append("\nGran Total: ")
                .append(calcularTotal());

        return sb.toString();
    }

    @Override
    public String toString() {
        return generarDetalle();
    }
}
