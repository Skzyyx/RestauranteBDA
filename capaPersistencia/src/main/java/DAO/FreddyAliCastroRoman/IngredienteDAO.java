/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO.FreddyAliCastroRoman;

import Conexion.Conexion;
import Entidades.ModuloIngrediente.Ingrediente;
import Exception.ModuloIngredientePersistenciaException;
import Interface.IIngredienteDAO;
import javax.persistence.EntityManager;

/**
 *
 * @author LyFredD
 */
public class IngredienteDAO implements IIngredienteDAO{
    
    private static IngredienteDAO instance;

    public IngredienteDAO() {
    }
    
    public static IngredienteDAO getInstance() {
        if (instance == null) {
            instance = new IngredienteDAO();
        }
        return instance;
    }
    
    

    @Override
    public Ingrediente agregarIngrediente(Ingrediente ingrediente) throws ModuloIngredientePersistenciaException {
        if (ingrediente == null) throw new ModuloIngredientePersistenciaException("El ingrediente no puede ser nulo");
        
        EntityManager em = Conexion.crearConexion();
        try {
            em.getTransaction().begin();
            em.persist(ingrediente);
            em.getTransaction().commit();
            return ingrediente;
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new ModuloIngredientePersistenciaException("Error al guardar el producto: " + e.getMessage());
        } finally {
            em.close();
        }
        
    }

    @Override
    public Ingrediente editarIngrediente(Long idIngrediente, Ingrediente ingredienteNuevo) throws ModuloIngredientePersistenciaException {
        
        if (idIngrediente == null) throw new ModuloIngredientePersistenciaException("El id no puede ser nulo");
        if (ingredienteNuevo == null) throw new ModuloIngredientePersistenciaException("El ingrediente no puede ser nulo");
        
        EntityManager em = Conexion.crearConexion();
        
        try {
            
            Ingrediente ingrediente = em.find(Ingrediente.class, idIngrediente);
            
            if (ingrediente == null) throw new ModuloIngredientePersistenciaException("El ingrediente no fue encontrado");
            
            em.getTransaction().begin();
            ingrediente.setNombre(ingredienteNuevo.getNombre());
            ingrediente.setUnidadMedida(ingredienteNuevo.getUnidadMedida());
            ingrediente.setStock(ingredienteNuevo.getStock());
            em.merge(ingrediente);
            em.getTransaction().commit();
            
            return ingrediente;
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new ModuloIngredientePersistenciaException("Error al editar el ingrediente: " + e.getMessage(), e);
        } finally {
            em.close();
        }
    }
}
