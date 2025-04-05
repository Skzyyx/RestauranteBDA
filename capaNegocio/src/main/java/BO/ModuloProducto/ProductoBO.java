/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BO.ModuloProducto;

import DAO.ModuloProducto.ProductoDAO;
import DTO.ModuloProducto.ProductoNuevoDTO;
import DTO.ModuloProducto.ProductoViejoDTO;
import Entidades.ModuloProducto.Producto;
import Exception.ModuloProductoNegocioException;
import Exception.ModuloProductoPersistenciaException;
import Interface.IProductoBO;
import Mapper.ProductoMapper;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author skyro
 */
public class ProductoBO implements IProductoBO{
    
    private static ProductoBO instance;
    private static ProductoDAO productoDAO;

    private ProductoBO() {
        this.productoDAO = ProductoDAO.getInstance();
    }
    
    public static ProductoBO getInstance() {
        if (instance == null) {
            instance = new ProductoBO();
        }
        return instance;
    }
    
    @Override
    public ProductoViejoDTO agregarProducto(ProductoNuevoDTO producto) throws ModuloProductoNegocioException {
        
        if (producto == null) throw new ModuloProductoNegocioException("El producto no puede ser nulo.");
        
        if (producto.getNombre().isEmpty() || producto.getNombre() == null) 
            throw new ModuloProductoNegocioException("El nombre del producto no puede ser nulo.");
        
        if (producto.getPrecio() < 0 || producto.getPrecio() == null) 
            throw new ModuloProductoNegocioException("El precio del producto debe ser mayor a 0.");
        
        if (producto.getIngredientes().isEmpty() || producto.getIngredientes() == null) 
            throw new ModuloProductoNegocioException("El producto debe contener al menos un ingrediente.");
        
        try {
            return ProductoMapper.toViejoDTO(productoDAO.agregarProducto(ProductoMapper.toEntity(producto)));
        } catch (ModuloProductoPersistenciaException ex) {
            Logger.getLogger(ProductoBO.class.getName()).log(Level.SEVERE, null, ex);
            throw new ModuloProductoNegocioException("Ocurrió un error al agregar el producto: " + ex.getMessage());
        }
    }
    
    @Override
    public boolean habilitarProducto(Long idProducto) throws ModuloProductoNegocioException {
        
        if (idProducto == null) throw new ModuloProductoNegocioException("EL id no puede ser nulo");
        
        try {
            productoDAO.habilitarProducto(idProducto);
            return true;
        } catch (ModuloProductoPersistenciaException ex) {
            Logger.getLogger(ProductoBO.class.getName()).log(Level.SEVERE, null, ex);
            throw new ModuloProductoNegocioException("Ocurrió un error al habilitar el producto: " + ex.getMessage());
        }
    }
    
    @Override
    public boolean deshabilitarProducto(Long idProducto) throws ModuloProductoNegocioException {
        
        if (idProducto == null) throw new ModuloProductoNegocioException("EL id no puede ser nulo");
        
        try {
            productoDAO.deshabilitarProducto(idProducto);
            return true;
        } catch (ModuloProductoPersistenciaException ex) {
            Logger.getLogger(ProductoBO.class.getName()).log(Level.SEVERE, null, ex);
            throw new ModuloProductoNegocioException("Ocurrió un error al deshabilitar el producto: " + ex.getMessage());
        }
    }
    
    @Override
    public ProductoViejoDTO editarProducto(ProductoViejoDTO producto) throws ModuloProductoNegocioException {
        
        if (producto == null) throw new ModuloProductoNegocioException("El producto no puede ser nulo.");
        
        if (producto.getNombre().isEmpty() || producto.getNombre() == null) 
            throw new ModuloProductoNegocioException("El nombre del producto no puede ser nulo.");
        
        if (producto.getPrecio() < 0 || producto.getPrecio() == null) 
            throw new ModuloProductoNegocioException("El precio del producto debe ser mayor a 0.");
        
        if (producto.getIngredientes().isEmpty() || producto.getIngredientes() == null) 
            throw new ModuloProductoNegocioException("El producto debe contener al menos un ingrediente.");
        
        try {
            return ProductoMapper.toViejoDTO(productoDAO.editarProducto(producto.getId(), ProductoMapper.toEntity(producto)));
        } catch (ModuloProductoPersistenciaException ex) {
            Logger.getLogger(ProductoBO.class.getName()).log(Level.SEVERE, null, ex);
            throw new ModuloProductoNegocioException("Ocurrió un error al editar el producto: " + ex.getMessage());
        }
    }

    @Override
    public List<Producto> obtenerProductos() throws ModuloProductoNegocioException {
        try {
            return productoDAO.obtenerProductos();
        } catch (ModuloProductoPersistenciaException ex) {
            Logger.getLogger(ProductoBO.class.getName()).log(Level.SEVERE, null, ex);
            throw new ModuloProductoNegocioException("Ocurrió un error al obtener los productos: " + ex.getMessage());
        }
    }
}
