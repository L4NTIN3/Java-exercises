package tehtävä5;
import java.util.Random;
import java.util.Scanner;

public class Peli{

    private int kone;
    private int pelaaja;
    private String errMsg;
    
    public void setKone(int x){
        this.kone = x;
    }
    
    public void setPelaaja(int x){
        this.pelaaja = x;
    }
    
    public void setError(){
        this.errMsg = "Jotain meni pieleen.";
    }
    
    public String errorMsg() {
        return errMsg;
    }
    
    static void pelaaPeli(){
        
        Peli peli = new Peli();
        
        try{
            
            peli.setKone(randomNumero());
            peli.setPelaaja(kysyNumero());
            
            while(peli.pelaaja != peli.kone){
            
                System.out.print("Väärä vastaus. ");

                if(peli.pelaaja < peli.kone){
                    System.out.println("Veikkauksesi oli vähemmän kuin koneen valitsema luku.");
                    peli.pelaaja = kysyNumero();
                }
                else if(peli.pelaaja > peli.kone){
                    System.out.println("Veikkauksesi oli isompi kuin koneen valitsema luku.");
                    peli.pelaaja = kysyNumero();
                }
                else{
                    System.out.println("Jokin meni pieleen.");
                }
            
            }
        
        System.out.println("Valitsit oikein, voitit pelin");
            
        }
        catch (Exception e){
            
            System.out.println(peli.errMsg);
        }
        
        
    }
    
    
    static int kysyNumero(){
        System.out.print("Give a number: ");
        
        Scanner reader = new Scanner( System.in );
            
        int v = reader.nextInt();
        return v;
    }
    
    static int randomNumero(){
        Random rand = new Random();
        
        int kone = rand.nextInt(101);
        
        return kone;
    }
    
}
