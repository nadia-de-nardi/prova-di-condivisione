import java.util.List;

public class bibliotecaApp {

    public static void main(String[] args) {
        Menu menu = new Menu();
        Biblioteca biblioteca = new Biblioteca(3);
        int azione =0;
        do {
            azione = menu.menu();
            interpreta(menu,biblioteca,azione);
        }while ((azione !=0));
    }

    private static void interpreta (Menu menu, Biblioteca biblioteca, int azione){
        switch (azione){
            case 1:
                menu.creaLibro(biblioteca);
                break;

            case 2:
                menu.getLibriPerPianoEScaffale(biblioteca);
                break;

            case 3:
                menu.getLibroPerISBN(biblioteca);
                break;
            case 4:
                menu.getLibroPerTitoloAutoreGenere(biblioteca);
                break;

        }
    }
}
