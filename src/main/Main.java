/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import main.beans.Barco;
import main.creador.Creador;
import main.creador.Factory;

/**
 *
 * @author Davalos
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Creador c = new Factory();
        Barco chino = c.factoryBarcoChino();
        Barco ruso = c.factoryBarcoRuso();
        
        chino.disparar();
        ruso.disparar();
    }
    
}
