import figuren.Kreis;
import figuren.Linie;
import figuren.Rechteck;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.mockito.Mockito.*;

public class TestZeichnungMock {
    private Graphics2D g = mock(Graphics2D.class);

    @Test
    public void testZeichneFiguren() {
        Zeichnung z = new Zeichnung();
        Rechteck r = new Rechteck("Rechteck", 10, 10 , 10, 10, Color.BLACK, 1);
        Linie l = new Linie("Linie", 10, 10, 10, 10, Color.BLACK, 1);
        Kreis k = new Kreis("Kreis", 10, 10, 10, Color.BLACK, 1);
        z.hinzufuegen(r);
        z.hinzufuegen(l);
        z.hinzufuegen(k);
        z.zeichneFiguren(g);
        verify(g, times(1)).drawRect(10, 10 , 10, 10);
        verify(g, times(1)).drawLine(10, 10, 10, 10);
        verify(g, times(1)).drawOval(0, 0, 20, 20);
    }
}
