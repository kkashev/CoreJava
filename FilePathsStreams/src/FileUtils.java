import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Currency;
import java.util.Scanner;


public class FileUtils {
    private FileUtils(){
    }
    
    String readFrom(File file) throws FileNotFoundException{
//        String content = new Scanner(new File("file.txt")).useDelimiter("\\Z").next();        
//        System.out.println(content);
//        return content;
      BufferedReader br = null;
      String currentLine;
      br = new BufferedReader(new FileReader("file.txt"));
      try {
        while ((currentLine = br.readLine()) != null){
              System.out.println(currentLine);
          }
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
      return null;
        
    }
}
