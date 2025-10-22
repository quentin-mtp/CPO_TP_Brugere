// TP0 aprentissage JAVA 20/10
package tp0_.helloworld;

import java.util.Scanner;

/**
 *
 * @author quent
 */
public class TP0_HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String prenom ;
        Scanner sc;
        sc =   new Scanner (System.in);
        System.out.println("Quel est votre prénom.");
        prenom = sc.nextLine();
      
        System.out.println(prenom);
     
    }
    
}
