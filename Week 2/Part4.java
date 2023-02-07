
/**
 * Write a description of Part4 here.
 * 
 * @author Khant Zaw Phyo 
 * @version 4 Feb 2023
 */
import edu.duke.*;
import java.io.*;
public class Part4 {
    public void printUrls(){
        URLResource url = new URLResource("https://www.dukelearntoprogram.com//course2/data/manylinks.html");
        // for each word in the url
        for (String word : url.words()) {
            // if the string "youtube.com" exists
            if (word.toLowerCase().indexOf("youtube.com") != -1) {
                int startQuote = word.indexOf("\"");
                int stopQuote = word.indexOf("\"", startQuote + 1);
                String youtubeLink = word.substring(startQuote+1, stopQuote);
                // prints out the links containing "youtube.com"
                System.out.println(youtubeLink);
                System.out.println("");
            }
        }
    }
}
