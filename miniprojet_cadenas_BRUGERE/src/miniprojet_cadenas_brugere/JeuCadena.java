/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miniprojet_cadenas_brugere;
import java.util.Random;

        
/**
 *
 * @author quent
 */
public class JeuCadena {
    private int[] code;
    private int tentative;
    private int tentative_max;
    
public JeuCadena(){
code= new int[4];
initialiserJeuCadena();
}
public void initialiserJeuCadena(){
Random Rand = new Random();
tentative=0;
for (int i=0; i<4; i++){
code[i]=Rand.nextInt(10);
}
  System.out.println("CODE SECRET: "+code[0]+code[1]+code[2]+code[3]);     
}
public int[] verifierCombinaison(int[] proposition) {
        int exacts = 0;
        int thaut = 0;
        int tbas = 0;
       
        for (int i = 0; i < 4; i++) {
            if (proposition[i] == code[i]) {
                exacts++;
            } else if (proposition[i] > code[i]) {
                thaut++;
            } else {
                tbas++;
            }
        }
       
        tentative ++;
        return new int[]{exacts, thaut, tbas};
    }
   
    public int getTentativeActuelle() {
        return tentative;
    }
   
    public int getMaxTentatives() {
        return tentative_max;
    }
}

