import java.io.*;
public class CheckFile {

	public static void main (String[]args){
		File myFile = new File("data.txt");
 if(myFile.exists())
 {
	 System.out.println(myFile.getName() + " exists");
	System.out.println("The file is " + myFile.length() + " bytes long");
	if(myFile.canRead())
		System.out.println("ok to read");
	if(myFile.canWrite())
		System.out.println("ok to write");
	
 }
 else
	 System.out.println("File does not exist");
	}
 }
	

