import figuren.Figur;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FigurParserTest {
    private FigurDAO dao;
    private FigurParser fp;

    @Before
    public void setup()
    {
        dao = new FigurDAOStub();
        fp = new FigurParser(dao);
    }

    @Test
    public void test(){
        setup();
        List<Figur> figuren = fp.parse();
        assertEquals("Rechteck 150 20 30 40", figuren.get(0).toString());
        assertEquals("Linie 100 100 200 200", figuren.get(1).toString());
        assertEquals("Kreis 10 75 5", figuren.get(2).toString());
    }
}
