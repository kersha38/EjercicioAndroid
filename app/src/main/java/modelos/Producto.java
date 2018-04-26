package modelos;

import java.io.Serializable;

/**
 * Created by USRGAM on 26/04/2018.
 */

public class Producto implements Serializable{
    private String nombre;
    private Double precio;
    private String descripcion;
    private boolean enOferta;
    private String colores;

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", descripcion='" + descripcion + '\'' +
                ", enOferta=" + enOferta +
                ", colores='" + colores + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEnOferta() {
        return enOferta;
    }

    public void setEnOferta(boolean enOferta) {
        this.enOferta = enOferta;
    }

    public String getColores() {
        return colores;
    }

    public void setColores(String colores) {
        this.colores = colores;
    }

    public Producto(String nombre, Double precio, String descripcion, boolean enOferta, String colores) {

        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.enOferta = enOferta;
        this.colores = colores;
    }
}
