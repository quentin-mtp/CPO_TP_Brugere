/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_brugere;

/**
 *
 * @author quent
 */
public class TP2_Bieres_BRUGERE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0 ,"Dubuisson") ;
        uneBiere.lireEtiquette();
        BouteilleBiere b1 = new BouteilleBiere("Leffe", 6.6f, "Abbaye de Leffe");
        BouteilleBiere b2 = new BouteilleBiere("Kronenbourg", 5.0f, "Brasserie Kronenbourg");
        BouteilleBiere b3 = new BouteilleBiere("Heineken", 5.0f, "Heineken N.V.");

        // Décapsuler certaines bières
        b1.Decapsuler();
        b3.Decapsuler();

        // Afficher les bouteilles avec toString()
        System.out.println(b1);  // Affiche: Leffe (6.6 degrés) Ouverte ? oui
        System.out.println(b2);  // Affiche: Kronenbourg (5.0 degrés) Ouverte ? non
        System.out.println(b3);  //
        
        
                

                
    }
    
}
