/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba1;

/**
 *
 * @author David
 */
public class Estadio {
    String nombre_estadio;
    double capacidad;
    String tipo_deporte;
    
    public void setNombre_estadio(String n){
        nombre_estadio = n;    
    }
    //metodos set y get
    public void setCapacidad(double cp){
        capacidad = cp;
    } 
    
    public void setTipo_deporte(String td){
        tipo_deporte = td;
    }
    
    public String getNombre_estadio(){
        return nombre_estadio;
    }
    
    public double getCapacidad(){
        return capacidad;
    }
    
    public String getTipo_deporte(){
        return tipo_deporte;
    }
    
    @Override
    public String toString(){
        return String.format("Nombre del estadio: %s\n Capacidad: %s\n TIpo de deporte: %s", getNombre_estadio(), getCapacidad(), getTipo_deporte());
    }

}
