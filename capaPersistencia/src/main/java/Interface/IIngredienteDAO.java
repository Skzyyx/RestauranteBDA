/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interface;

import Entidades.FreddyAliCastroRoman.Ingrediente;
import Exception.ModuloIngredientePersistenciaException;

/**
 *
 * @author LyFredD
 */
public interface IIngredienteDAO {
    
    public Ingrediente agregarIngrediente(Ingrediente ingrediente) throws ModuloIngredientePersistenciaException;
    
    public Ingrediente editarIngrediente(Long idIngrediente, Ingrediente ingredienteNuevo) throws ModuloIngredientePersistenciaException;
    
    
    
}
