/**
 * Write a description of Part3 here.
 * 
 * @author Khant Zaw Phyo 
 * @version 4 Feb 2023
 */
public class Part3 {
    public boolean twoOccurrences(String stringa, String stringb) {
        int firstOccurrence = stringb.indexOf(stringa);
        if (firstOccurrence != -1) {                    
            int secondOccurrence = stringb.indexOf(stringa, firstOccurrence + 1);
            if (secondOccurrence != -1) {
                return true;
            }
        }
        
        else { return false; }
        return false;
    }
    
    public String lastPart(String stringa, String stringb) {        
        int occurrence = stringb.indexOf(stringa);
        if (occurrence != -1) {
            return stringb.substring(occurrence + stringa.length());
        }
        else {
            return stringb;
        }
    }
    
    public void testing() {
        // firstPart: two occurrences
        System.out.println("by , A Story by Abby Long");
        System.out.println(twoOccurrences("by", "A story by Abby Long"));
        System.out.println("a, banana");
        System.out.println(twoOccurrences("a", "banana"));
        System.out.println("gta , atttaggatagt");
        System.out.println(twoOccurrences("gta", "atttaggatagt"));
        System.out.println("banana and an");
        // lastPart
        System.out.println("Last Part");
        System.out.println(lastPart("an", "banana"));
        System.out.println("zoo , forest");
        System.out.println(lastPart("zoo", "forest"));
    }
}
