package lab5p2_kennethespinoza;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Random;

public class Lab5P2_Kennethespinoza {

    static Scanner lea = new Scanner(System.in);
    static Random r = new Random();

    public static void main(String[] args) {

        ArrayList<Robots> robot = new ArrayList();

        boolean control = true;

        while (control == true) {            
            
            System.out.println("----------------MENU-----------------");
            System.out.println("|1| =  Crear Robot");
            System.out.println("|2| =  Listar Robot");
            System.out.println("|3| =  Simular Automaticamente");
            System.out.println("|4| =  Actuar Manualmente");
            System.out.println("|6| = Salir del programa ");
            System.out.println("-------------------------------------");
            System.out.println("Ingrese la opcion a la que desea entrar:");
            int opcion = lea.nextInt();
            
            switch (opcion){
                
                case 1:{
                    
                }
                break;
                 
                case 2:{
                    
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
