package CSC110.Week2;
import static java.lang.System.out; 
public class InputOutPut {

    public static void main(String... args) {
        var startValue = 1; 
        var endValue = 100; 
        var incrementValue = 5; 

        out.println("Start of process"); 
        for( startValue = 0; 
        startValue <= endValue; 
        startValue = startValue + incrementValue) {

        out.println("Decimal Number = " + startValue); 
        out.println("Binary Number = " + Integer.toBinaryString(startValue)); 

}}}
