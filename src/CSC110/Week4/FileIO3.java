package CSC110.Week4;
import java.io.IOException;
import java.nio.file.Files; 
import java.nio.file.Paths; 
import java.util.ArrayList; 
//import java.util.Arrays; 

public class FileIO3 {
    public static void main(String... args) throws IOException{
        var fileName = "/Users/ericolson/ERIC/AssmtReadWrite/src/CSC110/Week4/data.txt3"; 
        var filePath = Paths.get(fileName); 
        if(!Files.exists(filePath)){
            System.out.println("The file " + fileName + " could not be found."); 
}
        var userInfos = new ArrayList<String>(); 
        //var dataElement = 0; 
        var readStream = Files.newBufferedReader(filePath); 
        var data = readStream.readLine(); 

        while(data != null){
            data = readStream.readLine(); 
            if(data != null){
                userInfos.add(data); 
}}

        System.out.println("-----NAMES-----"); 
        for(var userData : userInfos){
            //var elements = userData.split(","); 
            System.out.println(userData); 
}
        System.out.println("----------"); 
}}
