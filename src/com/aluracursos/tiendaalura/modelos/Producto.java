package com.aluracursos.tiendaalura.modelos;

public class Producto implements Comparable<Producto> {
    // Atributos
    private String descripcion;
    private int precio;

    // Constructor

    public Producto() {
    }

    public Producto(String descripcion, int precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }

    // getters and setters

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return this.precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }



    @Override
    public String toString() {
        return getDescripcion() + " -- " + getPrecio();
    }

    @Override
    public int compareTo(Producto otroProducto) {
        return this.getDescripcion().compareTo(otroProducto.getDescripcion());
    }

}
