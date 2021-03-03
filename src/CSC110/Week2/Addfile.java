package CSC110.Week2;

import java.io.File;
import java.util.Scanner; 
import java.io.FileNotFoundException;

public class Addfile {
    public static void main(String [] args) throws FileNotFoundException {
        File file = new File("  /Users/ericolson/ERIC/AssmtReadWrite/src/CSC110/Week2/data.txt");
        Scanner scan = new Scanner(file); 
        

        while(scan.hasNextLine()) {
        System.out.println(scan.nextLine()); }
        scan.close(); 

}}

