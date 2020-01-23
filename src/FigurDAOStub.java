public class FigurDAOStub implements FigurDAO {
    private String[] testFiguren = {
        "Rechteck 20 250 30 40",
        "Linie 10 500 200 200",
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
