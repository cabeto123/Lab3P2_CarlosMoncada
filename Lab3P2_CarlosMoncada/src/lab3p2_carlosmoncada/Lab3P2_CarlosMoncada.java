/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p2_carlosmoncada;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JColorChooser;

/**
 *
 * @author calol
 */
public class Lab3P2_CarlosMoncada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Vehiculos> vehiculos = new ArrayList();
        int opcion = 0;
        while (opcion != 8) {
            System.out.println("1-Agregar automovil\n"
                    + "2-Agregar motocicletas\n"
                    + "3-Agregar Autobus\n"
                    + "4.Modificar vehiculo\n"
                    + "5-Eliminar vehiculo\n"
                    + "6-Mostrar vehiculo\n"
                    + "7-Genera boleta"
                    + "\n8-Salir");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    vehiculos.add(agregarAutomoviles(vehiculos));
                    System.out.println("Vehiculo agregado correctamente");

                    break;
                case 2:vehiculos.add(agregarMotocicletas(vehiculos));

            }
        }

    }

    public static Automoviles agregarAutomoviles(ArrayList<Vehiculos> vehiculos) {
        Scanner entrada = new Scanner(System.in);
        String placa = "", modelo, marca, tipo;
        Date año = new Date();
        Color color;
        String tipocombustible, tipo_Transmision;
        int num_Puertas, num_Asientos;

        boolean noesta = false;
        while (noesta == false) {
            placa="";
            noesta = false;
            placa+="H";
            for (int i = 0; i < 7; i++) {
                if (i>=0&&i<=2) {
                    char letra= (char) ((Math.random() * (122 - 97)) + 97);
                    placa+=letra;
                }else{
                    placa+= (int) ((Math.random() * (122 - 97)) + 97);
                
                }
    
            }
            for (int i = 0; i < vehiculos.size(); i++) {
                if (placa.equalsIgnoreCase(vehiculos.get(i).getPlaca()) == true) {
                    noesta = true;
                }

            }
        }
        System.out.println("Digite año");
        int añoint = entrada.nextInt();
        while (añoint <= 0) {
            System.out.println("Año incorrecto");
            System.out.println("Digite año");
            añoint = entrada.nextInt();
        }
        año.setYear(añoint);
        color = JColorChooser.showDialog(null, "Seleccione color", Color.gray);
        System.out.println("Digite modelo");
        modelo = entrada.nextLine();
        System.out.println("Digite la marca");
        marca = entrada.nextLine();
        System.out.println("Digite que tipo es su carro");
        tipo = entrada.nextLine();
        System.out.println("Digite el tipo de combustible de su carro");
        tipocombustible = entrada.nextLine();
        System.out.println("Tipos transmision\n1-Manual\n2-Automatico");
        int transmision = entrada.nextInt();
        while (transmision<1||transmision>2) {            
            System.out.println("Transmision fuera de rango");
            System.out.println("Tipos transmision\n1-Manual\n2-Automatico");
         transmision = entrada.nextInt();
        }
        if (transmision==1) {
            tipo_Transmision="manual";
        }else{
            tipo_Transmision="automatico";
        }
        System.out.println("Digite la cantidad de puertas");
        num_Puertas = entrada.nextInt();
        while (num_Puertas <= 0) {
            System.out.println("Puertas incorrectas");
            System.out.println("Digite la cantidad de puertas");
            num_Puertas = entrada.nextInt();
        }
        System.out.println("Digite la cantidad de Asientos");
        num_Asientos = entrada.nextInt();
        while (num_Asientos <= 0) {
            System.out.println("Asientos incorrectas");
            System.out.println("Digite la cantidad de Asientos");
            num_Asientos = entrada.nextInt();
        }

        return new Automoviles(tipocombustible, tipo_Transmision, num_Puertas, num_Asientos, placa, modelo, marca, tipo, año, color);
    }

    public static Moto agregarMotocicletas(ArrayList<Vehiculos> vehiculos) {
        Scanner entrada = new Scanner(System.in);
        String placa = "", modelo, marca, tipo;
        Date año = new Date();
        Color color;
        boolean noesta = false;
        while (noesta == false) {
            noesta = false;
            placa += "B" + (int) ((Math.random() * (1000 - 0)) + 0);
            for (int i = 0; i < vehiculos.size(); i++) {
                if (placa.equalsIgnoreCase(vehiculos.get(i).getPlaca()) == true) {
                    noesta = true;
                }

            }
        }
        System.out.println("Digite modelo");
        modelo = entrada.nextLine();
        System.out.println("Digite la marca");
        marca = entrada.nextLine();
        System.out.println("Digite que tipo es su carro");
        tipo = entrada.nextLine();
        System.out.println("Digite año");
        int añoint = entrada.nextInt();
        while (añoint <= 0) {
            System.out.println("Año incorrecto");
            System.out.println("Digite año");
            añoint = entrada.nextInt();
        }
        año.setYear(añoint);
        color = JColorChooser.showDialog(null, "Seleccione color", Color.gray);
        int velocidad_Max;
        double peso;
        int consumo_combustible;
        System.out.println("Digite la velocidad maxima");
        velocidad_Max = entrada.nextInt();
        while (velocidad_Max <= 0) {
            System.out.println("Velocidad incorrecta");
            System.out.println("Digite la velocidad maxima");
            velocidad_Max = entrada.nextInt();
        }
        System.out.println("Digite el peso");
        peso = entrada.nextDouble();
        while (peso <= 0) {
            System.out.println("Peso incorrecta");
            System.out.println("Digite el peso");
            peso = entrada.nextDouble();
        }
        System.out.println("Digite el consumo de combustible");
        consumo_combustible = entrada.nextInt();
        while (consumo_combustible <= 0) {
            System.out.println("Digite el consumo de combustible");
            System.out.println("Digite el consumo de combustible");
            consumo_combustible = entrada.nextInt();
        }
        
        return new Moto(velocidad_Max, peso, consumo_combustible, placa, modelo, marca, tipo, año, color);
    }

}
