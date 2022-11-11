package lab5p2_kennethespinoza;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Random;

public class Lab5P2_Kennethespinoza {

    static Scanner lea = new Scanner(System.in);
    static Random r = new Random();

    public static void main(String[] args) {

        ArrayList<Robots> robots = new ArrayList();

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
            
            switch (opcion){
                
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
                            
                            System.out.println("Ingrese la cantidad de elementos del robot");
                            nelementos = lea.nextInt();
                            
                            if (nelementos >= 0 && nelementos <= 2) {
                                robots.add(new Androide(nelementos, altura, peso, id, x, y, control, añofab));
                            } else {
                                System.out.println("El robot no puede cargar mas elementos");
                            }
                        }
                        break;
                        
                        case 2: {
                            
                        }
                        break;
                        
                        case 3: {

                        }
                        break;
                        
                        case 4: {

                        }
                        break;
                    }
                }
                break;
                 
                case 2:{
                     String salida = "";
                    for (Object j : robots) {
                        salida += robots.indexOf(j) + "- " + j + "\n";
                        System.out.println(salida);
                    }
                }
                break;
                 
                case 3:{
                    
                }
                break;
                 
                case 4:{
                    
                }
                break;
                 
                case 5:{
                    control = false;
                }
                break;
                default:
                    System.out.println("Opcion ingresada no valida");
                
            }
            
        }
        
        
        
        
        
        
        
    }
    
}
