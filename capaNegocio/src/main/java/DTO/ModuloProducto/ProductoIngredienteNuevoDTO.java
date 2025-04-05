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
public class ProductoIngredienteNuevoDTO {

    private Integer cantidad;

    private ProductoNuevoDTO producto;

    private IngredienteViejoDTO ingrediente;

    public ProductoIngredienteNuevoDTO() {
    }

    public ProductoIngredienteNuevoDTO(Integer cantidad, ProductoNuevoDTO producto, IngredienteViejoDTO ingrediente) {
        this.cantidad = cantidad;
        this.producto = producto;
        this.ingrediente = ingrediente;
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
