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
public class Autobus extends  Automoviles{
    int capacidad_Pasajeros;
    int numejes;
    int longitud;

    public Autobus(int capacidad_Pasajeros, int numejes, int longitud, String tipocombustible, String tipo_Transmision, int num_Puertas, int num_Asientos, String placa, String modelo, String marca, String tipo, Date año, Color color) {
        super(tipocombustible, tipo_Transmision, num_Puertas, num_Asientos, placa, modelo, marca, tipo, año, color);
        this.capacidad_Pasajeros = capacidad_Pasajeros;
        this.numejes = numejes;
        this.longitud = longitud;
    }

    
    

    

    

    public int getCapacidad_Pasajeros() {
        return capacidad_Pasajeros;
    }

    public void setCapacidad_Pasajeros(int capacidad_Pasajeros) {
        this.capacidad_Pasajeros = capacidad_Pasajeros;
    }

    public int getNumejes() {
        return numejes;
    }

    public void setNumejes(int numejes) {
        this.numejes = numejes;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
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
        return super.toString()+" Autobus{" + "capacidad_Pasajeros=" + capacidad_Pasajeros + ", numejes=" + numejes + ", longitud=" + longitud + '}';
    }
    
    
    
}
