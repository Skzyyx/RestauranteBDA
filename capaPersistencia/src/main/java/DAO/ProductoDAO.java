/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Conexion.Conexion;
import Entidades.Producto;
import Exception.PersistenciaException;
import javax.persistence.EntityManager;

/**
 *
 * @author skyro
 */
public class ProductoDAO {
    
    private static ProductoDAO instance;
    
    private ProductoDAO(){
        
    }
    
    public static ProductoDAO getInstance() {
        if (instance == null) {
            instance = new ProductoDAO();
        }
        return instance;
    }
    
    public Producto agregarProducto(Producto producto) throws PersistenciaException {
        EntityManager em = Conexion.crearConexion();
        
        try {
            em.getTransaction().begin();
            em.persist(producto);
            em.getTransaction().commit();
            return producto;
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new PersistenciaException("Error al guardar el producto: " + e.getMessage());
        } finally {
            em.close();
        }
    }
}
