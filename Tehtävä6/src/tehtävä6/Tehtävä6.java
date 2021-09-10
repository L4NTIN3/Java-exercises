
package tehtävä6;
import java.util.Scanner;


public class Tehtävä6 {

    public static void main(String[] args) {
        int syöte = 1;
        
        Scanner lukija = new Scanner( System.in );
        
        while (syöte > 0){
            
            System.out.print("Anna sekuntimäärä: ");
        
            syöte = lukija.nextInt();
            
            if(syöte > 0){
                Laske(syöte); 
            }
        }
        
        if (syöte < 0){
            System.out.print("Error, suoritus päätetään.");
        }
        
        
    }
    
    public static void Laske(int x){
        
        int sekunnit = x;
        //minutes
        int minuutit = 0;
        int tunnit = 0;
        int päivät = 0;
        int vuodet = 0;
        
        System.out.println("Sekunnit: " + sekunnit);
        
        minuutit = sekunnit / 60;
        System.out.println("Minuutit: " + minuutit);
        
        tunnit = minuutit / 60;
        System.out.println("Tunnit: " + tunnit);
        
        päivät = tunnit / 24;
        System.out.println("Päivät: " + päivät);
        
        vuodet = päivät / 365;
        System.out.println("Vuodet: " + vuodet);
        
      
        
    }
    
}
