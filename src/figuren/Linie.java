package figuren;

import figuren.Figur;

import java.awt.*;

public class Linie extends Figur {
    public Linie(int x, int y, int xKoordinate, int yKoordinate, Color color, int stroke){
        super(x, y, color, stroke);
        this.xKoordinate = xKoordinate;
        this.yKoordinate = yKoordinate;
    }
    private int xKoordinate;
    private int yKoordinate;

    public int getX2(){
        return xKoordinate;
    }

    public int getY2(){
        return yKoordinate;
    }

    @Override
    public void zeichnen(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(getColor());
        g2.drawLine(getX(), getY(), getX2(), getY2());
        g2.setStroke(new BasicStroke(getStroke()));
    }

    @Override
    public void move(int deltaX, int deltaY) {
        super.move(deltaX, deltaY);
        xKoordinate += deltaX;
        yKoordinate += deltaY;
    }
}
