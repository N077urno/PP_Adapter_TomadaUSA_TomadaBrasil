/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adapterjavatomada;

/**
 *
 * @author nando
 */
public class TomadaBrasil {
    double radius;
    
    public TomadaBrasil(double radius){
        this.radius = radius;
    }
    
    public double getRadius(){
        return this.radius;
    }
    
    public boolean fits(PinoRedondo pino){
        return(this.getRadius()>=pino.getRadius());
    }
    
}
