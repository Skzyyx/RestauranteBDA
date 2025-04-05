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
 * @author Jose Luis Islas Molina 252574
 * @author Freddy Ali Castro Roman 252191
 * @author Benjamin Soto Coronado 253183
 */
public class ProductoViejoDTO {
    
    private Long id;

    private String nombre;

    private Double precio;

    private TipoProducto tipoProducto;

    private EstadoProducto estadoProducto;

    private List<ProductoIngredienteViejoDTO> ingredientes = new ArrayList<>();

    public ProductoViejoDTO() {
    }

    public ProductoViejoDTO(Long id, String nombre, Double precio, TipoProducto tipoProducto, EstadoProducto estadoProducto, List<ProductoIngredienteViejoDTO> ingredientes) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.tipoProducto = tipoProducto;
        this.estadoProducto = estadoProducto;
        this.ingredientes = ingredientes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public List<ProductoIngredienteViejoDTO> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<ProductoIngredienteViejoDTO> ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString() {
        return "ProductoDTO{" + "id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", tipoProducto=" + tipoProducto + ", estadoProducto=" + estadoProducto + ", ingredientes=" + ingredientes + '}';
    }
    
}
