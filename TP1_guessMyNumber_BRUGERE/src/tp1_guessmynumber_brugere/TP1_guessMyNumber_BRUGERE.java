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
        System.out.println("veillez choisir un nb entre 0 et 100");
        int choix = sc.nextInt();
        if (choix == n){
        System.out.println("vous avez gagne");
        } else {
        while (choix!= n){
         compteur++;
        System.out.println("veillez choisir un nb entre 0 et 100");
        int choi = sc.nextInt();
        if (choi==n){
        System.out.println("vous avez gagne");}
        else{
        if (choi> n){
        System.out.println("N est inferieur à votre choix");
        } else{
        System.out.println("N est superieur à votre choix");
                
        }
        }
        }
    }
    
}
}
