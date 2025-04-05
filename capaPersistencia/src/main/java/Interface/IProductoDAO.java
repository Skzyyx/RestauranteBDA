package Interface;

import Entidades.ModuloProducto.Producto;
import Exception.ModuloProductoPersistenciaException;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author skyro
 */
public interface IProductoDAO {
    
    public Producto agregarProducto(Producto producto) throws ModuloProductoPersistenciaException;
    
    public boolean deshabilitarProducto(Long idProducto) throws ModuloProductoPersistenciaException;
    
    public boolean habilitarProducto(Long idProducto) throws ModuloProductoPersistenciaException;
    
    public Producto editarProducto(Long idProducto, Producto productoNuevo) throws ModuloProductoPersistenciaException;
    
    public List<Producto> obtenerProductos() throws ModuloProductoPersistenciaException;
}
