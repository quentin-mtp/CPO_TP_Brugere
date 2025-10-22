/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_brugere;

import java.util.Scanner;

/**
 *
 * @author quent
 */
public class TP1_manipNombresInt_BRUGERE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner nb = new Scanner(System.in);
        System.out.println("choisir le premier entier");
        int nb1 = nb.nextInt();
        System.out.println("choisir le deuxieme entier");
        int nb2 = nb.nextInt();
        System.out.println("vous avez choisit "+ nb1+ " et "+nb2);
        int somme = nb1 + nb2;
        int diff = nb1-nb2;
        int produit= nb1*nb2;
                double quotient = nb1/nb2;
        double reste = nb1%nb2;
        System.out.println("la somme est "+somme+" , la diff "+diff+" ,le produit "+produit+" , le quotient "+quotient+" et le reste "+reste);
                
       
        
       
    }
    
}
