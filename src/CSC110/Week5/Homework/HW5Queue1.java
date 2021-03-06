package CSC110.Week5.Homework;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.PriorityQueue;

public class HW5Queue1 {

    public static void main(String[] args) throws IOException{
    // starting point or the entry point

    var fileName = "/Users/ericolson/ERIC/AssmtReadWrite/src/CSC110/Week5/data.txt3";
    var filePath = Paths.get(fileName); 
    // defensive programming

    if(!Files.exists(filePath)){
        System.out.println("***** Error: Could not find the file in the path " + fileName);
        return;
    }
        System.out.println("***** Success: The file was found in the path " + fileName); 
         
        var bufferReader = Files.newBufferedReader(filePath); // this is to throw away the column labels
        var dataLine = bufferReader.readLine();

        if(dataLine == null){
            System.out.println("Sucess: There is no data in the file " + fileName); 
            bufferReader.close(); 
            return;
        }
        System.out.println("Data: " + dataLine);
        
        dataLine = bufferReader.readLine();

        //
        //
        //
        //var userList = new ArrayList<String>();
        PriorityQueue<String> userList = new PriorityQueue<String>();
        //
        //
        //
        
        while(dataLine != null){
            System.out.println("Data: " + dataLine);


            var foundX = dataLine.startsWith("X"); 
            if(!foundX){ // if the data does not start with X
                userList.add(dataLine);
            }
            
            dataLine = bufferReader.readLine();
        }
        bufferReader.close(); 

        // write the data to the file
        var outFileName = "/Users/ericolson/ERIC/AssmtReadWrite/src/CSC110/Week5/data_BAD_out.txt3"; 
        var outFilePath = Paths.get(outFileName); 
        var writeStream = Files.newBufferedWriter(outFilePath); 
        for(var userData : userList){
            writeStream.write(userData); 
            writeStream.newLine(); 
        }        
            writeStream.close(); 

}}
