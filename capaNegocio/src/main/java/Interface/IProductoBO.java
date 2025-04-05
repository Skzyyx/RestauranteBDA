/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interface;

import DTO.ModuloProducto.ProductoNuevoDTO;
import DTO.ModuloProducto.ProductoViejoDTO;
import Entidades.ModuloProducto.Producto;
import Exception.ModuloProductoNegocioException;
import java.util.List;

/**
 *
 * @author skyro
 */
public interface IProductoBO {
    
    ProductoViejoDTO agregarProducto(ProductoNuevoDTO producto) throws ModuloProductoNegocioException;
    
    boolean habilitarProducto(Long idProducto) throws ModuloProductoNegocioException;
    
    boolean deshabilitarProducto(Long idProducto) throws ModuloProductoNegocioException;
    
    ProductoViejoDTO editarProducto(ProductoViejoDTO producto) throws ModuloProductoNegocioException;
    
    List<Producto> obtenerProductos() throws ModuloProductoNegocioException;
}
