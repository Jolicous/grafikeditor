import java.awt.*;

public class GraphicsStub extends ConcreteGraphics {
    int numberOfDrawOvalCalls;
    int x;
    int y;
    int width;
    int height;

    public void drawOval(int x, int y, int width, int height){
        numberOfDrawOvalCalls++;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
