
public class Exception_codes {

	public static void main(String[]args)
	throws ArithmeticException {
		int num = 13;
		int denom = 0;
		int result;
		try
		{
			
			result = num/denom;
		}
		finally{
			System.out.println("It is well");
		}
	}

}
