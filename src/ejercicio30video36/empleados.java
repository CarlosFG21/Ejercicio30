
package ejercicio30video36;

import java.util.*;

public class empleados {
    
    public empleados(String nom){
        
        nombre = nom;
        seccion = "Administracion";
        
    }
    
    public void cambiaSeccion(String seccion){
        
        this.seccion = seccion;
        
    }
    
    
    public String devuelveDatos(){
        
        return "EL NOMBRE ES: " + nombre + " Y LA SECCION ES " + seccion;
        
    }
    
    private final String nombre;
    private String seccion;
    
    
    
}
