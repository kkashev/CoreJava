import java.awt.List;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) throws IOException {
        ArrayList testL = new ArrayList();
        Crawler test = new Crawler();
        testL.addAll(test.getAllLinks(test.getContent("http://abv.bg")));
        System.out.println(testL);
    }

}
