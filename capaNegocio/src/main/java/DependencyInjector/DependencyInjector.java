/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DependencyInjector;

import BO.ModuloProducto.ProductoBO;
import Interface.IProductoBO;

/**
 *
 * @author skyro
 */
public class DependencyInjector {
    
    public static IProductoBO crearProductoBO() {
        return ProductoBO.getInstance();
    }
}
