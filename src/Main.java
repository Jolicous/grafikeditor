import figuren.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Vector;

public class Main {
    private static final Display display = new Display();
    private static ArrayList<Figur> figur = new ArrayList<>();

    public static void main(String[] args) {
        Rechteck rechteck = new Rechteck("Rechteck", 10, 20, 500, 300, Color.RED, 50);
        Linie linie = new Linie("Linie", 650, 500, 10, 20, Color.BLUE, 50);
        Kreis kreis = new Kreis("Kreis", 250, 150, 400, Color.GREEN, 50);
        Text text = new Text("Text", 350, 200, "Wow this looks amazing", Color.CYAN, 20);

        rechteck.move(100, -100);
        linie.move(100, -100);

        figur.add(linie);
        figur.add(text);

        Gruppe gruppe = new Gruppe("Gruppe", 0, 0, Color.BLACK, 0);
        gruppe.zuGruppeHinzufuegen(rechteck);
        gruppe.zuGruppeHinzufuegen(kreis);
        figur.addAll(gruppe.figurGruppe);

        Zeichnung zeichnung = new Zeichnung();

        zeichnung.figuren = figur;

        display.setZeichnung(zeichnung);
    }
}
