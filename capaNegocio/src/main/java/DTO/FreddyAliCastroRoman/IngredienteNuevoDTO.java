/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO.FreddyAliCastroRoman;

import Enums.UnidadMedida;

/**
 *
 * @author LyFredD
 */
public class IngredienteNuevoDTO {
    
    private String nombre;
    
    private UnidadMedida unidadMedida;
    
    private Integer stock;

    public IngredienteNuevoDTO() {
    }

    public IngredienteNuevoDTO(String nombre, UnidadMedida unidadMedida, Integer stock) {
        this.nombre = nombre;
        this.unidadMedida = unidadMedida;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public UnidadMedida getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(UnidadMedida unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "IngredienteNuevoDTO{" + "nombre=" + nombre + ", unidadMedida=" + unidadMedida + ", stock=" + stock + '}';
    }
    
    
    
    
}
