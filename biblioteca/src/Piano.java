import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Piano {
    private Scaffale[] scaffali;
    private char[] alfabeto = "ABCDEFGHILMN".toCharArray();
    public static HashMap<String, Scaffale[]> pianoPerCodice = new HashMap<String, Scaffale[]>();


    public Piano(int numeroScaffali){
        scaffali = new Scaffale[numeroScaffali];
    }

    public Scaffale[] getScaffali(){
        return scaffali;
    }

    public void aggiungiLibro(Libro libro, String scaffale, Scaffale[] listaScaffali) {
        char c = scaffale.charAt(0);
        int i=0;

        for(; i < alfabeto.length; i++){
            if (alfabeto[i] == c){
                break;
            }
        }

        if(scaffali[i] == null){
            List<Libro> listaLibri = new ArrayList<>();
            scaffali[i]= new Scaffale(listaLibri);
        }
        libro.setScaffale(scaffale);
        scaffali[i].aggiungiLibro(libro, scaffali[i].getListaLibri(), listaScaffali );
    }
}
