package figuren;

import figuren.Figur;

import java.awt.*;

public class Kreis extends Figur {
    public Kreis(String typ, int x, int y, int radius, Color color, int stroke){
        super(typ ,x, y, color, stroke);
        this.radius = radius;
    }
    private int radius;

    public int getRadius(){
        return radius;
    }

    @Override
    public void zeichnen(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(getColor());
        g2.drawOval(getX()-radius, getY()-radius, getRadius()*2, getRadius()*2);
        g2.setStroke(new BasicStroke(getStroke()));
    }

    @Override
    public String toString(){
        return super.getTyp() + " " + super.getX() + " " + super.getY() + " " + radius;
    }
}
