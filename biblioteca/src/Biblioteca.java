import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private Piano [] piani = new Piano[3];
    private String [] nomePiani = {"PT", "PP", "SP"};
    private int [] numeroScaffali = {4, 12, 10};
    private String [] lettereScaffali = {"A","B", "C","D", "E", "F", "G", "H", "I", "L", "M", "N"};

    public Biblioteca(int numeroPiani){
        piani = new Piano[numeroPiani];
    }

    public Piano[] getPiani() {
        return piani;
    }

    public void aggiungiLibro(Libro libro, String scaffale, String piano){

        int i=0;

        for(; i < nomePiani.length; i++){
            if (nomePiani[i].equals(piano)){
                break;
            }
        }

        if(piani[i] == null){
            piani[i]= new Piano(numeroScaffali[i]);
        }
        libro.setPiano(piano);
        piani[i].aggiungiLibro(libro, scaffale, piani[i].getScaffali());
    }

    public void cercaPerPianoEScaffale (String piano, String scaffale){
        int indiceScaffale = 0;

        String codicePianoEScaffale = piano + scaffale; //PTA
        List<Libro> listalibri = Scaffale.libri.get(codicePianoEScaffale);

        for (int i = 0; i < listalibri.size(); i++) {
         listalibri.get(i).getLibro();
         listalibri.get(i).visualizzaCodiceCatalogazione();
        }

        for(int i=0; i < lettereScaffali.length; i++){

            if (lettereScaffali[i].equals(scaffale)){
                indiceScaffale = i;
                break;
            }
        }
        /*
        for(int i=0; i < piani.length; i++){
            Piano pianoCorrente = piani[i];
            if (pianoCorrente!=null && i==piano){
                for(int j = 0; j < pianoCorrente.getScaffali().length; j++){
                    Scaffale scaffaleCorrente = pianoCorrente.getScaffali()[j];
                    if(scaffaleCorrente != null && j==indiceScaffale){
                        for (int z = 0; z< scaffaleCorrente.getLibri().size(); z++){
                            Libro libroCorrente = scaffaleCorrente.getLibri().get(z);
                            libroCorrente.getLibro();
                            libroCorrente.visualizzaCodiceCatalogazione();


                        }
                    }
                }
            }

        }
*/
    }
/*
    public void cercaPerISBN (String ISBN){
        int temp = 0;



        for(int i=0; i < piani.length; i++){
            if (piani[i]!=null){
                for(int j = 0; j < piani[i].getScaffali().length; j++){
                    if(piani[i].getScaffali()[j] != null){
                        for (int z = 0; z< piani[i].getScaffali()[j].getLibri().size(); z++){
                            if(ISBN.equals(piani[i].getScaffali()[j].getLibri().get(z).getISBN())) {
                                temp=1;
                                piani[i].getScaffali()[j].getLibri().get(z).getLibro();
                                piani[i].getScaffali()[j].getLibri().get(z).visualizzaCodiceCatalogazione();
                            }
                        }
                    }
                }
            }
        }
        if(temp==0){
            System.out.println("Non c'è nessun libro che corrispondenta al codice ISBN inserito.");

        }

    }
    public List<Libro> getTuttiILibri (){

        List<Libro> tuttiILibri = new ArrayList<Libro>();

        for(int i=0; i < piani.length; i++){
            if (piani[i]!=null){
                for(int j = 0; j < piani[i].getScaffali().length; j++){
                    if(piani[i].getScaffali()[j] != null){
                        for (int z = 0; z< piani[i].getScaffali()[j].getLibri().size(); z++){
                            tuttiILibri.add(piani[i].getScaffali()[j].getLibri().get(z));
                        }
                    }
                }
            }
        }
        return tuttiILibri;
    }
    public List<Libro> cercaperTitolo (String titolo, List<Libro> lista){
        List<Libro> libriPerTitolo = new ArrayList<Libro>();
        for(Libro libro : lista){
            if(libro.getTitolo().contains(titolo)){
                libriPerTitolo.add(libro);
            }
        }

        return libriPerTitolo;
    }
    public List<Libro> cercaperAutore (String autore, List<Libro> lista){
        List<Libro> libriPerAutore = new ArrayList<Libro>();
        for(Libro libro : lista){
            if(libro.getAutore().equals(autore)){
                libriPerAutore.add(libro);
            }
        }

        return libriPerAutore;
    }
    public List<Libro> cercaPerGenere (String genere, List<Libro> lista){
        List<Libro> libriPerGenere = new ArrayList<Libro>();
        for(Libro libro : lista){
            if(libro.getGenere().equals(genere)){
                libriPerGenere.add(libro);
            }
        }

        return libriPerGenere;
    }

    public void cercaPerTitoloAutoreGenere(String titolo, String autore, String genere){
        List<Libro> tuttiILibri = getTuttiILibri();


        if(!titolo.equals("")){
            tuttiILibri = cercaperTitolo(titolo, tuttiILibri);
        }
        if (!autore.equals("")){
            tuttiILibri = cercaperAutore(autore, tuttiILibri);

        }
        if (!genere.equals("")){
            tuttiILibri =cercaPerGenere (genere, tuttiILibri);
        }
        if(tuttiILibri.size() > 0){
            for (Libro libro : tuttiILibri){
                libro.getLibro();
                libro.visualizzaCodiceCatalogazione();
            }

        }else {
            System.out.println("Non ci sono libri che corrispondono alla richiesta.");
        }

    }

 */

}
