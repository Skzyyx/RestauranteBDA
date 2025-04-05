/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO.ModuloProducto;

import DTO.FreddyAliCastroRoman.IngredienteNuevoDTO;
import DTO.FreddyAliCastroRoman.IngredienteViejoDTO;

/**
 *
 * @author skyro
 */
public class ProductoIngredienteViejoDTO {
    
    private Long id;
    
    private Integer cantidad;

    private ProductoNuevoDTO producto;

    private IngredienteViejoDTO ingrediente;

    public ProductoIngredienteViejoDTO() {
    }

    public ProductoIngredienteViejoDTO(Long id, Integer cantidad, ProductoNuevoDTO producto, IngredienteViejoDTO ingrediente) {
        this.id = id;
        this.cantidad = cantidad;
        this.producto = producto;
        this.ingrediente = ingrediente;
    }

    public ProductoIngredienteViejoDTO(Integer cantidad, ProductoNuevoDTO producto, IngredienteViejoDTO ingrediente) {
        this.cantidad = cantidad;
        this.producto = producto;
        this.ingrediente = ingrediente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public ProductoNuevoDTO getProducto() {
        return producto;
    }

    public void setProducto(ProductoNuevoDTO producto) {
        this.producto = producto;
    }

    public IngredienteViejoDTO getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(IngredienteViejoDTO ingrediente) {
        this.ingrediente = ingrediente;
    }
    
    
}
