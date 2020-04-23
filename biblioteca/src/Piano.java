import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Piano {
    private Scaffale[] scaffali;
    private char[] alfabeto = "ABCDEFGHILMN".toCharArray();


    public Piano(int numeroScaffali){
        scaffali = new Scaffale[numeroScaffali];
    }

    public Scaffale[] getScaffali(){
        return scaffali;
    }

    public void aggiungiLibro(Libro libro, String scaffale) {
        char c = scaffale.charAt(0);
        int i=0;

        for(; i < alfabeto.length; i++){
            if (alfabeto[i] == c){
                break;
            }
        }

        if(scaffali[i] == null){
            scaffali[i]= new Scaffale();
        }
        scaffali[i].aggiungiLibro(libro);
    }
}
