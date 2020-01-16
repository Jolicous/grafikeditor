import figuren.Kreis;
import figuren.Linie;
import figuren.Rechteck;

import java.awt.*;

final class EditorControl {
  private Zeichnung zeichnung = new Zeichnung();
  private char figurTyp;
  private Point ersterPunkt;

  public void allesNeuZeichnen(Graphics g) {
   zeichnung.zeichneFiguren(g);
  }

  public void setFigurTyp(char figurTyp) {
    this.figurTyp = figurTyp;
  }

  public void setErsterPunkt(Point ersterPunkt) {
    this.ersterPunkt = ersterPunkt;
  }

  public void erzeugeFigurMitZweitemPunkt(Point zweiterPunkt) {
    int x = Math.min(this.ersterPunkt.x, zweiterPunkt.x);
    int y = Math.min(this.ersterPunkt.y, zweiterPunkt.y);
    int hoehe = Math.abs(zweiterPunkt.x - this.ersterPunkt.x);
    int laenge = Math.abs(zweiterPunkt.y - this.ersterPunkt.y);
    switch (this.figurTyp){
      case 'r':
        Rechteck rechteck = new Rechteck("Rechteck", x, y, laenge, hoehe, Color.BLUE, 1);
        zeichnung.hinzufuegen(rechteck);
        break;
      case 'l':
        Linie linie = new Linie("Linie", this.ersterPunkt.x, this.ersterPunkt.y, zweiterPunkt.x, zweiterPunkt.y, Color.GREEN, 1);
        zeichnung.hinzufuegen(linie);
        break;
      case 'k':
        int radius = (int)Math.sqrt(hoehe * hoehe + laenge * laenge);
        Kreis kreis = new Kreis("Kreis", this.ersterPunkt.x, this.ersterPunkt.y, radius, Color.RED, 1);
        zeichnung.hinzufuegen(kreis);
        break;
    }
  }
}
