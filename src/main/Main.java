/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import main.beans.Barco;
import main.creador.FactoryDAO;
import main.creador.FactoryBarcosChinos;
import main.creador.FactoryBarcosRusos;

/**
 *
 * @author Davalos
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FactoryDAO f = new FactoryBarcosChinos();
        Barco chino = f.crearBarco();
        
        f = new FactoryBarcosRusos();
        Barco ruso = f.crearBarco();
        
        
        chino.disparar();
        ruso.disparar();
        
    }
    
}
