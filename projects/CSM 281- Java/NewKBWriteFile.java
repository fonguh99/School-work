import java.io.*;
public class NewKBWriteFile {
     public static void main(String[]args)
     throws IOException{
         InputStream istream;
         OutputStream ostream;
         File outFile = new File("datafile.txt");
         int c;
         istream = System.in;
         ostream = new FileOutputStream(outFile);
         System.out.println("type some characters ");
       try{
     	  while((c = istream.read()) != -1)
     		  ostream.write(c);
     	  }
       catch(IOException e){
     	  System.out.println("Error: " + e.getMessage());
       }
       finally{
     	  istream.close();
     	  ostream.close();
       }
       
       }
}
