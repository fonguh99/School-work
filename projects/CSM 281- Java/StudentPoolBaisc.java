//A program 
public class StudentPoolBaisc
{
	public static void main(String[] args)
	{
		int[]responses ={1,1,1,4,3,2,1,1,4,3,5,3,2,2,4,3,4,4,3};
		int[]frequency =new int[6];
		for(int i=0; i<responses.length; i++)
		{
			++frequency[responses[i]];
		}//end for
		System.out.printf("%s%10s\n", "Rating", "Frequency" );
		 for (int rating = 1; rating < frequency.length; rating++ )
		 {
		System.out.printf ("%d%10d\n", rating ,frequency[ rating ] );	
		}
	}//end main
}// end class Studentpoolbasic