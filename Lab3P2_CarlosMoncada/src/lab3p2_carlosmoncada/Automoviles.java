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
public class Automoviles extends Vehiculos {

    String tipocombustible, tipo_Transmision;
    int num_Puertas, num_Asientos;

    public Automoviles(String tipocombustible, String tipo_Transmision, int num_Puertas, int num_Asientos, String placa, String modelo, String marca, String tipo, Date año, Color color) {
        super(placa, modelo, marca, tipo, año, color);
        this.tipocombustible = tipocombustible;
        this.tipo_Transmision = tipo_Transmision;
        this.num_Puertas = num_Puertas;
        this.num_Asientos = num_Asientos;
    }


   
   

    
    
    

    public String getTipocombustible() {
        return tipocombustible;
    }

    public void setTipocombustible(String tipocombustible) {
        this.tipocombustible = tipocombustible;
    }

    public String getTipo_Transmision() {
        return tipo_Transmision;
    }

    public void setTipo_Transmision(String tipo_Transmision) {
        this.tipo_Transmision = tipo_Transmision;
    }

    public int getNum_Puertas() {
        return num_Puertas;
    }

    public void setNum_Puertas(int num_Puertas) {
        this.num_Puertas = num_Puertas;
    }

    public int getNum_Asientos() {
        return num_Asientos;
    }

    public void setNum_Asientos(int num_Asientos) {
        this.num_Asientos = num_Asientos;
    }

    public Date getAño() {
        return año;
    }

    public void setAño(Date año) {
        this.año = año;
    }

    @Override
    public String getPlaca() {
        return placa;
    }

    @Override
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return  super.toString() +"\nTipo de combustible= " + tipocombustible + "\nTipo de Transmision= " + tipo_Transmision + "\nNumero de Puertas = " + num_Puertas + "\nNumero de Asientos= " + num_Asientos ;
    }
    

}
