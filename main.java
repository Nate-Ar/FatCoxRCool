/*Nathan Arter
11/28/22
to pass data to the hash table and then print the output
* */
import java.io.FileReader;
import java.util.Scanner;
public class main {
    public static void main(String[] args) throws Exception {
        HashTable HashSet=new HashTable();
        String line;
        //imorts files for reading
        FileReader file = new FileReader("/Volumes/Extreme SSD/Soft Fall/CS-256/labs/saves/lab15/src/clab15.txt");
        Scanner sc = new Scanner(file);
        //see if words are null
        while(sc.hasNext()) {
            //reads words
            String data=sc.next();
            //adds to set
            HashSet.insert(data);
        }
        //print set
        HashSet.display();
    }
}
