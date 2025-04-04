/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO.JoseLuisIslasMolina;

import DTO.FreddyAliSotoCoronado.IngredienteNuevoDTO;
import Entidades.FreddyAliCastroRoman.Ingrediente;
import Entidades.JoseLuisIslasMolina.Producto;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author skyro
 */
public class ProductoIngredienteNuevoDTO {

    private Integer cantidad;

    private ProductoNuevoDTO producto;

    private IngredienteNuevoDTO ingrediente;

    public ProductoIngredienteNuevoDTO() {
    }

    public ProductoIngredienteNuevoDTO(Integer cantidad, ProductoNuevoDTO producto, IngredienteNuevoDTO ingrediente) {
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

    public IngredienteNuevoDTO getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(IngredienteNuevoDTO ingrediente) {
        this.ingrediente = ingrediente;
    }
    
    
}
