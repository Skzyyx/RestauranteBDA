/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mapper;

import DTO.ModuloProducto.ProductoNuevoDTO;
import DTO.ModuloProducto.ProductoViejoDTO;
import Entidades.ModuloProducto.Producto;

/**
 *
 * @author skyro
 */
public class ProductoMapper {
    
    public static Producto toEntity(ProductoNuevoDTO dto) {
        return new Producto(
                dto.getNombre(), 
                dto.getPrecio(), 
                dto.getTipoProducto(), 
                dto.getEstadoProducto(),
                ProductoIngredienteMapper.toEntityListFromNuevoDTO(dto.getIngredientes())
        );
    }
    
    public static Producto toEntity(ProductoViejoDTO dto) {
        return new Producto(
                dto.getId(),
                dto.getNombre(), 
                dto.getPrecio(), 
                dto.getTipoProducto(), 
                dto.getEstadoProducto(),
                ProductoIngredienteMapper.toEntityListFromViejoDTO(dto.getIngredientes())
        );
    }
    
    public static ProductoViejoDTO toViejoDTO(Producto producto) {
        return new ProductoViejoDTO(
                producto.getId(), 
                producto.getNombre(), 
                producto.getPrecio(), 
                producto.getTipoProducto(), 
                producto.getEstadoProducto(), 
                ProductoIngredienteMapper.toViejoDTOList(producto.getIngredientes())
        );
    }
    
    public static ProductoNuevoDTO toNuevoDTO(Producto producto) {
        return new ProductoNuevoDTO(
                producto.getNombre(), 
                producto.getPrecio(), 
                producto.getTipoProducto(), 
                producto.getEstadoProducto(), 
                ProductoIngredienteMapper.toNuevoDTOList(producto.getIngredientes())
        );
    }
}
