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
public class IngredienteViejoDTO {
    
    private Long id;
    
    private String nombre;
    
    private UnidadMedida unidadMedida;
    
    private Integer stock;

    public IngredienteViejoDTO() {
    }

    public IngredienteViejoDTO(Long id, String nombre, UnidadMedida unidadMedida, Integer stock) {
        this.id = id;
        this.nombre = nombre;
        this.unidadMedida = unidadMedida;
        this.stock = stock;
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
        return "IngredienteViejoDTO{" + "id=" + id + ", nombre=" + nombre + ", unidadMedida=" + unidadMedida + ", stock=" + stock + '}';
    }
    
}
