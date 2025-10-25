/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_brugere;

/**
 *
 * @author quent
 */
public class Magicien extends Personnage {
    private boolean confirme;
    public Magicien(String nom, int niveauVie, boolean confirme){
    super(nom, niveauVie);
    this.confirme = confirme;}
    
}
