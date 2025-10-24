/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_brugere;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author quent
 */
public class TP1_stats_BRUGERE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] tab = new int[6];
        System.out.println("veillez choisir un nombre entier");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n=0;
        Random generateurAleat = new Random();
        while (n<m){
            n++;
            int f = generateurAleat.nextInt(6);
            if (f==0){
                tab[0]+=1;
            } else{
            if (f==1){
            tab[1]+=1;} else{
            if (f==2){
            tab[2]+=1;} else{
            if (f==3){
            tab[3]+=1;}else {
            if (f==4){
            tab[4]+=1;}else{
            if (f==5){
            tab[5]+=1;}}}}}}
        }
        System.out.println("les résultats sont");
        for (int i =0 ;i< tab.length; i++){
        System.out.println("face "+(i+1)+ "est tombee "+ tab[i]*100.0/m + "% du temps" );}
    }
    
}
