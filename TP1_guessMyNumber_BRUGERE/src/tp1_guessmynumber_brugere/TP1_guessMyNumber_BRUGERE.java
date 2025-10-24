/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_brugere;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author quent
 */
public class TP1_guessMyNumber_BRUGERE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  

        Random generateurAleat = new Random();
        int n = generateurAleat.nextInt(101);
        int compteur = 0;
        System.out.println(n);
        Scanner sc = new Scanner(System.in);
        int choix=-1;
          System.out.println("Choisissez un niveau de difficulté :");
    System.out.println("1 - Facile (illimité)");
    System.out.println("2 - Normal (10 tentatives)");
    System.out.println("3 - Difficile (5 tentatives)");

    int niveau = sc.nextInt();
    int tentativeMax;
    tentativeMax = switch (niveau) {
            case 1 -> Integer.MAX_VALUE;
            case 2 -> 10;
            default -> 5;
        };
        while (choix!= n && compteur< tentativeMax){
        System.out.println("choisir un nb entre 0 et 100");
        choix = sc.nextInt();
        compteur++;
        if (choix==n){
        System.out.println("vous avez gagne");}
        else{
        if (choix> n){
        System.out.println("N est inferieur à votre choix");
        } else{
        System.out.println("N est superieur à votre choix");
                
        }
        }
        }
        if (choix != n) {
    System.out.println("Vous avez dépassé le nombre de tentatives autorisées. Perdu !");
    System.out.println("Le nombre mystère était : " + n);
} else {
    System.out.println("Vous avez trouvé le nombre " + n + " en " + compteur + " tentative(s).");
}

        System.out.println("vous avez trouvé le nb "+n+" en "+compteur+" essai");
    }
    
}

