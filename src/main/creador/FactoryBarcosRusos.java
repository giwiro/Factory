/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main.creador;

import main.beans.Barco;
import main.beans.BarcoRuso;

/**
 *
 * @author Davalos
 */
public class FactoryBarcosRusos implements FactoryDAO{

    @Override
    public Barco crearBarco() {
        return new BarcoRuso();
    }
    
}
