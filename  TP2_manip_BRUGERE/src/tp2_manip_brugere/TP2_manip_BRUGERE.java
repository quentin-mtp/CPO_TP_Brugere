/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_brugere;

/**
 *
 * @author quent
 */
public class TP2_manip_BRUGERE {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {

       
        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);

        
        Tartiflette assiette3 = assiette2;

        
        System.out.println("Avant modification :");
        System.out.println("Assiette 1 : " + assiette1.nbCalories); 
        System.out.println("Assiette 2 : " + assiette2.nbCalories); 
        System.out.println("Assiette 3 : " + assiette3.nbCalories); 

        
        assiette2.nbCalories += 50;

        System.out.println("\nAprès modification des calories de assiette2 :");
        System.out.println("Assiette 2 : " + assiette2.nbCalories); 
        System.out.println("Assiette 3 : " + assiette3.nbCalories); 
     
        Tartiflette temp = assiette1;
        assiette1 = assiette2;
        assiette2 = temp;

        System.out.println("\nAprès inversion :");
        System.out.println("Assiette 1 : " + assiette1.nbCalories); 
        System.out.println("Assiette 2 : " + assiette2.nbCalories); 

       
      

       
        Moussaka[] tableauMoussaka = new Moussaka[10];
        for (int i = 0; i < tableauMoussaka.length; i++) {
        tableauMoussaka[i] = new Moussaka(300 + i * 10); 
        System.out.println("Moussaka " + i + " : " + tableauMoussaka[i].nbCalories + " calories");
        }
    }
}

    
    

