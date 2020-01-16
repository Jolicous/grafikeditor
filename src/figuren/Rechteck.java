package figuren;

import figuren.Figur;

import java.awt.*;

public class Rechteck extends Figur {
    public Rechteck(String typ, int x, int y, int hoehe, int laenge, Color color, int stroke){
        super(typ, x, y, color, stroke);
        this.hoehe = hoehe;
        this.laenge = laenge;
    }
    private int hoehe;
    private int laenge;

    public int getHoehe(){
        return hoehe;
    }

    public int getLaenge(){
        return laenge;
    }

    @Override
    public void zeichnen(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(getColor());
        g2.drawRect(getX(), getY(), getLaenge(), getHoehe());
        g2.setStroke(new BasicStroke(getStroke()));
    }

    public String toString(){
        return super.getTyp() + " " + super.getX() + " " + super.getY() + " " + hoehe + " " + laenge;
    }
}
