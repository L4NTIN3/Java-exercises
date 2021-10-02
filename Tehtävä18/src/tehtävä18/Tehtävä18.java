/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tehtävä18;
import java.util.Scanner;

/**
 *
 * @author tommi
 */
public class Tehtävä18 {
    
    
    public static void main(String[] args) {
        
        Scanner text = new Scanner(System.in);
        Numbers n1 = new Numbers();
        String teksti = "";
     
        boolean t = true;
        
        while(t){
            System.out.print("What to do(Insert, Delete, Get Average or Print (X to stop) )?: ");
            teksti = text.nextLine();
            
            System.out.println(teksti);
            if(teksti.equals("Insert")){
                n1.Insert();
            }
            else if (teksti.equals("Delete")){
                n1.Delete();
            }
            else if (teksti.equals("Get Average")){
                n1.Average();
            }
            else if (teksti.equals("Print")){
                System.out.println(n1.numerot);
            }
            else if (teksti.equals("X")){
                break;
            }
            else{
                System.out.println("Ei kelvollinen syöte.");
            }
        }
        
        
        
    }
    
}
