import figuren.Figur;

import java.awt.*;
import java.util.Vector;

public class Gruppe extends Figur {
    public Vector<Figur> figurGruppe;

    public Gruppe(String typ, int x, int y, Color color, int stroke){
        super(typ, x, y, color, stroke);
        figurGruppe = new Vector<Figur>();
    }

    public void zuGruppeHinzufuegen(Figur f){
        figurGruppe.add(f);
    }

    @Override
    public void zeichnen(Graphics g){
        for(Figur f: figurGruppe){
            f.zeichnen(g);
        }
    }

    @Override
    public String toString() {
        return null;
    }
}
