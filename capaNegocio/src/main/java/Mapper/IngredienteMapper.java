/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mapper;

import DTO.FreddyAliCastroRoman.IngredienteNuevoDTO;
import DTO.FreddyAliCastroRoman.IngredienteViejoDTO;
import Entidades.FreddyAliCastroRoman.Ingrediente;

/**
 *
 * @author LyFredD
 */
public class IngredienteMapper {
    
    public static Ingrediente toEntity(IngredienteNuevoDTO dto) {
        return new Ingrediente(
                dto.getNombre(),
                dto.getUnidadMedida(),
                dto.getStock()
        );
    }
    
    public static Ingrediente toEntity(IngredienteViejoDTO dto) {
        return new Ingrediente(
                dto.getId(),
                dto.getNombre(),
                dto.getUnidadMedida(),
                dto.getStock()
        );
    }
    
    public static IngredienteViejoDTO toViejoDTO(Ingrediente ingrediente) {
        return new IngredienteViejoDTO(
                ingrediente.getId(),
                ingrediente.getNombre(),
                ingrediente.getUnidadMedida(),
                ingrediente.getStock()
        );
    }
    
    public static IngredienteNuevoDTO toNuevoDTO(Ingrediente ingrediente) {
        return new IngredienteNuevoDTO(
                ingrediente.getNombre(),
                ingrediente.getUnidadMedida(),
                ingrediente.getStock()
        );
    }
    
}
