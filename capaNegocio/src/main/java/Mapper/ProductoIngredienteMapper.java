/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mapper;

import DTO.JoseLuisIslasMolina.ProductoIngredienteNuevoDTO;
import DTO.JoseLuisIslasMolina.ProductoIngredienteViejoDTO;
import Entidades.JoseLuisIslasMolina.ProductoIngrediente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author skyro
 */
public class ProductoIngredienteMapper {
    
    public static ProductoIngrediente toEntity(ProductoIngredienteNuevoDTO dto) {
        return new ProductoIngrediente(
                dto.getCantidad(), 
                ProductoMapper.toEntity(dto.getProducto()),
                IngredienteMapper.toEntity(dto.getIngrediente()));
    }
    
    public static ProductoIngrediente toEntity(ProductoIngredienteViejoDTO dto) {
        return new ProductoIngrediente(
                dto.getId(),
                dto.getCantidad(), 
                ProductoMapper.toEntity(dto.getProducto()),
                IngredienteMapper.toEntity(dto.getIngrediente()));
    }
    
    public static ProductoIngredienteNuevoDTO toNuevoDTO(ProductoIngrediente ingrediente) {
        return new ProductoIngredienteNuevoDTO(
                ingrediente.getCantidad(), 
                ProductoMapper.toNuevoDTO(ingrediente.getProducto()),
                IngredienteMapper.toNuevoDTO(ingrediente.getIngrediente())
        );
    }
    
    public static ProductoIngredienteViejoDTO toViejoDTO(ProductoIngrediente ingrediente) {
        return new ProductoIngredienteViejoDTO(
                ingrediente.getId(),
                ingrediente.getCantidad(), 
                ProductoMapper.toNuevoDTO(ingrediente.getProducto()),
                IngredienteMapper.toViejoDTO(ingrediente.getIngrediente())
        );
    }
    
    public static List<ProductoIngrediente> toEntityListFromNuevoDTO(List<ProductoIngredienteNuevoDTO> dto) {
        List<ProductoIngrediente> productoIngredientes = new ArrayList<>();
        
        dto.forEach((t) -> {productoIngredientes.add(ProductoIngredienteMapper.toEntity(t));
        });
        return productoIngredientes;
    }
    
    public static List<ProductoIngrediente> toEntityListFromViejoDTO(List<ProductoIngredienteViejoDTO> dto) {
        List<ProductoIngrediente> productoIngredientes = new ArrayList<>();
        
        dto.forEach((t) -> {productoIngredientes.add(ProductoIngredienteMapper.toEntity(t));
        });
        return productoIngredientes;
    }
    
    public static List<ProductoIngredienteNuevoDTO> toNuevoDTOList(List<ProductoIngrediente> ingredientes) {
        List<ProductoIngredienteNuevoDTO> productoIngredientes = new ArrayList<>();
        
        ingredientes.forEach((t) -> {productoIngredientes.add(toNuevoDTO(t));
        });
        return productoIngredientes;
    }
    
    public static List<ProductoIngredienteViejoDTO> toViejoDTOList(List<ProductoIngrediente> ingredientes) {
        List<ProductoIngredienteViejoDTO> productoIngredientes = new ArrayList<>();
        
        ingredientes.forEach((t) -> {productoIngredientes.add(toViejoDTO(t));
        });
        return productoIngredientes;
    }
}
