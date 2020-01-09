import figuren.Figur;

import java.util.List;

public class DaoMain {
    public static void main(String[] args){
        FigurFileDAO dao = new FigurFileDAO();
        FigurParser fp = new FigurParser(dao);
        List<Figur> figuren = fp.parse();
        System.out.println(figuren);
        dao.close();
    }
}
