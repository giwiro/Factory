/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main.creador;

import main.beans.Barco;
import main.beans.BarcoChino;
import main.beans.BarcoRuso;

/**
 *
 * @author Davalos
 */
public class Factory implements Creador{

    @Override
    public BarcoChino factoryBarcoChino() {
        return new BarcoChino();
    }

    @Override
    public BarcoRuso factoryBarcoRuso() {
        return new BarcoRuso();
    }
    
}
