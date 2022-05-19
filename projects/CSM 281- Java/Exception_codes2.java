
public class Exception_codes2 {

	public static void main(String[]args)
	throws ArithmeticException {
		int num = 13;
		int denom = 0;
		int result;
		try
		{
			
			result = num/denom;
		}
		catch(ArithmeticException error){
			System.out.println("The official messgae is" +error.getMessage());
					}
		

	}

}
