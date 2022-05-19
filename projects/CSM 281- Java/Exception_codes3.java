
public class Exception_codes3 {

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
			System.out.println("The official message is " + error.getMessage());
			System.out.println("Denominator corrected to 1 ");
			result = num/1;
					}
		System.out.println("Result is "+ result);
		
	}

}
