/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tehtävä18;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author tommi
 */
public class Numbers {
    
    Scanner lukija = new Scanner(System.in);
    
    //new arraylist
    ArrayList<Integer> numerot = new ArrayList<Integer>();
    
    
    //making a private int of average
    private int avg = 0;
    
    //set new average of values
    public void setAvg(int newAvg) {
        this.avg = newAvg;
    }
    
    //constructor to add numbers in the list
    public Numbers(){
        this.numerot.add(1);
        this.numerot.add(2);
        this.numerot.add(3);
        this.numerot.add(4);
        this.numerot.add(5);
    }
    
    //delete method that deletes number from given index
    public void Insert(){
        System.out.print("Number to be added: ");
        int lisättävä = lukija.nextInt();
        
        this.numerot.add(lisättävä);
    }
    
    
    public void Delete(){
        
        System.out.print("Index to be deleted: ");
        Scanner lukija = new Scanner(System.in);
        int index = lukija.nextInt();
        
        numerot.remove(index);
        
        System.out.println(numerot);
        
    }
    
    //method that returns updated avg
    public int Average(){
        
        int all = 0;
        
        for (int i = 0; i < numerot.size(); i++){
            all += numerot.get(i);
        }
        //this objects avg variable to be set
        this.setAvg(all / numerot.size());
        
        //return this objects avg
        System.out.println("Average is: " + this.avg);
        return this.avg;
    }
    
    
}
