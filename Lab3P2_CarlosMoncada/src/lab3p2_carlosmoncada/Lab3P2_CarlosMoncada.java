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
                case 2:
                    vehiculos.add(agregarMotocicletas(vehiculos));
                    break;
                case 3:
                    vehiculos.add(agregarAutobus(vehiculos));
                    break;
                case 4:
                    if (vehiculos.size() > 0) {
                        modificar(vehiculos);
                    } else {
                        System.out.println("No hay vehiculos");
                    }

                    break;
                case 5:
                    if (vehiculos.size() > 0) {
                        eliminar(vehiculos);
                    } else {
                        System.out.println("No hay vehiculos");
                    }
                    break;
                case 6:
                    if (vehiculos.size() > 0) {
                        listarvehiculos(vehiculos);
                    } else {
                        System.out.println("No hay vehiculos");
                    }
                    break;
                case 7:
                    if (vehiculos.size() > 0) {
                        generarboleta(vehiculos);
                    } else {
                        System.out.println("No hay vehiculos");
                    }
            }
        }

    }

    public static Automoviles agregarAutomoviles(ArrayList<Vehiculos> vehiculos) {
        Scanner entrada = new Scanner(System.in);
        String placa = "", modelo, marca, tipo;
        Date año = new Date();
        Color color = Color.BLACK;
        String tipocombustible, tipo_Transmision;
        int num_Puertas, num_Asientos;
        do {
            System.out.println("Digite la placa");
            placa = entrada.nextLine();
            placa = entrada.nextLine();
        } while (validarplaca(placa, vehiculos) == false);

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
        modelo = entrada.nextLine();
        System.out.println("Digite la marca");
        marca = entrada.nextLine();

        System.out.println("Digite que tipo es su carro");
        tipo = entrada.nextLine();
        System.out.println("Digite el tipo de combustible de su carro");
        tipocombustible = entrada.nextLine();
        System.out.println("Tipos transmision\n1-Manual\n2-Automatico");
        int transmision = entrada.nextInt();
        while (transmision < 1 || transmision > 2) {
            System.out.println("Transmision fuera de rango");
            System.out.println("Tipos transmision\n1-Manual\n2-Automatico");
            transmision = entrada.nextInt();
        }
        if (transmision == 1) {
            tipo_Transmision = "manual";
        } else {
            tipo_Transmision = "automatico";
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
        do {
            System.out.println("Digite la placa");
            placa = entrada.nextLine();
            placa = entrada.nextLine();
        } while (validarplaca(placa, vehiculos) == false);

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
        String tipo_Transmision = "";
        System.out.println("Tipos transmision\n1-Manual\n2-Automatico");
        int transmision = entrada.nextInt();
        while (transmision < 1 || transmision > 2) {
            System.out.println("Transmision fuera de rango");
            System.out.println("Tipos transmision\n1-Manual\n2-Automatico");
            transmision = entrada.nextInt();
        }
        if (transmision == 1) {
            tipo_Transmision = "manual";
        } else {
            tipo_Transmision = "automatico";
        }
        return new Moto(velocidad_Max, peso, consumo_combustible, placa, modelo, marca, tipo_Transmision, año, color);

    }

    public static Autobus agregarAutobus(ArrayList<Vehiculos> vehiculos) {
        Scanner entrada = new Scanner(System.in);
        String placa = "", modelo, marca, tipo;
        Date año = new Date();
        Color color;
        boolean noesta = false;
        do {
            System.out.println("Digite la placa");
            placa = entrada.nextLine();
            placa = entrada.nextLine();
        } while (validarplaca(placa, vehiculos) == false);

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
        int capacidad_Pasajeros;
        int numejes;
        int longitud;
        System.out.println("Digite la capacidad de pasajeros");
        capacidad_Pasajeros = entrada.nextInt();
        while (capacidad_Pasajeros <= 0) {
            System.out.println("Capacidad incorrecta");
            System.out.println("Digite la capacidad de pasajeros");
            capacidad_Pasajeros = entrada.nextInt();
        }
        System.out.println("Digite el numero de ejes");
        numejes = entrada.nextInt();
        while (numejes <= 0) {
            System.out.println("Numero de ejes incorrecto");
            System.out.println("Digite el numero de ejes");
            numejes = entrada.nextInt();

        }
        System.out.println("Digite la longitud");
        longitud = entrada.nextInt();
        while (longitud <= 0) {
            System.out.println("Longitud incorrecta");
            System.out.println("Digite la longitud");
            longitud = entrada.nextInt();
        }
        System.out.println("Digite el tipo de combustible");
        String tipocombustible = entrada.nextLine();
        String tipo_Transmision = "";
        System.out.println("Tipos transmision\n1-Manual\n2-Automatico");
        int transmision = entrada.nextInt();
        while (transmision < 1 || transmision > 2) {
            System.out.println("Transmision fuera de rango");
            System.out.println("Tipos transmision\n1-Manual\n2-Automatico");
            transmision = entrada.nextInt();
        }
        if (transmision == 1) {
            tipo_Transmision = "manual";
        } else {
            tipo_Transmision = "automatico";
        }
        System.out.println("Digite la cantidad de puertas");

        int numpuertas = entrada.nextInt();
        while (numpuertas <= 0) {
            System.out.println("Puerta incorrecta");
            System.out.println("Digite la cantidad de puertas");

            numpuertas = entrada.nextInt();
        }
        return new Autobus(capacidad_Pasajeros, numejes, longitud, tipocombustible, tipo_Transmision, numejes, numpuertas, placa, modelo, marca, tipo, año, color);

    }

    public static void listarvehiculos(ArrayList<Vehiculos> vehiculos) {
        System.out.println("");
        for (int i = 0; i < vehiculos.size(); i++) {
            if (vehiculos.get(i) instanceof Automoviles) {
                System.out.println("Posicion" + i + "\n" + vehiculos.get(i));
                System.out.println("");
            }
        }
        System.out.println("");
        for (int i = 0; i < vehiculos.size(); i++) {
            if (vehiculos.get(i) instanceof Moto) {
                System.out.println("Posicion" + i + "\n" + vehiculos.get(i));
                System.out.println("");
            }
        }
        System.out.println("");
        for (int i = 0; i < vehiculos.size(); i++) {
            if (vehiculos.get(i) instanceof Autobus) {
                System.out.println("Posicion" + i + "\n" + vehiculos.get(i));
                System.out.println("");
            }
        }

    }

    public static void modificar(ArrayList<Vehiculos> vehiculos) {
        Scanner entrada = new Scanner(System.in);
        listarvehiculos(vehiculos);
        System.out.println("Digite la posicion de lo que quiere modificar");
        int posicion = entrada.nextInt();
        while (posicion < 0 || posicion > vehiculos.size() - 1) {
            System.out.println("Posicion fuera de rango");
            System.out.println("Digite la posicion de lo que quiere modificar");
            posicion = entrada.nextInt();
        }
        if (vehiculos.get(posicion) instanceof Automoviles) {
            String tipocombustible;
            String tipo_Transmision;
            int num_Puertas;
            int num_Asientos;
            String placa;
            String modelo;
            String marca;
            String tipo;
            Date año;
            Color color;
            System.out.println("Opciones a modificar\n"
                    + "1-Tipo de combustibles\n"
                    + "2-Tipos de transmisión\n"
                    + "3-Numero de Puertas\n"
                    + "4- Numero de Asientos \n"
                    + "5-placa\n"
                    + "6-modelo\n"
                    + "7-marca\n"
                    + "8-tipo de carro\n"
                    + "9-Anio\n"
                    + "10-Color");
            int opcion = entrada.nextInt();
            while (opcion < 1 || opcion > 10) {
                System.out.println("Posicion fuera de rango");
                System.out.println("Opciones a modificar\n"
                        + "1-Tipo de combustibles\n"
                        + "2-Tipos de transmisión\n"
                        + "3-Numero de Puertas\n"
                        + "4-Numero de Asientos \n"
                        + "5-placa\n"
                        + "6-modelo\n"
                        + "7-marca\n"
                        + "8-tipo de carro\n"
                        + "9-Anio\n"
                        + "10-Color");
                opcion = entrada.nextInt();
            }
            switch (opcion) {
                case 1:
                    System.out.println("Tipos combustibles\n"
                            + "1-Regular\n"
                            + "2-Super");
                    int tipointcomb = entrada.nextInt();
                    String tipocombus = "";
                    while (tipointcomb < 1 || tipointcomb > 2) {
                        System.out.println("Valor fuera de rango");
                        System.out.println("Tipos combustibles\n"
                                + "1-Regular\n"
                                + "2-Super");
                        tipointcomb = entrada.nextInt();
                    }
                    if (tipointcomb == 1) {
                        tipocombus = "regular";
                    } else {
                        tipocombus = "super";
                    }
                    ((Automoviles) vehiculos.get(posicion)).setTipocombustible(tipocombus);

                    break;
                case 2:
                    System.out.println("Tipos transmisiones\n"
                            + "1-Manual\n"
                            + "2-Automatica");
                    int transmision = entrada.nextInt();
                    String transmisionstring = "";
                    while (transmision < 1 || transmision > 2) {
                        System.out.println("Valor fuera de rango");
                        System.out.println("Tipos transmisiones\n"
                                + "1-Manual\n"
                                + "2-Automatica");
                        tipointcomb = entrada.nextInt();
                    }
                    if (transmision == 1) {
                        transmisionstring = "manual";
                    } else {
                        transmisionstring = "automatics";
                    }
                    ((Automoviles) vehiculos.get(posicion)).setTipo_Transmision(transmisionstring);

                    break;
                case 3:
                    System.out.println("Digite el numero de puertas");
                    int numpuertas = entrada.nextInt();
                    while (numpuertas <= 0) {
                        System.out.println("Numero de puertos");
                        System.out.println("Digite el numero de puertas");
                        numpuertas = entrada.nextInt();

                    }
                    ((Automoviles) vehiculos.get(posicion)).setNum_Puertas(numpuertas);
                    break;
                case 4:
                    System.out.println("Digite el numero de asientos");
                    int numasientos = entrada.nextInt();
                    while (numasientos <= 0) {
                        System.out.println("Numero de asientos");
                        System.out.println("Digite el numero de asientos");
                        numasientos = entrada.nextInt();

                    }
                    ((Automoviles) vehiculos.get(posicion)).setNum_Asientos(numasientos);
                    break;
                case 5:
                    do {
                        System.out.println("Digite la placa");
                        placa = entrada.nextLine();
                        placa = entrada.nextLine();
                    } while (validarplaca(placa, vehiculos) == false);

                    ((Automoviles) vehiculos.get(posicion)).setPlaca(placa);
                    break;
                case 6:
                    System.out.println("Digite el modelo");
                    String mode = entrada.nextLine();
                    mode = entrada.nextLine();
                    ((Automoviles) vehiculos.get(posicion)).setModelo(mode);
                    break;
                case 7:
                    System.out.println("Digite el marca de carro");
                    String marcacarro = entrada.nextLine();
                    marcacarro = entrada.nextLine();

                    ((Automoviles) vehiculos.get(posicion)).setMarca(marcacarro);
                    break;
                case 8:
                    System.out.println("Digite el tipo de carro");
                    String tipoCarro = entrada.nextLine();
                    tipoCarro = entrada.nextLine();

                    ((Automoviles) vehiculos.get(posicion)).setTipo(tipoCarro);
                    break;
                case 9:
                    System.out.println("Digite anio");
                    int anio = entrada.nextInt();
                    while (anio <= 0) {
                        System.out.println("Anio incorrecto");
                        System.out.println("Digite anio");
                        anio = entrada.nextInt();
                    }
                    Date anñazo = new Date();
                    anñazo.setYear(anio);
                    ((Automoviles) vehiculos.get(posicion)).setAño(anñazo);
                    break;
                case 10:
                    Color colorx = JColorChooser.showDialog(null, "Escoja color", Color.yellow);
                    ((Automoviles) vehiculos.get(posicion)).setColor(colorx);
                    break;

            }
        } else if (vehiculos.get(posicion) instanceof Moto) {
            System.out.println("Opciones a modificar\n"
                    + "1-Velocidad máxima\n"
                    + "2-peso\n"
                    + "3-consumo de combustible\n"
                    + "4-placa\n"
                    + "5- modelo\n"
                    + "6- marca\n"
                    + "7- tipo de carro\n"
                    + "8- año\n"
                    + "9-Color");
            int opcion = entrada.nextInt();
            while (opcion < 1 || opcion > 9) {
                System.out.println("Posicion fuera de rango");
                System.out.println("Opciones a modificar\n"
                        + "1-Velocidad máxima\n"
                        + "2-peso\n"
                        + "3-consumo de combustible\n"
                        + "4-placa\n"
                        + "5- modelo\n"
                        + "6- marca\n"
                        + "7- tipo de carro\n"
                        + "8- año\n"
                        + "9-Color");
                opcion = entrada.nextInt();
            }
            switch (opcion) {
                case 1:
                    System.out.println("Digite la velocidad maxima");
                    int velocidadmax = entrada.nextInt();
                    while (velocidadmax <= 0) {
                        System.out.println("Velocidad incorrecta");
                        System.out.println("Digite la velocidad maxima");
                        velocidadmax = entrada.nextInt();
                    }
                    ((Moto) vehiculos.get(posicion)).setVelocidad_Max(velocidadmax);

                    break;
                case 2:
                    System.out.println("Digite el peso");
                    double peso = entrada.nextDouble();
                    while (peso <= 0) {
                        System.out.println("Peso incorrecto");
                        System.out.println("Digite el peso");
                        peso = entrada.nextDouble();
                    }
                    ((Moto) vehiculos.get(posicion)).setPeso(peso);
                    break;
                case 3:
                    System.out.println("Digite el consumo del combustible");
                    int consumocombustible = entrada.nextInt();
                    while (consumocombustible <= 0) {
                        System.out.println("Consumo incorrecto");
                        System.out.println("Digite el consumo del combustible");
                        consumocombustible = entrada.nextInt();

                    }
                    ((Moto) vehiculos.get(posicion)).setConsumo_combustible(consumocombustible);
                    break;
                case 4:
                    String placa = "";
                    do {
                        System.out.println("Digite la placa");
                        placa = entrada.nextLine();
                        placa = entrada.nextLine();
                    } while (validarplaca(placa, vehiculos) == false);

                    ((Moto) vehiculos.get(posicion)).setPlaca(placa);
                    break;
                case 5:
                    System.out.println("Digit el modelo de la moto");
                    String modelo = entrada.nextLine();
                    modelo = entrada.nextLine();
                    ((Moto) vehiculos.get(posicion)).setModelo(modelo);
                    break;
                case 6:
                    System.out.println("Digit la marca de la moto");
                    String marca = entrada.nextLine();
                    marca = entrada.nextLine();
                    ((Moto) vehiculos.get(posicion)).setMarca(marca);
                    break;
                case 7:
                    System.out.println("Digite el tipo de carro");
                    String tipo = entrada.nextLine();
                    tipo = entrada.nextLine();
                    ((Moto) vehiculos.get(posicion)).setTipo(tipo);
                    break;
                case 8:
                    Date año = new Date();
                    System.out.println("Digite el año");
                    int añoint = entrada.nextInt();
                    while (añoint <= 0) {
                        System.out.println("Anio incorrecto");
                        System.out.println("Digite el año");
                        añoint = entrada.nextInt();
                    }
                    año.setYear(añoint);
                    ((Moto) vehiculos.get(posicion)).setAño(año);
                    break;
                case 9:
                    Color color = JColorChooser.showDialog(null, "Escoja color", Color.yellow);
                    ((Moto) vehiculos.get(posicion)).setColor(color);
                    break;

            }

        } else if (vehiculos.get(posicion) instanceof Autobus) {
            System.out.println("Opcion a modificar \n"
                    + "1-capacidad de Pasajeros \n"
                    + "2-Numero de ejes\n"
                    + "3-longitud\n"
                    + "4-Tipocombustible\n"
                    + "5-Tipo de transmisión\n"
                    + "6- Numero de puertas\n"
                    + "7-Numero de asientos\n"
                    + "8-placa\n"
                    + "9-modelo\n"
                    + "10-marca\n"
                    + "11-tipo\n"
                    + "12-año\n"
                    + "13-Color ");
            int opcion = entrada.nextInt();
            while (opcion < 1 || opcion > 13) {
                System.out.println("Opcion fuera de rango");
                System.out.println("Opcion a modificar \n"
                        + "1-capacidad de Pasajeros \n"
                        + "2-Numero de ejes\n"
                        + "3-longitud\n"
                        + "4-Tipocombustible\n"
                        + "5-Tipo de transmisión\n"
                        + "6- Numero de puertas\n"
                        + "7-Numero de asientos\n"
                        + "8-placa\n"
                        + "9-modelo\n"
                        + "10-marca\n"
                        + "11-tipo\n"
                        + "12-año\n"
                        + "13-Color ");
                opcion = entrada.nextInt();
            }
            switch (opcion) {
                case 1:
                    System.out.println("Digite la cantidad de pasajeros");
                    int cantpasajeros = entrada.nextInt();
                    while (cantpasajeros <= 0) {
                        System.out.println("Valor incorrecto");
                        System.out.println("Digite la cantidad de pasajeros");
                        cantpasajeros = entrada.nextInt();
                    }
                    ((Autobus) vehiculos.get(posicion)).setCapacidad_Pasajeros(cantpasajeros);
                    break;
                case 2:
                    System.out.println("Digite la cantidad de ejes");
                    int numejes = entrada.nextInt();
                    while (numejes <= 0) {
                        System.out.println("Valor incorrecto");
                        System.out.println("Digite la cantidad de ejes");
                        numejes = entrada.nextInt();
                    }
                    ((Autobus) vehiculos.get(posicion)).setNumejes(numejes);
                    break;
                case 3:
                    System.out.println("Digite la longitud");
                    int longitud = entrada.nextInt();
                    while (longitud <= 0) {
                        System.out.println("Digite la longitud");
                        longitud = entrada.nextInt();
                    }
                    ((Autobus) vehiculos.get(posicion)).setLongitud(longitud);
                    break;
                case 4:
                    System.out.println("Tipo combustible\n"
                            + "1-Super\n"
                            + "2-Regular");
                    int combustible = entrada.nextInt();
                    String n = "";
                    if (combustible == 1) {
                        n = "super";
                    } else {
                        n = "regular";

                    }
                    ((Autobus) vehiculos.get(posicion)).setTipocombustible(n);
                    break;
                case 5:
                    System.out.println("Tipo transmision\n"
                            + "1-Manual\n"
                            + "2-Automatica");
                    int transmision = entrada.nextInt();
                    String x = "";
                    if (transmision == 1) {
                        x = "manual";
                    } else {
                        x = "automatica";

                    }
                    ((Autobus) vehiculos.get(posicion)).setTipocombustible(x);
                    break;
                case 6:
                    System.out.println("Digite el numero de puertas");
                    int numpuertas = entrada.nextInt();
                    while (numpuertas <= 0) {
                        System.out.println("Digite el numero de puertas");
                        numpuertas = entrada.nextInt();
                    }
                    ((Autobus) vehiculos.get(posicion)).setNum_Puertas(numpuertas);
                    break;
                case 7:
                    System.out.println("Digite el numero de asientos");
                    int numasientos = entrada.nextInt();
                    while (numasientos <= 0) {
                        System.out.println("Digite el numero de asientos");
                        numasientos = entrada.nextInt();
                    }
                    ((Autobus) vehiculos.get(posicion)).setNum_Asientos(numasientos);
                    break;
                case 8:
                    String placa = "";

                    do {
                        System.out.println("Digite la placa");
                        placa = entrada.nextLine();
                        placa = entrada.nextLine();
                    } while (validarplaca(placa, vehiculos) == false);
                    ((Autobus) vehiculos.get(posicion)).setPlaca(placa);
                    break;
                case 9:
                    System.out.println("Digite el modelo");
                    String modelo = entrada.nextLine();
                    modelo = entrada.nextLine();
                    ((Autobus) vehiculos.get(posicion)).setModelo(modelo);
                case 10:
                    System.out.println("Digite la marca");
                    String marca = entrada.nextLine();
                    marca = entrada.nextLine();
                    ((Autobus) vehiculos.get(posicion)).setMarca(marca);
                    break;
                case 11:
                    System.out.println("Digite el tipo de autobus");
                    String tipo = entrada.nextLine();
                    tipo = entrada.nextLine();
                    ((Autobus) vehiculos.get(posicion)).setTipo(tipo);
                    break;
                case 12:
                    System.out.println("Digite el año");
                    int año = entrada.nextInt();
                    Date añodate = new Date();
                    añodate.setYear(año);
                    ((Autobus) vehiculos.get(posicion)).setAño(añodate);
                    break;
                case 13:
                    Color color = JColorChooser.showDialog(null, "Escoja color", Color.yellow);
                    ((Autobus) vehiculos.get(posicion)).setColor(color);
                    break;

            }
        }
    }

    public static void eliminar(ArrayList<Vehiculos> vehiculos) {
        Scanner entrada = new Scanner(System.in);
        listarvehiculos(vehiculos);
        System.out.println("Digite la posicion a eliminar");
        int posicion = entrada.nextInt();
        while (posicion < 0 || posicion > vehiculos.size() - 1) {
            System.out.println("Valor fuera de rango");
            System.out.println("Digite la posicion a eliminar");
            posicion = entrada.nextInt();
        }

        vehiculos.remove(posicion);

    }

    public static void generarboleta(ArrayList<Vehiculos> vehiculos) {
        Scanner entrada = new Scanner(System.in);
        listarvehiculos(vehiculos);
        System.out.println("Digite la posicion a eliminar");
        int posicion = entrada.nextInt();
        while (posicion < 0 || posicion > vehiculos.size() - 1) {
            System.out.println("Valor fuera de rango");
            System.out.println("Digite la posicion a eliminar");
            posicion = entrada.nextInt();
        }
        int total = 275 + 250;
        if (vehiculos.get(posicion) instanceof Automoviles) {
            total += 1200;
        } else if (vehiculos.get(posicion) instanceof Moto) {
            total += 200;
        } else if (vehiculos.get(posicion) instanceof Autobus) {
            total += 1000;
        }
        System.out.println(vehiculos.get(posicion));
        System.out.println("Este es el total a pagar " + total);

    }

    public static boolean validarplaca(String placa, ArrayList<Vehiculos> vehiculos) {
        int contdigitos = 0;
        int contcaracteres = 0;
        for (int i = 0; i < placa.length(); i++) {
            int codigoasci = (char) placa.charAt(i);
            if ((codigoasci >= 97 && codigoasci <= 122) || ((codigoasci >= 65 && codigoasci <= 90))) {
                contcaracteres++;
            } else if (((codigoasci >= 48 && codigoasci <= 57))) {
                contdigitos++;
            }
        }
        boolean si = false;
        for (int i = 0; i < vehiculos.size(); i++) {
            if (placa.equalsIgnoreCase(vehiculos.get(i).getPlaca()) == true) {
                si = true;
            }
        }
        if ((placa.length() == 7) && (contdigitos == 4) && (contcaracteres == 3) && (si == true)) {
            return true;
        } else {
            return false;
        }

    }

}
