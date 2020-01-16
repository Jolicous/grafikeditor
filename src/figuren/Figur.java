package figuren;

import java.awt.*;

public abstract class Figur{
    public Figur(String typ, int x, int y, Color color, int stroke){
        this.typ = typ;
        this.xKoordinate = x;
        this.yKoordinate = y;
        this.color = color;
        this.stroke = stroke;
    }
    private String typ;
    private int xKoordinate;
    private int yKoordinate;
    private Color color;
    private int stroke;

    public String getTyp(){
        return typ;
    }

    public int getX(){
        return xKoordinate;
    }

    public int getY(){
        return yKoordinate;
    }

    public Color getColor(){
        return color;
    }

    public int getStroke(){
        return stroke;
    }

    public abstract void zeichnen(Graphics g);

    public void move(int deltaX, int deltaY){
        xKoordinate += deltaX;
        yKoordinate += deltaY;
    }

    public abstract String toString();
}
