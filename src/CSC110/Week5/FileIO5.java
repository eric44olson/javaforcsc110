package CSC110.Week5;

import java.io.IOException; 
import java.nio.file.Files; 
import java.nio.file.Paths; 
import java.util.ArrayList; 
public class FileIO5 {
public static void main(String... args) throws IOException{
    var fileName = "/Users/ericolson/ERIC/AssmtReadWrite/src/CSC110/Week5/data.txt3";
    var filePath = Paths.get(fileName); 
    if(!Files.exists(filePath)){
        System.out.println("The file " + fileName + " could not be found."); 
    }

    {var userInfos = new ArrayList<String>(); 
    
        //var dataElementCount = 0; 
        var readStream = Files.newBufferedReader(filePath); 
        var data = readStream.readLine(); 

        while(data != null){
            data = readStream.readLine();
            if(data != null){
                userInfos.add(data); 
            }
        }
        readStream.close(); 

        var outFileName = "/Users/ericolson/ERIC/AssmtReadWrite/src/CSC110/Week5/data.txt3"; 
        var outFilePath = Paths.get(outFileName); 
        var writeStream = Files.newBufferedWriter(outFilePath); 
        for(var userData : userInfos){
            writeStream.write(userData);
            writeStream.newLine();
        }
        writeStream.close();
}

}}