/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_carlosmoncada;

import java.awt.Color;
import java.util.Date;

/**
 *
 * @author calol
 */
public class Vehiculos {
 String placa,modelo,marca,tipo;
 Date año;
 Color color;

    public Vehiculos(String placa, String modelo, String marca, String tipo, Date año, Color color) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.tipo = tipo;
        this.año = año;
        this.color = color;
    }
 

    


    
    

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getAño() {
        return año;
    }

    public void setAño(Date año) {
        this.año = año;
    }

    

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return  "Placa =" + placa + "\nmodelo =" + modelo + "\nmarca =" + marca + "\ntipo =" + tipo + "\nanio =" + año.getYear() ;
    }
    
 
 
 
}
