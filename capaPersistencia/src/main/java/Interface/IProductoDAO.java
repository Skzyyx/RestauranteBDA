package Interface;

import Entidades.JoseLuisIslasMolina.Producto;
import Exception.ModuloProductoException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author skyro
 */
public interface IProductoDAO {
    
    public Producto agregarProducto(Producto producto) throws ModuloProductoException;
    
    public boolean deshabilitarProducto(Long idProducto) throws ModuloProductoException;
    
    public boolean habilitarProducto(Long idProducto) throws ModuloProductoException;
    
    public Producto editarProducto(Long idProducto, Producto productoNuevo) throws ModuloProductoException;
}
