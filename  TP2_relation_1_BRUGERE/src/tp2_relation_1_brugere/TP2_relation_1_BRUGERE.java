/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_brugere;

/**
 *
 * @author quent
 */
public class TP2_relation_1_BRUGERE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Voitures uneClio = new Voitures("Clio", "Renault", 5);
        Voitures uneAutreClio = new Voitures("Clio", "Renault", 5);
        Voitures une2008 = new Voitures("2008", "Peugeot", 6);
        Voitures uneMicra = new Voitures("Micra", "Nissan", 4);
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");
        System.out.println("liste des voitures disponibles " + uneClio
                + "\n" + uneAutreClio
                + "\n" + une2008
                + "\n" + uneMicra);
        bob.liste_voitures[0] = uneClio;
        bob.liste_voitures[1]= uneMicra;
        bob.nbvoitures = 2;
        uneClio.propriétaire = bob ;
        uneMicra.propriétaire= bob;
        System.out.println("la premiere voiture de Bob est " +
        bob.liste_voitures[0]+" la 2 "+ bob.liste_voitures[1]) ;
        
        reno.liste_voitures[0] = une2008;
        reno.liste_voitures[1]= uneAutreClio;
        reno.nbvoitures = 2;
        uneClio.propriétaire = reno ;
        uneMicra.propriétaire= reno;
        System.out.println("la premiere voiture de reno est " +
        bob.liste_voitures[0]+" la 2 "+ bob.liste_voitures[1] ) ;
    }

}
