/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adapterjavatomada;

/**
 *
 * @author nando
 */
public class AdaptadorQuadradoRedondo extends PinoRedondo {
    PinoQuadrado pinoQ;
    
    public AdaptadorQuadradoRedondo(PinoQuadrado pino){
        this.pinoQ = pino;
    }
    
    @Override
    public double getRadius(){
        double result;
        
        result = (Math.sqrt(Math.pow((this.pinoQ.getWidth()/2), 2)*2));
        
        return(result);
    }
}
