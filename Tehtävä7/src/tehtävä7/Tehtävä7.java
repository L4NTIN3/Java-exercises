/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tehtävä7;
import java.util.Scanner;

/**
 *
 * @author tommi
 */
public class Tehtävä7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner lukija = new Scanner(System.in);
        
        System.out.print("Anna ensimmäinen sivu: ");
        int sivu1 = lukija.nextInt();
        
        System.out.print("Anna toinen sivu: ");
        int sivu2 = lukija.nextInt();
        
        System.out.print("Anna kolmas sivu: ");
        int sivu3 = lukija.nextInt();
        
        boolean isTriangle = Laske(sivu1, sivu2, sivu3);

        if (isTriangle == true){
            System.out.println("Luvuista " + sivu1 + ", " + sivu2 + ", " + sivu3 + " voi muodostaa kolmion.");
        }
        else {
            System.out.println("Annetuista luvuista ei voi muodostaa kolmiota.");
        }
        
        
    }
    
    public static boolean Laske(int x, int y, int z){
        
        boolean arvo = false;
        
        if (x + y > z){
            arvo = true;
        }
        return arvo;
    }
    
    
    
}
