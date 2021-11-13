public class Libro{
    private String titolo;
    private String codice;
    private float prezzo;
    private String autore;
    private int numeroCopie;  

    public Libro(int nc){
        numeroCopie=nc;
    }
    public void prestito(){
        numeroCopie--;
    }
    public void restituzione(){
        numeroCopie++;
  }
    public String toString(){
        String s="";
        s= s + titolo + " " + codice + " " + prezzo;
        s= s + " " + autore + " " + numeroCopie + "\n";
        return s;
      
    }
}