import java.io.*;
public class NewKBReadFile {
	public static void main(String[]args)
    throws IOException{
        InputStream istream;
        OutputStream ostream;
        File inFile = new File("datafile.dat");
        int c;
        istream = new FileInputStream(inFile);
        ostream = System.out;
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
