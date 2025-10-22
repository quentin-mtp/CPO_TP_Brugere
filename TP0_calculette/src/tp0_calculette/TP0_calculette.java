/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0_calculette;

import java.util.Scanner;

/**
 *
 * @author quent
 */
public class TP0_calculette {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int resultat=0;
        System.out.println("Please enter the operator:\n"
                + "1) add\n"
                + "2) substract\n"
                + "3) multiply\n"
                + "4) divide\n"
                + "5) modulo");
        Scanner sc = new Scanner(System.in);
        System.out.println("choisir un type de calcul");
      
        int opérateur = sc.nextInt();
         System.out.println("chosir le nb 1");
        int operande1 = sc.nextInt();
         System.out.println("choisir le nb 2");
        int operande2 = sc.nextInt();
        if (opérateur==1) {
            resultat= operande1+operande2;
            System.out.println("la resultat est"+resultat);
        } else {
            if (opérateur==2) {
                resultat= operande1-operande2;
                System.out.println("la resultat est"+resultat);
            } else {
                if (opérateur == 3){
                resultat=operande1*operande2 ;
                System.out.println("la resultat est"+resultat);
                } else {
                    if (opérateur==4){
                        resultat= operande1/operande2;
                                System.out.println("la resultat est"+resultat);
                    } else {
                    if (opérateur ==5){
                        resultat= operande1%operande2;
                        System.out.println("la resultat est"+resultat);
                                
                    } else {
                        System.out.println("choisit un nombre entre 1 et 5 encule");
                    }
                    }
                }
            }
                } 
    
    }
    
}
