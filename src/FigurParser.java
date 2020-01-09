import figuren.Figur;
import figuren.Kreis;
import figuren.Linie;
import figuren.Rechteck;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class FigurParser{
  private FigurDAO dao;

  public FigurParser(FigurDAO dao) {
    this.dao = dao;
  }

  public List<Figur> parse() {
    List<Figur> figuren = new ArrayList<Figur>();
    String[] figurData = dao.readNextFigurData();
    while (figurData != null) {
      String figurTyp = figurData[0];
      int x = Integer.parseInt(figurData[1]);
      int y = Integer.parseInt(figurData[2]);
      switch (figurTyp) {
      case "Rechteck":
        int breite = Integer.parseInt(figurData[3]);
        int hoehe = Integer.parseInt(figurData[4]);
        figuren.add(new Rechteck(x, y, breite, hoehe, Color.GREEN, 1));
        break;
      case "Kreis":
        int radius = Integer.parseInt(figurData[3]);
        figuren.add(new Kreis(x, y, radius, Color.BLUE, 1));
        break;
      case "Linie":
        int endx = Integer.parseInt(figurData[3]);
        int endy = Integer.parseInt(figurData[4]);
        figuren.add(new Linie(x, y, endx, endy, Color.BLACK, 1));
        break;
      }
      figurData = dao.readNextFigurData();
    }
    return figuren;
  }
}
