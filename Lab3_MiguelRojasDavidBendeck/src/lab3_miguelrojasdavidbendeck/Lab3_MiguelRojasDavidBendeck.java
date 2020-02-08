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
        while (true) {
            System.out.print("Menu: \n"
                    + "1) Crear equipo\n"
                    + "2) Despedir personal\n"
                    + "3) Jugar partido\n"
                    + "4) Entrenar\n"
                    + "5) Eliminar Equipo"
                    + "6) Listar Mercado"
                    + "7) Salir"
                    + "Su opcion: ");
            int opcion = sc.nextInt();
            vs = sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Crear Equipo");
                    System.out.print("Ingrese nombre del equipo: ");
                    String nom_equipo = sc.nextLine();
                    System.out.print("Ingrese anio de Fundacion: ");
                    int an_fundado = sc.nextInt();
                    vs = sc.nextLine();
                    System.out.print("Ingrese numero de Campeonatos Ganados: ");
                    int num_campeonato = sc.nextInt();
                    vs = sc.nextLine();
                    equipos.add(new Equipo(nom_equipo, an_fundado, num_campeonato));
                    System.out.println("Agregar el Personal");
                    System.out.println("Agregue los Jugadores");
                    while (count < 13) {
                        //Atributos Persona
                        System.out.print("Ingrese nombre del Jugador: ");
                        String nombre = sc.nextLine();
                        System.out.print("Ingrese apellido del Jugador: ");
                        String apellido = sc.nextLine();
                        System.out.print("Ingrese Anios como Profesional :");
                        int anios_prof = sc.nextInt();
                        vs = sc.nextLine();
                        System.out.print("Ingrese Salario del Jugador: ");
                        int salary = sc.nextInt();
                        vs = sc.nextLine();
                        //Atributos Jugador
                        System.out.print("Ingrese numero en la camiseta: ");
                        int num_camisa = sc.nextInt();
                        vs = sc.nextLine();
                        System.out.print("Ingrese Rating de Tiro de 3: ");
                        int tiro_3 = sc.nextInt();
                        vs = sc.nextLine();
                        System.out.print("Ingrese Rating de Defensa: ");
                        int defensa = sc.nextInt();
                        vs = sc.nextLine();
                        System.out.println("Ingrese Rating de Tiro de Media: ");
                        int tiro_media = sc.nextInt();
                        vs = sc.nextLine();
                        System.out.print("Ingrese Rating de Rebote: ");
                        int rebote = sc.nextInt();
                        vs = sc.nextLine();
                        System.out.print("Ingrese Rating de Bandeja: ");
                        int bandeja = sc.nextInt();
                        vs = sc.nextLine();
                        System.out.print("Ingrese Rating de Pases: ");
                        int pases = sc.nextInt();
                        vs = sc.nextLine();
                        System.out.print("Ingrese Rating de Posteo: ");
                        int posteo = sc.nextInt();
                        vs = sc.nextLine();
                        Double altura = 0.0;
                        System.out.println("Altura");
                        System.out.println("[1] Altura = 1.93m");
                        System.out.println("[2] Altura = 2.00m");
                        System.out.println("[3] Altura = 2.05m");
                        System.out.println("[4] Altura = 2.10m");
                        System.out.println("[5] Altura = 2.13m");
                        System.out.print("Seleccione una altura: ");
                        int opcion_alt = sc.nextInt();
                        vs = sc.nextLine();
                        switch (opcion_alt) {
                            case 1:
                                altura = 1.93;
                                System.out.println("Su jugador es Base");
                                break;
                            case 2:
                                altura = 2.00;
                                System.out.println("Su jugador es Escolta");
                                break;
                            case 3:
                                System.out.println("Su jugador Es Alero");
                                altura = 2.05;
                                break;
                            case 4:
                                System.out.println("Su jugador es Alero-Pivot");
                                altura = 2.10;
                                break;
                            case 5:
                                System.out.println("Su jugador es Centro");
                                altura = 2.13;
                                break;
                            default:
                                System.out.println("Ingrese una opcion valida");
                        }

                        equipos.get(equipos.size() - 1).getJug().add(new Jugador(num_camisa, tiro_3, defensa, tiro_media, rebote, bandeja, pases, posteo, altura, nombre, apellido, anios_prof, salary));
                        count++;
                    }//Fin Agregar Jugadores
                    count = 0;
                    System.out.println("Agregar Medicos");

                    while (true) {
                        System.out.print("Ingrese nombre del medico: ");
                        String nombre = sc.nextLine();
                        System.out.print("Ingrese apellido del medico: ");
                        String apellido = sc.nextLine();
                        System.out.print("Ingrese Anios como medico :");
                        int an_profesional = sc.nextInt();
                        vs = sc.nextLine();
                        System.out.print("Ingrese Salario del medico: ");
                        int salario = sc.nextInt();
                        vs = sc.nextLine();

                        System.out.println("Ingrese el Colegio del medico");
                        String colegio = sc.nextLine();

                        System.out.print("Tipo de medico: \n"
                                + "1) Medico general\n"
                                + "2) Cirujano\n"
                                + "3) Terapeuta\n"
                                + "Su opcion: ");
                        opcion = sc.nextInt();
                        vs = sc.nextLine();

                        switch (opcion) {
                            case 1:

                                System.out.println("Ingrese el numero de enfermedades curadas");
                                int num_enfermedades = sc.nextInt();
                                vs = sc.nextLine();

                                equipos.get(equipos.size() - 1).getMed().add(new MedicoGeneral(num_enfermedades, colegio, nombre, apellido, an_profesional, salario));
                                System.out.println("Se ha agregado un Medico general");

                                break;
                            case 2:
                                System.out.println("Ingrese el número de cirugias");
                                int num_cirugias = sc.nextInt();
                                vs = sc.nextLine();

                                equipos.get(equipos.size() - 1).getMed().add(new Cirujano(num_cirugias, colegio, nombre, apellido, an_profesional, salario));
                                System.out.println("Se ha agregado un Cirujano");
                                break;

                            case 3:
                                System.out.println("Ingrese el numero de Terapies");
                                int num_terapias = sc.nextInt();
                                vs = sc.nextLine();

                                equipos.get(equipos.size() - 1).getMed().add(new Terapeuta(num_terapias, colegio, nombre, apellido, an_profesional, salario));
                                break;
                            default:
                                System.out.println("Tipo incorrecto");
                        }

                        System.out.print("Desea dejar de agregar medicos\n: "
                                + "1) Si\n"
                                + "2) No\n"
                                + "Su elección: ");
                        opcion = sc.nextInt();
                        vs = sc.nextLine();

                        if (opcion == 1) {
                            break;
                        }

                    }

                    System.out.println("Agregar Entrenadores");
                    System.out.print("Ingrese nombre del Entrenador: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese apellido del Entrenador: ");
                    String apellido = sc.nextLine();
                    System.out.print("Ingrese Anios como Entrenador :");
                    int an_profesional = sc.nextInt();
                    vs = sc.nextLine();
                    int salario = 0;
                    boolean jugo = false;
                    System.out.println("[1] El entrenador fue jugador");
                    System.out.println("[2] El entrenador no jue jugador");
                    int elec = sc.nextInt();
                    vs = sc.nextLine();
                    switch (elec) {
                        case 1:
                            jugo = true;
                            break;
                        case 2:
                            jugo = false;
                            break;
                        default:
                            System.out.println("Ingrese una opcion valida");
                    }

                    System.out.print("Ingrese su jugada favorita: ");
                    String jugada_fav = sc.nextLine();
                    //Elegir entrenador
                    System.out.println("Tipos de Entrenadores");
                    System.out.println("[1] Entrenador Principal");
                    System.out.println("[2] Asistente de Entrenado");
                    System.out.println("[3] Preparador Fisica");
                    System.out.print("Eliga de que tipo es el entrenador: ");
                    int op_entrenador = sc.nextInt();
                    switch (op_entrenador) {
                        case 1:
                            salario = 200000000;
                            equipos.get(equipos.size() - 1).setEnt_p(new Entrenador_Principal(jugo, jugada_fav, salario, nombre, apellido, an_profesional));
                            break;
                        case 2:
                            salario = 100000000;
                            equipos.get(equipos.size() - 1).setAsist_e(new Asistente_Entrenador(jugo, jugada_fav, salario, nombre, apellido, an_profesional));
                            break;
                        case 3:
                            salario = 800000;
                            equipos.get(equipos.size() - 1).getPrep_f().add(new Preparador_Fisico(jugo, jugada_fav, salario, nombre, apellido, an_profesional));
                            break;
                        default:
                            System.out.println("Ingrese una opcion valida");
                    }
                    System.out.println("Agregar Dueno");
                    System.out.print("Ingrese nombre del Dueno: ");
                    nombre = sc.nextLine();
                    System.out.print("Ingrese apellido del Dueno: ");
                    apellido = sc.nextLine();
                    System.out.print("Ingrese Anios como Dueno :");
                    an_profesional = sc.nextInt();
                    vs = sc.nextLine();
                    System.out.print("Ingrese Salario del Dueno: ");
                    salario = sc.nextInt();
                    vs = sc.nextLine();
                    System.out.print("Ingrese Net Worth del Dueno: ");
                    int networth = sc.nextInt();
                    System.out.print("Ingrese Ciudad donde Nacio: ");
                    String ciudad = sc.nextLine();
                    vs = sc.nextLine();
                    equipos.get(equipos.size() - 1).setDueno(new Dueno(networth, ciudad, nombre, apellido, an_profesional, salario));

                    System.out.println("Creo su equipo con exito!!");
                case 2:
                    System.out.println("Ingrese el equipo: ");
                    posicion = sc.nextInt();
                    vs = sc.nextLine();
                    
                    Equipo team = equipos.get(posicion);
                    
                    team.toString();

                    System.out.print("Que tipo de personal desea despedir: \n"
                            + "1) Jugadores\n"
                            + "2) Médicos \n"
                            + "3) Entrenadores\n");
                    opcion = sc.nextInt();
                    vs = sc.nextLine();

                    switch (opcion) {
                        case 1:
                            System.out.println("Ingrese la posicion del jugador a despedir");
                            posicion = sc.nextInt();
                            vs = sc.nextLine();
                            agentesLibres.add(team.getJug().get(posicion));
                            team.getJug().remove(posicion);
                            break;
                        case 2:
                            System.out.println("Ingrese la posicion del medico a despedir");
                            posicion = sc.nextInt();
                            vs = sc.nextLine();
                            agentesLibres.add(team.getMed().get(posicion));
                            team.getMed().remove(posicion);
                            break;
                        case 3:
                            System.out.print("Que tipo entrenador desea despedir:\n"
                                    + "1) Preparador fisico\n"
                                    + "2) Entrenador principal\n"
                                    + "3) Entrenador asisente\n"
                                    + "Su opcion:");
                            opcion = sc.nextInt();
                            vs = sc.nextLine();
                            switch (opcion) {
                                case 1:
                                    System.out.println("Ingrese la posicion del preparador a quien despedir");
                                    posicion = sc.nextInt();
                                    vs = sc.nextLine();
                                    agentesLibres.add(team.getPrep_f().get(posicion));
                                    team.getPrep_f().remove(posicion);
                                    break;
                                case 2:
                                    agentesLibres.add(team.getEnt_p());
                                    team.setEnt_p(null);
                                    break;
                                case 3:
                                    agentesLibres.add(team.getAsist_e());
                                    team.setAsist_e(null);
                                    break;
                            }
                            break;
                    }

                    break;
                case 3:
                    
                    for (Equipo equipo : equipos) {
                        System.out.println("#" + count + ":");
                        equipo.toString();
                        count++;
                    }
                    count = 0;
                    
                    System.out.println("Elija un equipo para que juege(ingrese la posicion): ");
                    posicion = sc.nextInt();
                    vs = sc.nextLine();
                    
                    Equipo equipo = equipos.get(posicion);
                    
                    System.out.println("El partido ha comenzado! :");
                    
                    int lesion = 1 + rand.nextInt(100);
                    if (lesion <= 40) {
                        System.out.println("Se ha lesionado un jugador: ");
                        for (Medico medico : equipo.getMed()) {
                            if (medico instanceof Cirujano) {
                                int n = ((Cirujano) medico).getNum_cirugias() + 1;
                                ((Cirujano) medico).setNum_cirugias(n);
                                System.out.println("Se le ha asignado un cirujano");
                                break;
                            }
                        }
                        
                        for (Medico medico : equipo.getMed()) {
                            if (medico instanceof Terapeuta) {
                                int n = ((Terapeuta) medico).getNum_terapias()+ 1;
                                ((Terapeuta) medico).setNum_terapias(n);
                                System.out.println("Se le ha asignado un terapeuta");
                                break;
                            }
                        }
                    }
                    
                    int enfermedad = 1 + rand.nextInt(100);
                    if (enfermedad <= 30) {
                        System.out.println("Se ha enfermado un jugador");
                        for (Medico medico : equipo.getMed()) {
                            if (medico instanceof MedicoGeneral) {
                                int n = ((MedicoGeneral) medico).getNum_enfermedades() +1;
                                ((MedicoGeneral) medico).setNum_enfermedades(n);
                                System.out.println("Se le ha asignado un medico general");
                                break;
                            }
                        }
                    }
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
                        } else {
                            System.out.println("Jugada fallida");
                        }
                    }

                    count = 0;

                    break;
                case 5:
                    System.out.println("Eliminar Equipo");
                    
                    if (equipos.isEmpty()) {
                        System.out.println("No hay equipos ingresados");
                        break;
                    } else {
                        
                        for (int i = 0; i < equipos.size(); i++) {
                            System.out.println("[" + i + "]" + equipos.get(i));
                        }
                        
                        System.out.print("Ingrese equipo a eliminar: ");
                        int elim_op = sc.nextInt();
                        equipos.remove(elim_op);
                        System.out.println("Se elimino el equipo con exito");
                    }
                    break;
                case 6:
                    if (agentesLibres.isEmpty()) {
                        System.out.println("No hay agentes libres");
                        break;
                    } else {
                        for (int i = 0; i < agentesLibres.size(); i++) {
                            System.out.println("[" + i + "]" + agentesLibres.get(i));
                        }
                    }
                    
                    break;
                case 7:
                    break OUTER;
                default:
                    System.out.println("Ingrese una opcion valida");
            }
        }
    }

}
