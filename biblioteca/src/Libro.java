import java.util.HashMap;
import java.util.List;

public class Libro {
    private String titolo;
    private String autore;
    private String genere;
    private String ISBN;
    public static HashMap<String, Libro> libroPerCodice = new HashMap<String, Libro>();

    public Libro(String titolo,String autore, String genere, String ISBN){

        this.titolo = titolo;
        this.autore =autore;
        this.genere = genere;
        this.ISBN = ISBN;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getAutore(){
        return autore;
    }

    public String getGenere() {
        return genere;
    }

    public String getISBN() {
        return ISBN;
    }

    public void getLibro(){
        System.out.println("Titolo: " +this.getTitolo() +"; autore : "+ this.getAutore() +"; genere: "+ this.getGenere() +"; ISBN:"+ this.getISBN()+".");
    }
    private String piano;
    private String scaffale;
    private int numeroLibri;
    private String codiceCatalogazione;

    public void creaCodiceCatalogazione(String piano, String scaffale, int numeroLibri) {
        this.piano =piano;
        this.scaffale = scaffale;
        this.numeroLibri =numeroLibri;
        this.codiceCatalogazione = piano+scaffale+numeroLibri;

    }


    public String getPiano() {
        return piano;
    }

    public String getScaffale() {
        return scaffale;
    }

    public int getNumero() {
        return numeroLibri;
    }

    public void setNumeroLibri(int numeroLibri) {
        this.numeroLibri = numeroLibri;
    }

    public void setPiano(String piano) {
        this.piano = piano;
    }

    public void setScaffale(String scaffale) {
        this.scaffale = scaffale;
    }

    public String getCodiceCatalogazione() {
        return codiceCatalogazione;
    }

    public void visualizzaCodiceCatalogazione() {
        System.out.println("Piano: " + this.getPiano() + "; scaffale: " + this.getScaffale() + "; numero del libro nello scaffale: " + this.getNumero() + ".");
    }

}
