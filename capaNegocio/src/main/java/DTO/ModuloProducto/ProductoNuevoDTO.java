/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO.ModuloProducto;

import Entidades.ModuloProducto.ProductoIngrediente;
import Enums.EstadoProducto;
import Enums.TipoProducto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author skyro
 */
public class ProductoNuevoDTO {

    private String nombre;

    private Double precio;

    private TipoProducto tipoProducto;

    private EstadoProducto estadoProducto;

    private List<ProductoIngredienteNuevoDTO> ingredientes = new ArrayList<>();

    public ProductoNuevoDTO() {
    }

    public ProductoNuevoDTO(String nombre, Double precio, TipoProducto tipoProducto, EstadoProducto estadoProducto, List<ProductoIngredienteNuevoDTO> ingredientes) {
        this.nombre = nombre;
        this.precio = precio;
        this.tipoProducto = tipoProducto;
        this.estadoProducto = estadoProducto;
        this.ingredientes = ingredientes;
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

    public TipoProducto getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(TipoProducto tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public EstadoProducto getEstadoProducto() {
        return estadoProducto;
    }

    public void setEstadoProducto(EstadoProducto estadoProducto) {
        this.estadoProducto = estadoProducto;
    }

    public List<ProductoIngredienteNuevoDTO> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<ProductoIngredienteNuevoDTO> ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString() {
        return "ProductoDTO{" + "nombre=" + nombre + ", precio=" + precio + ", tipoProducto=" + tipoProducto + ", estadoProducto=" + estadoProducto + ", ingredientes=" + ingredientes + '}';
    }
}
