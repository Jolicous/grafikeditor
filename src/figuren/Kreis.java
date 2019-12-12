package figuren;

import figuren.Figur;

import java.awt.*;

public class Kreis extends Figur {
    public Kreis(int x, int y, int radius, Color color, int stroke){
        super(x, y, color, stroke);
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
        g2.drawOval(getX(), getY(), getRadius(), getRadius());
        g2.setStroke(new BasicStroke(getStroke()));
    }
}
