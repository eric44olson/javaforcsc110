package CSC110.Week2;
import static java.lang.System.out; 
public class InputOutPut1 {

    public static void main(String... args) {
        var startValue = 1; 
        var endValue = 100; 
        var incrementValue = 5; 

        out.println("Start of process"); 
        for( startValue = 0; 
        startValue <= endValue; 
        startValue = startValue + incrementValue) {
        
        PrintData("The current Value", startValue); 
            
            }} 

    public static void PrintData(String message, Integer value){
        var header = ("-"); 
        System.out.println(header.repeat(22));
        System.out.print(message + " = "); 
        System.out.println(value); 


            }}
            