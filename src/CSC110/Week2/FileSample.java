package CSC110.Week2;

import java.io.IOException; 
import java.nio.file.Files; 
import java.nio.file.Paths; 

public class FileSample {

    int grade = 0; //FileSample.grade
    public static void main(String [] args) {
        //var grade = 0; //FileSample.main.grade
        try {
            var myDataFile = "/Users/ericolson/ERIC/AssmtReadWrite/src/CSC110/Week3/grades.txt";
            readFileWithGrades(myDataFile);
        } catch (Exception e) {
            System.out.println("There was an error while reading the file " + e.getMessage()); 
    }
}

    public static void readFileWithGrades(String filename) throws IOException {
        var filePath = Paths.get(filename); 
        var dataLines = Files.readAllLines(filePath); 
        
        var totalGrades = 0.00; 
        var grade = 0.00; 
        var average = 0.00; 
        var gradeCount = 0; 

        for (var line : dataLines) { 
            try {
                grade = Double.parseDouble(line); 
            } catch (Exception e) {
                System.out.println(e.getMessage()); 
                grade = 0; 
                continue; 
            }
            
            totalGrades = totalGrades + grade; 
            //System.out.println("Grades Total = " + totalGrades);    
            System.out.println(totalGrades);
            gradeCount++; 
            //gradeCount+=100; 
        }

        var expectedGradeAverage = 92.96; 
        average = totalGrades/gradeCount;
        if(average!=expectedGradeAverage){ 
            System.out.println("The test failed"); 
        }
        System.out.println(average); 
    }


    public static void readFileOnDisk(String filename) throws IOException {
        var filePath = Paths.get(filename); 
        var dataLines = Files.readAllLines(filePath); 
        //var lineNumber = 1; 
        var startLineNumber = false; 
        

        for (var line : dataLines) {
            if(startLineNumber == false) { // if this is true
                //name, address, phone, subject, grade
                startLineNumber = true; 
                continue;
            }
            System.out.println(line); 
            var dataParts = line.split(","); 
            for (var item : dataParts) {
                System.out.println(item); 
            }
            var grade = dataParts[4]; 
            Double.parseDouble(grade); 
        }
    } 
}
