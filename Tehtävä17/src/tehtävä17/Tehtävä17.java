/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tehtävä17;
import java.util.Scanner;

/**
 *
 * @author tommi
 */
public class Tehtävä17 {
    
    public static void main(String[] args) {
        
        int[] lista = kysyLukuja();
        
        Laske(lista);
        
    }
    
    
    public static void Laske(int[] x){
        
        double tulos = x[0] + x[1] + x[2] + x[3] + x[4];
        
        double ka = tulos / x.length;
        
        System.out.print("Lukujen keskiarvo on: " + ka);
        
        
    }
    
    public static int[] kysyLukuja(){
        
        Scanner lukija = new Scanner(System.in);
        int[] luvut = new int[5];
        
        System.out.print("Anna luku 1: ");
        int luku1 = lukija.nextInt();
        luvut[0] = luku1;
        
        System.out.print("Anna luku 2: ");
        int luku2 = lukija.nextInt();
        luvut[1] = luku2;
        
        System.out.print("Anna luku 3: ");
        int luku3 = lukija.nextInt();
        luvut[2] = luku3;
        
        System.out.print("Anna luku 4: ");
        int luku4 = lukija.nextInt();
        luvut[3] = luku4;
        
        System.out.print("Anna luku 5: ");
        int luku5 = lukija.nextInt();
        luvut[4] = luku5;
        
        return luvut;
        
    }
    
}
