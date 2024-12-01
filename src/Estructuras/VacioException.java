/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

/**
 *
 * @author pablo
 */
public class VacioException extends Exception {
    
    private static VacioException unicaInstancia=null;
    
    private VacioException(){
        super("El Array esya vacio");
    }
    public static VacioException getInstancia()
    {
        if (unicaInstancia==null){
            unicaInstancia = new VacioException();
            
        }
            return unicaInstancia; 
    }
}
