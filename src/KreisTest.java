import figuren.Kreis;
import org.junit.jupiter.api.Test;

import java.awt.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class KreisTest {
    private GraphicsStub g = new GraphicsStub();

    @Test
    public void testZeichnen(){
        Kreis k = new Kreis("Kreis", 50, 50, 10, Color.BLACK, 1);
        k.zeichnen(g);
        assertEquals(1, g.numberOfDrawOvalCalls);
        assertEquals(40, g.x);
        assertEquals(40, g.y);
        assertEquals(20, g.height);
        assertEquals(20, g.width);
    }
}
