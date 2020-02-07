/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_miguelrojasdavidbendeck;

import java.util.ArrayList;
import java.util.Random;
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
        Random rand = new Random();
        // hola que pexis
        
        ArrayList<Persona> agentesLibres = new ArrayList<>();
        ArrayList<Equipo> equipos = new ArrayList<>();
        
        int posicion;
        int count = 0;
        
        String vs;
        
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
            vs = sc.nextLine();
            
            switch (opcion) {
                case 1:
                    
                    break;
                case 2:
                    
                    System.out.print("Que tipo de personal desea despedir: \n"
                            + "1) Jugadores\n"
                            + "2) Médicos \n"
                            + "3) Entrenadores\n");
                    opcion = sc.nextInt();
                    vs = sc.nextLine();
                    
                    switch (opcion) {
                        case 1:
                            
                            break;
                        case 2:
                            
                            break;
                        case 3:
                            
                            break;
                    }
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    //Falta mejorar esta opción
                    
                    System.out.println("Elija el equipo (ingrese la posicion en la lista de equipos): ");
                    posicion = sc.nextInt();
                    vs = sc.nextLine();
                    
                    System.out.println("Elija un preparador físico (ingrese la posición de la lista de preparadores físicos");
                    int posEnt = sc.nextInt();
                    vs = sc.nextLine();
                    
                    while (count < 3) {
                        System.out.println("Elija una jugada (ingrese la posición de la lista de jugadas): ");
                        int posJug = sc.nextInt();
                        
                        if (rand.nextInt(2) == 0) {
                            System.out.println("Jugada completada con éxito !");
                        }
                        
                        else {
                            System.out.println("Jugada fallida");
                        }
                    }
                    
                    count = 0;
                    
                    break;
                case 5:
                    
                    break OUTER;
            }
        }
    }
    
}
