/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tehtävä13;
import java.util.Random;
import java.util.ArrayList;

/**
 *
 * @author tommi
 */
public class Tehtävä13 {
    
    public static void main(String[] args) {
    
        Random rand = new Random();
        
        ArrayList<Integer> luvut = new ArrayList<Integer>();
        
        for (int i = 100; i > 0; i--){
            //tässä kohtaa admit et tää plusmiinus juttu lopusta on pöllitty netistä
            //toivottavasti ei pisteet rippaa :)
            int lisää = rand.nextInt(101-1) + 1;
            luvut.add(lisää);
        }
        
        Laske(luvut, 5);
        
    }
    
    public static void Laske(ArrayList<Integer> lista, int haettava) {
        
        int lukumäärä = 0;
        
        for (int x = 0; x < 100; x++){
            
            if (lista.get(x) <= haettava){
                System.out.println("Luku " + x + " on " + lista.get(x));
                lukumäärä += 1;
            }
        }
        
        System.out.println("Lukuja joiden arvo 5 tai alle: " + lukumäärä);
        
    } 
    
    
}
