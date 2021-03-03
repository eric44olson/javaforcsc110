package CSC110.Week6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class DataStructure {
	public static void main(String[] args) {
		long start = System.currentTimeMillis(); 
			var fileName = "/Users/ericolson/Desktop/Sample100.csv";
			try {
			var userList = getData(fileName);
			writeData(userList); 
	}	 	catch (Exception e) {
			System.out.println(e.getMessage()); 
			System.out.println("Time taken: " + (System.currentTimeMillis() - start) + " ms");
	}}

	public static ArrayList<Person> getData(String fileName) throws IOException {
		var userList = new ArrayList<Person>();
		var filePath = Paths.get(fileName);
		// defensive programming

			if(!Files.exists(filePath)){		
			return userList;
	}	
		
		var bufferReader = Files.newBufferedReader(filePath); // this is to throw away the the column labels
		var dataLine = bufferReader.readLine(); // assign
			if(dataLine == null){ /// compare
			bufferReader.close();
			return userList;
	}
			System.out.println("Data: "+ dataLine);
			dataLine = bufferReader.readLine(); 
		
			while(dataLine != null){
			System.out.println("Data: "+ dataLine);

		var foundX =  dataLine.startsWith("X");
			if(!foundX ){ // if the data does not start with X
				var person = new Person(); 
				var dataPart = dataLine.split(","); 
				person.name = dataPart[0]; 
				person.address = dataPart[1];
				person.phone = dataPart[2];
				person.amountOwed = Double.parseDouble(dataPart[3]);
				userList.add(person); 
	}		
				dataLine = bufferReader.readLine();
	}
				bufferReader.close();
				return userList; 
}

	public static void writeData(ArrayList<Person> userList) throws IOException {

		// write the data to the file       
		var outFleName = "/Users/ericolson/Desktop/Sample100.csv";        
		var outFilePath = Paths.get(outFleName);        
		var writeStream = Files.newBufferedWriter(outFilePath);        
			for (var userData : userList) {  
			writeStream.write(userData.name+","+userData.address+"."+userData.phone+","+userData.amountOwed.toString());  
			writeStream.newLine();  // ** need to know why you need to do this       
	}          
			writeStream.close(); 
}
	
}
