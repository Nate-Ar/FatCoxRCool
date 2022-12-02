import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//loading name of file
        String filename = "/Volumes/Extreme SSD/Soft Fall/CS-256/labs/saves/lab16/src/";
        System.out.print("Enter file name : ");
        filename = filename + sc.nextLine();
        File file = new File(filename); //reading data from this file
        Scanner reader;
        String line="";
        check stack = new check();
        System.out.println("Palindrom lines are as below");
        try {
            reader = new Scanner(file);

            while(reader.hasNextLine()){

                line = reader.nextLine();

                if(stack.isPalindrom(line)){

                    System.out.println(line);

                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }
        sc.close();
    }
}

