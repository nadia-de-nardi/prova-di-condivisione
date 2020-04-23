import com.sun.org.apache.xml.internal.security.algorithms.implementations.IntegrityHmac;
import sun.management.Agent;
import sun.management.AgentConfigurationError;

import java.util.Enumeration;
import java.util.Scanner;

public class Menu {

    public int menu() {
        System.out.println("1) Aggiungi un libro al catalogo della biblioteca(piano+scaffale+numero");
        System.out.println("2) Vedi i libri su uno scaffale (inserisci codice piano+scaffale)");
        System.out.println("3) Cerca un libro per codice ISBN");
        System.out.println("4) Cerca un libro per titolo/autore/genere: ");
        System.out.println("0) Esci");
        System.out.println("Inserire il numero corrispondente all'azione richiesta: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public Libro creaLibro(Biblioteca biblioteca) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il titolo del libro: ");
        String titolo = scanner.nextLine();

        System.out.print("Inserisci l'autore del libro: ");
        String autore = scanner.nextLine();

        System.out.print("Inserisci il genere del libro: ");
        String genere = scanner.nextLine();

        System.out.print("Inserisci codice ISBN del libro (13 caratteri numerici): ");
        String ISBN = scanner.nextLine();

        Libro libro = new Libro(titolo, autore, genere, ISBN);

        System.out.print("Inserisci il piano dove catalogare il libro: ");
        String piano = scanner.nextLine();

        System.out.print("Inserisci la lettera dello scaffale dove catalogare il libro: ");
        String scaffale = scanner.nextLine();

        biblioteca.aggiungiLibro(libro,scaffale,piano);
        libro.creaCodiceCatalogazione(piano,scaffale,libro.getNumero());

        return libro;
    }

    public static String getLibriPerPianoEScaffale (Biblioteca biblioteca){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci codicePiano:\n0) PT\n1)PP\n2)SP ");
        String p = scanner.nextLine();
        int piano = Integer.parseInt(p);

        System.out.println("Inserisci codiceScaffale (Es.: B) : ");
        String scaffale = scanner.nextLine();

        biblioteca.cercaPerPianoEScaffale(piano, scaffale);

        return (piano+scaffale);
    }


    public void getLibroPerISBN (Biblioteca biblioteca){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci codice ISBN del libro che vuoi cercare: ");
        String ISBN = scanner.nextLine();

        biblioteca.cercaPerISBN(ISBN);

    }

    public void getLibroPerTitoloAutoreGenere (Biblioteca biblioteca){
        System.out.println("Lascia vuoto se non vuoi ricercare per uno di campi sottostanti.");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il titolo o parte del titolo del libro che vuoi cercare: ");
        String titolo = scanner.nextLine();

        System.out.print("Inserisci il nome dell'autore del libro che vuoi cercare: ");
        String autore = scanner.nextLine();

        System.out.print("Inserisci il genere del libro che vuoi cercare: ");
        String genere = scanner.nextLine();

        biblioteca.cercaPerTitoloAutoreGenere(titolo, autore, genere);
    }
}
