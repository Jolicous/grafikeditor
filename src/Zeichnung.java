import figuren.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Vector;

public class Zeichnung {
    public ArrayList<Figur> figuren;

    public Zeichnung(){
        this.figuren = new ArrayList<Figur>();
    }

    /**
     * Zeichnet alle Figuren.
     * @param g Referenz auf das Graphics-Objekt zum zeichnen.
     */
    public void zeichneFiguren(Graphics g) {
        for (Figur f : figuren) {
            f.zeichnen(g);
        }
    }

    /**
     * Fügt eine weitere figuren.Figur hinzu und löst die Auffrischung des Fensterinhaltes aus.
     * @param figur Referenz auf das weitere figuren.Figur-Objekt.
     */
    public void hinzufuegen(Figur figur) {
        figuren.add(figur);
    }

    /**
     * Löscht alle Figuren und löst die Auffrischung des Fensterinhaltes aus.
     */
    public void allesLoeschen() {
        figuren.clear();
    }
}