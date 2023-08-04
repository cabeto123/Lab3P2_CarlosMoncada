/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_carlosmoncada;

import java.awt.Color;

/**
 *
 * @author calol
 */
public class Moto extends Vehiculos{
    int velocidad_Max;
    double peso;
    int consumo_combustible;

    public Moto(int velocidad_Max, double peso, int consumo_combustible, String placa, String modelo, String marca, String tipo, int año, Color color) {
        super(placa, modelo, marca, tipo, año, color);
        this.velocidad_Max = velocidad_Max;
        this.peso = peso;
        this.consumo_combustible = consumo_combustible;
    }

    public int getVelocidad_Max() {
        return velocidad_Max;
    }

    public void setVelocidad_Max(int velocidad_Max) {
        this.velocidad_Max = velocidad_Max;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getConsumo_combustible() {
        return consumo_combustible;
    }

    public void setConsumo_combustible(int consumo_combustible) {
        this.consumo_combustible = consumo_combustible;
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

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
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
        return super.toString() + "Velocidad Maxima=" + velocidad_Max + "Peso=" + peso + "consumo de combustible=" + consumo_combustible ;
    }
    
}
