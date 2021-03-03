package CSC110.Week6.Homework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSV {
    public static void main(String[] args){

        long start = System.currentTimeMillis();

        String path = "/Users/ericolson/Desktop/Sample100.csv"; 
        String line = ""; 

        try{
           BufferedReader br = new BufferedReader(new FileReader(path)); 

            while((line = br.readLine()) != null){
              String[] values = line.split(","); 
              System.out.println("Serial Number: " + values[0] + ", Company: " + values[1] + ", Employee Markme: " + values[2] + ", Description: " + values[3] + ", Leave: " + values[4]); 
            }

        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("Time taken: " + (System.currentTimeMillis() - start) + " ms");
}
}
