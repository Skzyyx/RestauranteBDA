/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Conexion.Conexion;
import Entidades.JoseLuisIslasMolina.Producto;
import Enums.EstadoProducto;
import Exception.ModuloProductoException;
import Interface.IProductoDAO;
import javax.persistence.EntityManager;

/**
 *
 * @author Jose Luis Islas Molina 252574
 * @author Freddy Ali Castro Roman 252191
 * @author Benjamin Soto Coronado 253183
 */
public class ProductoDAO implements IProductoDAO {
    
    private static ProductoDAO instance;
    
    private ProductoDAO(){
        
    }
    
    public static ProductoDAO getInstance() {
        if (instance == null) {
            instance = new ProductoDAO();
        }
        return instance;
    }
    
    public Producto agregarProducto(Producto producto) throws ModuloProductoException {
        
        if (producto == null) throw new ModuloProductoException("El producto no puede ser nulo");
        
        EntityManager em = Conexion.crearConexion();
        try {
            em.getTransaction().begin();
            em.persist(producto);
            em.getTransaction().commit();
            return producto;
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new ModuloProductoException("Error al guardar el producto: " + e.getMessage());
        } finally {
            em.close();
        }
    }
    
    public boolean deshabilitarProducto(Long idProducto) throws ModuloProductoException {
        
        if (idProducto == null) throw new ModuloProductoException("El id del producto no puede ser nulo.");
        
        EntityManager em = Conexion.crearConexion();
        
        try {
            
            Producto producto = em.find(Producto.class, idProducto);
            
            if (producto == null) throw new ModuloProductoException("El producto no fue encontrado.");
            if (producto.getEstadoProducto() == EstadoProducto.NO_DISPONIBLE) throw new ModuloProductoException("El producto ya se encuentra deshabilitado.");
            
            em.getTransaction().begin();
            producto.setEstadoProducto(EstadoProducto.NO_DISPONIBLE);
            em.merge(producto);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new ModuloProductoException("Ocurrió un error al deshabilitar el producto: " + e.getMessage());
        } finally {
            em.close();
        }
    }
    
    public boolean habilitarProducto(Long idProducto) throws ModuloProductoException {
        
        if (idProducto == null) throw new ModuloProductoException("El id del producto no puede ser nulo.");
        
        EntityManager em = Conexion.crearConexion();
        
        try {
            
            Producto producto = em.find(Producto.class, idProducto);
            
            if (producto == null) throw new ModuloProductoException("El producto no fue encontrado.");
            if (producto.getEstadoProducto() == EstadoProducto.DISPONIBLE) throw new ModuloProductoException("El producto ya se encuentra habilitado.");
            
            em.getTransaction().begin();
            producto.setEstadoProducto(EstadoProducto.DISPONIBLE);
            em.merge(producto);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new ModuloProductoException("Ocurrió un error al habilitar el producto: " + e.getMessage());
        } finally {
            em.close();
        }
    }
    
    public Producto editarProducto(Long idProducto, Producto productoNuevo) throws ModuloProductoException {
        
        if (idProducto == null) throw new ModuloProductoException("El id no puede ser nulo");
        if (productoNuevo == null) throw new ModuloProductoException("El producto no puede ser nulo");
        
        EntityManager em = Conexion.crearConexion();
        
        try {
            
            Producto producto = em.find(Producto.class, idProducto);
            
            if (producto == null) throw new ModuloProductoException("El producto no fue encontrado.");
            
            em.getTransaction().begin();
            productoNuevo.setPrecio(productoNuevo.getPrecio());
            productoNuevo.setIngredientes(productoNuevo.getIngredientes());
            em.getTransaction().commit();
            
            return producto;
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new ModuloProductoException("Ocurrió un error al editar el producto: " + e.getMessage());
        } finally {
            em.close();
        }
    }
}
