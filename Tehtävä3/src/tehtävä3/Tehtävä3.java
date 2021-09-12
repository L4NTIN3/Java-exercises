/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tehtävä3;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author tommi
 */
public class Tehtävä3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner lukija = new Scanner(System.in);
        
        System.out.print("Anna luku: ");

        int syöte = lukija.nextInt();
        
        ArrayList<Integer> divisors = new ArrayList<Integer>();
        
        for (int i = 1; i <= syöte; i++){
            
            if (syöte % i == 0){
                divisors.add(i);
            }
            
        }
        
        System.out.print("Luvun " + syöte + " voi jakaa luvuilla: " + divisors);
        
    }
    
}
