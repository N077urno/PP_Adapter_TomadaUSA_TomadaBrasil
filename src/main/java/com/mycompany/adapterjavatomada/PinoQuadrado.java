/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adapterjavatomada;

/**
 *
 * @author nando
 */
public class PinoQuadrado {
    double width;
    
    public PinoQuadrado(double width){
        this.width = width;
    }
    
    public double getWidth(){
        return(this.width);
    }
    
    public double getPinoMaior(){
        return(Math.pow(this.width, 2));
    }
}
