/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO.JoseLuisIslasMolina;

import Conexion.Conexion;
import Entidades.JoseLuisIslasMolina.Producto;
import Enums.EstadoProducto;
import Exception.ModuloProductoPersistenciaException;
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
    
    @Override
    public Producto agregarProducto(Producto producto) throws ModuloProductoPersistenciaException {
        
        if (producto == null) throw new ModuloProductoPersistenciaException("El producto no puede ser nulo");
        
        EntityManager em = Conexion.crearConexion();
        try {
            em.getTransaction().begin();
            em.persist(producto);
            em.getTransaction().commit();
            return producto;
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new ModuloProductoPersistenciaException("Error al guardar el producto: " + e.getMessage());
        } finally {
            em.close();
        }
    }
    
    @Override
    public boolean deshabilitarProducto(Long idProducto) throws ModuloProductoPersistenciaException {
        
        if (idProducto == null) throw new ModuloProductoPersistenciaException("El id del producto no puede ser nulo.");
        
        EntityManager em = Conexion.crearConexion();
        
        try {
            
            Producto producto = em.find(Producto.class, idProducto);
            
            if (producto == null) throw new ModuloProductoPersistenciaException("El producto no fue encontrado.");
            if (producto.getEstadoProducto() == EstadoProducto.NO_DISPONIBLE) throw new ModuloProductoPersistenciaException("El producto ya se encuentra deshabilitado.");
            
            em.getTransaction().begin();
            producto.setEstadoProducto(EstadoProducto.NO_DISPONIBLE);
            em.merge(producto);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new ModuloProductoPersistenciaException("Ocurrió un error al deshabilitar el producto: " + e.getMessage());
        } finally {
            em.close();
        }
    }
    
    @Override
    public boolean habilitarProducto(Long idProducto) throws ModuloProductoPersistenciaException {
        
        if (idProducto == null) throw new ModuloProductoPersistenciaException("El id del producto no puede ser nulo.");
        
        EntityManager em = Conexion.crearConexion();
        
        try {
            
            Producto producto = em.find(Producto.class, idProducto);
            
            if (producto == null) throw new ModuloProductoPersistenciaException("El producto no fue encontrado.");
            if (producto.getEstadoProducto() == EstadoProducto.DISPONIBLE) throw new ModuloProductoPersistenciaException("El producto ya se encuentra habilitado.");
            
            em.getTransaction().begin();
            producto.setEstadoProducto(EstadoProducto.DISPONIBLE);
            em.merge(producto);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new ModuloProductoPersistenciaException("Ocurrió un error al habilitar el producto: " + e.getMessage());
        } finally {
            em.close();
        }
    }
    
    @Override
    public Producto editarProducto(Long idProducto, Producto productoNuevo) throws ModuloProductoPersistenciaException {
        
        if (idProducto == null) throw new ModuloProductoPersistenciaException("El id no puede ser nulo");
        if (productoNuevo == null) throw new ModuloProductoPersistenciaException("El producto no puede ser nulo");
        
        EntityManager em = Conexion.crearConexion();
        
        try {
            
            Producto producto = em.find(Producto.class, idProducto);
            
            if (producto == null) throw new ModuloProductoPersistenciaException("El producto no fue encontrado.");
            
            em.getTransaction().begin();
            productoNuevo.setPrecio(productoNuevo.getPrecio());
            productoNuevo.setIngredientes(productoNuevo.getIngredientes());
            em.getTransaction().commit();
            
            return producto;
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new ModuloProductoPersistenciaException("Ocurrió un error al editar el producto: " + e.getMessage());
        } finally {
            em.close();
        }
    }
}
