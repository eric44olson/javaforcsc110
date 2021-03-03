package CSC110.Week1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class W1A {
    public static void main(String... args) throws IOException {
        var fileName = "/Volumes/BU-2020/GateWayCC/Week 1 Demos/1-Demo Hello/Hello.java"; 
        var file = new File(fileName); 
        var lineStream = Files.lines(file.toPath());
        var lines = lineStream.toArray();
        for (var line : lines) {
            System.out.println(line);  } 

    lineStream.close(); 
    
}}
