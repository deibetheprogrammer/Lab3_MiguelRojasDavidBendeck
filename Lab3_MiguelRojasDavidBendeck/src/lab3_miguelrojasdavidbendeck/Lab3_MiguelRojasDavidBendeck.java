/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_miguelrojasdavidbendeck;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author davidbendeck
 */
public class Lab3_MiguelRojasDavidBendeck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        // hola que pexis
        
        ArrayList<Persona> agentesLibres = new ArrayList<>();
        
        OUTER:
        while(true) {
            System.out.print("Menu: \n"
                    + "1) Crear equipo\n"
                    + "2) Despedir personal\n"
                    + "3) Jugar partido\n"
                    + "4) Entrenar\n"
                    + "5) Salir\n"
                    + "Su opcion: ");
            int opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break OUTER;
            }
        }
    }
    
}
