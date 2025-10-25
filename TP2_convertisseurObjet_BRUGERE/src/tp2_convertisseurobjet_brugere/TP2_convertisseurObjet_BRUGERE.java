/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author maxim
 */

    /**
package tp2_convertisseurobjet_brugere;

import java.util.Scanner;

/**
 *
 * @author quent
 */
public class TP2_convertisseurObjet_BRUGERE {
       

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            
            Convertisseur conv = new Convertisseur();
            
            boolean quitter = false;
            
            while (!quitter) {
                
                System.out.println("\n--- Menu Convertisseur ---");
                System.out.println("1. Celsius → Fahrenheit");
                System.out.println("2. Fahrenheit → Celsius");
                System.out.println("3. Celsius → Kelvin");
                System.out.println("4. Kelvin → Celsius");
                System.out.println("5. Fahrenheit → Kelvin");
                System.out.println("6. Kelvin → Farenheit");
                System.out.println("7. Afficher nombre de conversions");
                System.out.println("8. Quitter");
                System.out.print("Votre choix : ");
                
                int choix = sc.nextInt();
                
                switch (choix) {
                    case 1 -> {
                        System.out.print("Entrez la température en C : ");
                        double c = sc.nextDouble();
                        double f = conv.celsiusVersFahrenheit((float) c);
                        System.out.println(c + "C = " + f + "F");
                    }
                    
                    case 2 -> {
                        System.out.print("Entrez la température en F : ");
                        double f2 = sc.nextDouble();
                        double c2 = conv.fahrenheitVersCelsius((float) f2);
                        System.out.println(f2 + "F = " + c2 + "C");
                    }
                    
                    case 3 -> {System.out.print("Entrez la température en C : ");
                        double c3 = sc.nextDouble();
                        double k3 = conv.celsiusVersKelvin((float) c3);
                        System.out.println(c3 + "C = " + k3 + "K");
                    }
                    case 4 ->{
                    System.out.print("Entrez la température en K : ");
                        double k4 = sc.nextDouble();
                        double c4 = conv.kelvinVersCelsius((float) k4);
                        System.out.println(k4 + "K = " + c4 + "C");}
                    case 5 ->{
                        System.out.print("Entrez la température en F : ");
                        double f5 = sc.nextDouble();
                        double k5 = conv.fahrenheitVersKelvin((float) f5);
                        System.out.println(f5 + "F = " + k5 + "K");
                    }
                    case 6 ->{
                        System.out.print("Entrez la température en K : ");
                        double k6 = sc.nextDouble();
                        double f6 = conv.kelvinVersFahrenheit((float) k6);
                        System.out.println(k6 + "K = " + f6 + "F");
                    }
                    
                    case 7  -> System.out.println(conv);
                    
                    case 8 -> {
                        System.out.println("Au revoir !");
                        quitter = true;
                    }
                    
                    default -> System.out.println("Choix invalide. Réessayez.");
                }
            }
        }
    }
}

        