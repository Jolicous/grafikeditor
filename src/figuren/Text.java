package figuren;

import java.awt.*;

public class Text extends Figur {
    public Text(int x, int y, String text, Color color, int stroke){
        super(x, y, color, stroke);
        this.text = text;
    }
    private String text;

    public String getText(){
        return text;
    }

    @Override
    public void zeichnen(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(getColor());
        g2.drawString(getText(), getX(), getY());
        g2.setStroke(new BasicStroke(getStroke()));
    }
}
