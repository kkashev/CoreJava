import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Crawler {
    private String content = "";
    public String getContent(String url) throws IOException {
        URL website = new URL(url);
        BufferedReader in = new BufferedReader(new InputStreamReader(website.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            //System.out.println(inputLine);
            content += inputLine;
        }
        in.close();
        return content;
    }
    
    public void crawl(){
        //System.out.println(content);
        String[] parts = null;
        if (content.contains("href")){
             parts = content.split("href");
        }
        System.out.println(parts[5]);
//        else {
//            throw new IllegalArgumentException("String " + content + " does not contain -");
//        }
    }
    
    
    public static ArrayList<String> getAllLinks(String content) {
        ArrayList<String> resultList = new ArrayList<>();
        String regex = "<a.*?href=\"((?!javascript).*?)\".*?>";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            resultList.add(matcher.group(1));
        }
        return resultList;
    }

    
}
