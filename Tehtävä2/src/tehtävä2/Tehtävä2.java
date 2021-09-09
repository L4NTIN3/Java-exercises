/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tehtävä2;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author tommi
 */
public class Tehtävä2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner reader = new Scanner( System.in );
        
            System.out.print("Anna luku1: ");
        
        int luku1 = reader.nextInt();
        
            System.out.print("Anna luku2: ");
        
        int luku2 = reader.nextInt();
        
        laske(luku1, luku2);
        
    }
    
    public static void laske(int x, int y){
        
        
        //parametreina funktiokutsussa saadut luvut laitetaan muuttujiin
        int aloitus = x;
        int lopetus = y;
        //tehdään lista objekti johon tallennetaan kaikki luvut
        ArrayList<Integer> tarkastetut = new ArrayList<Integer>();
        
        //loopataan läpi ja katsotaan mitkä ovat jaollisia seitsemällä tai seitsemällätoista.
        for(int i = aloitus; i <= lopetus; i++ ){
            
            if(i % 7 == 0 | i % 17 == 0){
                tarkastetut.add(i);
            }
                
        }
        //syötetään arraylistan tiedot simppelimpään arrayhin jotta voidaan loopata
        int tarkastetutSize = tarkastetut.size();
        
        
        int[] tarkistettuLista = new int[tarkastetutSize];
        
        for(int i = 0; i <= tarkastetutSize - 1; i++){
            
            int lisättävä = tarkastetut.get(i);
            
            tarkistettuLista[i] = lisättävä;
            
            System.out.println(tarkistettuLista[i]);
        }
        
        
        
    }
    
    
}
