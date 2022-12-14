package lab5p2_kennethespinoza;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Random;

public class Lab5P2_Kennethespinoza {

    static Scanner lea = new Scanner(System.in);
    static Random r = new Random();
    static ArrayList<Robots> robots = new ArrayList();

    public static void main(String[] args) {

        boolean control = true;

        while (control == true) {

            System.out.println("----------------MENU-----------------");
            System.out.println("|1| =  Crear Robot");
            System.out.println("|2| =  Listar Robot");
            System.out.println("|3| =  Simular Automaticamente");
            System.out.println("|4| =  Actuar Manualmente");
            System.out.println("|5| = Salir del programa ");
            System.out.println("-------------------------------------");
            System.out.println("Ingrese la opcion a la que desea entrar:");
            int opcion = lea.nextInt();

            switch (opcion) {

                case 1: {
                    int id, x, y, añofab;

                    System.out.println("Ingrese el ID del robot:");
                    id = lea.nextInt();

                    System.out.println("Ingrese la posición en x del robot:");
                    x = lea.nextInt();

                    System.out.println("Ingrese la posición en y del robot:");
                    y = lea.nextInt();

                    System.out.println("Ingrese el año de fabricación del robot:");
                    añofab = lea.nextInt();

                    System.out.println("Ingrese el tipo de robot que quiere crear:\n"
                            + "1 = Androide\n"
                            + "2 = Manos Roboticas\n"
                            + "3 = Robots Moviles agiles\n"
                            + "4 = Robots moviles pesados\n");
                    int ro = lea.nextInt();

                    switch (ro) {

                        case 1: {
                            int altura, peso, nelementos;
                            System.out.println("Ingrese la altura del Androide:");
                            altura = lea.nextInt();

                            System.out.println("Ingrese el peso del androide:");
                            peso = lea.nextInt();

                            System.out.println("Ingrese la cantidad de elementos del robot:");
                            nelementos = lea.nextInt();

                            if (nelementos >= 0 && nelementos <= 2) {
                                robots.add(new Androide(nelementos, altura, peso, id, x, y, control, añofab));
                                System.out.println("Se ha agregado un androide");
                            } else {
                                System.out.println("El robot no puede cargar mas elementos");
                            }

                        }
                        break;

                        case 2: {
                            int servomotor;

                            System.out.println("Ingrese la cantidad de servo motores que poseen las manos:");
                            servomotor = lea.nextInt();

                            robots.add(new manos_roboticas(servomotor, servomotor, id, x, y, control, añofab));

                            System.out.println("Se han agregado unas manos roboticas");
                        }
                        break;

                        case 3: {
                            int nllantas, velocidad;

                            System.out.println("Ingrese el numero de llantas que posee el robot:");
                            nllantas = lea.nextInt();

                            System.out.println("Ingrese la velocidad punta del robot:");
                            velocidad = lea.nextInt();

                            robots.add(new robots_agiles(nllantas, nllantas, velocidad, id, x, y, control, añofab));

                            System.out.println("Se ha agregado un robot agil");
                        }
                        break;

                        case 4: {
                            int peso, capacidad, nelementos;

                            System.out.println("Ingrese el peso del robot:");
                            peso = lea.nextInt();

                            System.out.println("Ingrese la capacidad del robot:");
                            capacidad = lea.nextInt();

                            System.out.println("Ingrese el numero de elementos que lleva el robot:");
                            nelementos = lea.nextInt();

                            if (nelementos >= 5 && nelementos <= capacidad) {
                                robots.add(new robots_pesados(nelementos, peso, capacidad, id, x, y, control, añofab));
                                System.out.println("Se ha agregado un robot pesado");
                            } else {
                                System.out.println("El robot debe cargar mas elementos");
                            }

                        }
                        break;
                        default:
                            System.out.println("Opcion ingresada no valida");
                    }
                }
                break;

                case 2: {
                    
                    String salida = "";
                    for (Object j : robots) {
                        salida += robots.indexOf(j) + "- " + j + "\n";
                        System.out.println(salida);
                    }

                }
                break;

                case 3: {

                }
                break;

                case 4: {
                    String[][] matriz = new String[8][8];
                    String salida = "";
                    for (Object j : robots) {
                        salida += robots.indexOf(j) + "- " + j + "\n";
                        System.out.println(salida);
                    }

                    System.out.println("Ingrese el robot que desea utilizar:");
                    int op = lea.nextInt();

                    System.out.println("Que desea hacer?"
                            + "Moverse\n"
                            + "Rotar\n");
                    int mov = lea.nextInt();

                    switch (mov) {
                        case 1: {

                        }
                        break;
                        case 2: {

                        }
                        break;
                    }

                    mapa(op);
                }
                break;

                case 5: {
                    control = false;
                }
                break;
                default:
                    System.out.println("Opcion ingresada no valida");

            }

        }

    }

    public static void mapa(int op) {

        Object[][] matriz = new String[8][8];

        String obs = "X";
        String caja = "C";
        String dest = "D";

        int x = ((Robots) robots.get(op)).getX();
        int y = ((Robots) robots.get(op)).getY();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = "[ ]";
            }
        }

        for (int i = 0; i < 30; i++) {
            int f = 1 + r.nextInt(7);
            int g = 1 + r.nextInt(7);
            matriz[f][g] = "[X]";
        }

        for (int i = 0; i < 6; i++) {
            int f = 1 + r.nextInt(7);
            int g = 1 + r.nextInt(7);
            matriz[f][g] = "[C]";
        }

        int a = 1 + r.nextInt(7);
        int b = 1 + r.nextInt(7);
        matriz[a][b] = "[D]";

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == x && j == y) {
                    matriz[i][j] = "[R]";
                }
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }

    }// fin tablero

}
