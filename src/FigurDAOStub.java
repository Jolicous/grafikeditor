public class FigurDAOStub implements FigurDAO {
    private String[] testFiguren = {
        "Rechteck 150 20 30 40",
        "Linie 100 100 200 200",
        "Kreis 10 75 5"
    };

    private int currentFigur = 0;

    @Override
    public String[] readNextFigurData() {
        if(currentFigur < testFiguren.length) {
            String[] figurData = testFiguren[currentFigur].split("\\s");
            currentFigur++;
            return figurData;
        }
        return null;
    }
}
