/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.adapterjavatomada;

/**
 *
 * @author nando
 */
public class AdapterJavaTomada {

    public static void main(String[] args) {
        TomadaBrasil brasil10 = new TomadaBrasil(10);
        PinoRedondo pino10 = new PinoRedondo(10);
        
        if(brasil10.fits(pino10)){
            System.out.println("O pino de 10A cabe na no tamada de 10A");
        }else {
            System.out.println("O pino de 10A nao cabe na no tamada de 10A");
        }
        
        PinoQuadrado pinoQuadrado10 = new PinoQuadrado(10);
        AdaptadorQuadradoRedondo pequeno = new AdaptadorQuadradoRedondo(pinoQuadrado10);

        if(brasil10.fits(pequeno))
        {
            System.out.println("O pino Quadrado 10A coube na tomada redonda de 10A");
        }else {
            System.out.println("O pino Quadrado 10A nao coube na tomada redonda de 10A");
        }
        
        PinoQuadrado pinoQuadrado20 = new PinoQuadrado(20);
        AdaptadorQuadradoRedondo grande = new AdaptadorQuadradoRedondo(pinoQuadrado20);
        
        if(brasil10.fits(grande)){
            System.out.println("O pino Quadrado 20A coube na tomada redonda de 10A");
        }else {
            System.out.println("O pino Quadrado 20A nao coube na tomada redonda de 10A");
        }
    }
}
