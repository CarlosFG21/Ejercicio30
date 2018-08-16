/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio30video36;

/**
 *
 * @author DELL
 */
public class Ejercicio30Video36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        empleados trabajador1 = new empleados("PACO");
        
        empleados trabajador2 = new empleados("ANA");
        
        trabajador1.cambiaSeccion("RRHH");
        
        System.out.println(trabajador1.devuelveDatos());
        
        System.out.println(trabajador2.devuelveDatos());
    }
    
}
