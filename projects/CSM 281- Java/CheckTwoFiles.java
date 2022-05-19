import java.io.*;
public class CheckTwoFiles {
   public static void main(String[]args){
	   File f1 = new File("data.txt");
	   File f2 = new File("data2.txt");
	  if(f1.exists() && f2.exists()){
		System.out.println("The more recent file is ");
		if(f1.lastModified()> f2.lastModified())  
		  System.out.println(f1.getName());
		else
		   System.out.println(f2.getName());
		if(f1.length() > f2.length())
		   System.out.println(f1.getName()+ " is the longer file");
		else
		   System.out.println(f2.getName()+ " is the longer file");
	  }
		}
}
