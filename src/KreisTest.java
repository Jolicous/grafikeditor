import figuren.Kreis;
import org.junit.jupiter.api.Test;

import java.awt.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class KreisTest {
    private Graphics g = new GraphicsStub();
    @Test
    public void testZeichnen(){
        Kreis k = new Kreis("Kreis", 50, 50, 10, Color.BLACK, 1);
        k.zeichnen(g);
        //assertEquals();
    }
}
