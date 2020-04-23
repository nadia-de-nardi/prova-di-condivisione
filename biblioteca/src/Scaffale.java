import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Scaffale {

    public static HashMap<String, List<Libro>> libri = new HashMap<String, List<Libro>>();
    private List<Libro> listaLibri;

    Scaffale(List<Libro> listaLibri){
        this.listaLibri = listaLibri;

    }

    public List<Libro> getListaLibri() {
        return listaLibri;
    }

    public int aggiungiLibro(Libro libro,List<Libro> listaLibri, Scaffale [] listaScaffali) {
        
        listaLibri.add(libro);

        String pianoKey = libro.getPiano();
        Piano.pianoPerCodice.put(pianoKey, listaScaffali);

        String scaffaleKey = libro.getPiano()+libro.getScaffale();
        libri.put(scaffaleKey, listaLibri);

        int numeroLibri = listaLibri.size();
        libro.setNumeroLibri(numeroLibri);

        libro.creaCodiceCatalogazione(libro.getPiano(), libro.getScaffale(), numeroLibri);
        String codiceCatalogazione = libro.getCodiceCatalogazione();

        Libro.libroPerCodice.put(codiceCatalogazione, libro);

        return numeroLibri;
    }

}
