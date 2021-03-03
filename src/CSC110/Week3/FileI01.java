package CSC110.Week3;
//import java.io.FileReader;
import java.io.IOException; 
import java.nio.file.Files; 
import java.nio.file.Paths; 
//import java.io.LineNumberReader; 
public class FileI01 {
    
    public static void main(String... args) throws IOException { 
        var fileName= "/Users/ericolson/ERIC/AssmtReadWrite/src/CSC110/Week3/data2.txt"; 
        var filePath = Paths.get(fileName); 
        if(!Files.exists(filePath)) {
            System.out.println("The file " + fileName + " could not be foubd."); 
        }

        var readStream = Files.newBufferedReader(filePath);
        var data = readStream.readLine(); 

        while(data !=null){
            System.out.println("The data " + data.toUpperCase()); 
            data = readStream.readLine(); 
        }}}