package tehtävä5;
import java.util.Random;
import java.util.Scanner;

public class Peli{

    //alustetaan pelissä tarvittavat muuttujat.
    private int kone;
    private int pelaaja;
    private String errMsg;
    
    //setter metodi koneen veikkaamalle arvolle
    public void setKone(int x){
        this.kone = x;
    }
    //setter metodi pelaajan veikkaamalle arvolle
    public void setPelaaja(int x){
        this.pelaaja = x;
    }
    //setter metodi errormessagelle, ei tarvetta, mutta lisää osaamista ja 
    //laatimiseen tulee toistoa.
    public void setError(){
        this.errMsg = "Jotain meni pieleen.";
    }
    //getter samaiselle errorille.
    public String errorMsg() {
        return errMsg;
    }
    
    //staattinen metodi, joka suorittaa ohjelman.
    static void pelaaPeli(){
        
        //luodaan peli objekti jotta päästään käsiksi edellä mainittuihin arvoihin.
        Peli peli = new Peli();
        
        //suoritetaan try-catch metodi. Tässä ei nyt ole mitään käytännön tilannetta 
        //joka antaisi erroria, mutta virkistykseksi tämäkin täällä. 
        try{
            
            peli.setKone(randomNumero());
            peli.setPelaaja(kysyNumero());
            
            /* peli kysyy käyttäjältä lukua niin kauan kunnes oikea veikkaus on annettu. 
            vertailu tapahtuu if statementeilla ja vastauksen jälkeen annetaan vastausta 
            kuvaava printtaus.
            */
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
    
    //erillinen metodi pelaajan antaman numeron kysyntään.
    static int kysyNumero(){
        System.out.print("Give a number: ");
        
        Scanner reader = new Scanner( System.in );
            
        int v = reader.nextInt();
        return v;
    }
    
    //erillinen metodi koneen arpomalle luvulle.
    static int randomNumero(){
        Random rand = new Random();
        
        int kone = rand.nextInt(101);
        
        return kone;
    }
    
}
