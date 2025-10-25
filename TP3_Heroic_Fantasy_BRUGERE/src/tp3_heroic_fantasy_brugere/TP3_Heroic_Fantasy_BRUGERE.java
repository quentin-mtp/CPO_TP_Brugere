/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_brugere;

import Arme.Baton;
import Arme.Epee;
import static java.lang.reflect.Array.get;
import java.util.ArrayList;

/**
 *
 * @author quent
 */

public class TP3_Heroic_Fantasy_BRUGERE {


    public static void main(String[] args) {
        Epee excalibur = new Epee("Excalibur", 7, 5);
        Epee durendal = new Epee("durendal", 4,7);
        Baton chene = new Baton("chene de mon paf", 4, 5);
        Baton charme = new Baton ("charme",5,6);
        
    ArrayList<Object> Tab1 = new ArrayList<>();    
    Tab1.add(excalibur);
    Tab1.add(durendal);
    Tab1.add(chene);
    Tab1.add(charme);
        System.out.println(excalibur);
         System.out.println(durendal);
        System.out.println(chene);
         System.out.println(charme);
        int taille= Tab1.size();
        for (int i=0; i< taille; i++){
        Object armes = Tab1.get(i);
        System.out.println(armes);
        }
        System.out.println("Finesse de l'epee : " + excalibur.getFinesse());
        System.out.println("Finesse de l'epee : " + durendal.getFinesse());
        System.out.println("Age du baton : " + chene.getAge());
        System.out.println("Age du baton : " + charme.getAge());
    }
    }


