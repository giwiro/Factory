/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main.beans;

/**
 *
 * @author Davalos
 */
public class BarcoChino implements Barco{
    private String cod;
    private int pasajeros;
    private final String nacionalidad = "chino";
    
    public BarcoChino(){
        
    }

    public BarcoChino(String cod, int pasajeros) {
        this.cod = cod;
        this.pasajeros = pasajeros;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    @Override
    public void disparar() {
        System.out.println("Barco " + nacionalidad + " disparó");
    }
    
    
    
}
