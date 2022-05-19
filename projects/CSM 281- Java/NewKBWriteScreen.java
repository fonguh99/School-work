import java.io.*;
public class NewKBWriteScreen {

	 public static void main(String[] args)
		 throws IOException{
        InputStream istream;
        OutputStream ostream;
        int c;
        istream = System.in;
        ostream = System.out;
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

