/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mapper;

import DTO.JoseLuisIslasMolina.ProductoIngredienteNuevoDTO;
import Entidades.JoseLuisIslasMolina.ProductoIngrediente;

/**
 *
 * @author skyro
 */
public class ProductoIngredienteMapper {
    
    
    public static ProductoIngrediente toEntity(ProductoIngredienteNuevoDTO dto) {
        return new ProductoIngrediente(
                dto.getCantidad(), 
                dto.getProducto(), 
                dto.getIngrediente());
    }
}
