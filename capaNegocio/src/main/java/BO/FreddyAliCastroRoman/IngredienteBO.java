/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BO.FreddyAliCastroRoman;

import DAO.FreddyAliCastroRoman.IngredienteDAO;
import DTO.FreddyAliCastroRoman.IngredienteNuevoDTO;
import DTO.FreddyAliCastroRoman.IngredienteViejoDTO;
import Exception.ModuloIngredienteNegocioException;
import Exception.ModuloIngredientePersistenciaException;
import Mapper.IngredienteMapper;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LyFredD
 */
public class IngredienteBO {
    
    private static IngredienteBO instance;
    private static IngredienteDAO ingredienteDAO;
    
    private IngredienteBO() {
        this.ingredienteDAO = IngredienteDAO.getInstance();
    }
    
    public static IngredienteBO getInstance() {
        if (instance == null) {
            instance = new IngredienteBO();
        }
        return instance;
    }
    
    
    public IngredienteViejoDTO agregarIngrediente(IngredienteNuevoDTO ingrediente) throws ModuloIngredienteNegocioException {
        
        if (ingrediente == null) throw new ModuloIngredienteNegocioException("El ingrediente no puede ser nulo.");
        
        if (ingrediente.getNombre() == null || ingrediente.getNombre().trim().isEmpty()) 
            throw new ModuloIngredienteNegocioException("El nombre del ingrediente no puede ser nulo o vacio.");
        
        if (ingrediente.getUnidadMedida() == null) 
            throw new ModuloIngredienteNegocioException("La unidad de medida del ingrediente no puede ser nula.");
        
        if (ingrediente.getStock() == null || ingrediente.getStock() <= 0) 
            throw new ModuloIngredienteNegocioException("El stock del ingrediente debe ser mayor a cero.");
        
        try {
            return IngredienteMapper.toViejoDTO(ingredienteDAO.agregarIngrediente(IngredienteMapper.toEntity(ingrediente)));
        } catch (ModuloIngredientePersistenciaException ex) {
            Logger.getLogger(IngredienteBO.class.getName()).log(Level.SEVERE, null, ex);
            throw new ModuloIngredienteNegocioException("Ocurrió un error al agregar el ingrediente: " + ex.getMessage());
        }
    }
    
    
    public IngredienteViejoDTO editarIngrediente(IngredienteViejoDTO ingrediente) throws ModuloIngredienteNegocioException {
         
        if (ingrediente == null) throw new ModuloIngredienteNegocioException("El ingrediente no puede ser nulo.");
        
        if (ingrediente.getNombre() == null || ingrediente.getNombre().trim().isEmpty()) 
            throw new ModuloIngredienteNegocioException("El nombre del ingrediente no puede ser nulo o vacio.");
        
        if (ingrediente.getUnidadMedida() == null) 
            throw new ModuloIngredienteNegocioException("La unidad de medida del ingrediente no puede ser nula.");
        
        if (ingrediente.getStock() == null || ingrediente.getStock() <= 0) 
            throw new ModuloIngredienteNegocioException("El stock del ingrediente debe ser mayor a cero.");
        
        try {
            return IngredienteMapper.toViejoDTO(ingredienteDAO.editarIngrediente(ingrediente.getId(), IngredienteMapper.toEntity(ingrediente)));
        } catch (ModuloIngredientePersistenciaException ex) {
            Logger.getLogger(IngredienteBO.class.getName()).log(Level.SEVERE, null, ex);
            throw new ModuloIngredienteNegocioException("Ocurrió un error al editar el ingrediente: " + ex.getMessage());
        }
    }
    
}
