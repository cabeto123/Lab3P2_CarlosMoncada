/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ayuda;

/**
 *
 * @author calol
 */
public class Ayuda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String placa="";
           boolean noesta = false;
            placa+="H";
            for (int i = 0; i < 7; i++) {
                if (i>=0&&i<=2) {
                    char letra= (char) ((Math.random() * (122 - 97)) + 97);
                    placa+=letra;
                }else{
                    placa+= (int) ((Math.random() * (122 - 97)) + 97);
                
                
    }
                System.out.println("Placa "+placa);   
            }
}
}
