import java.util.Scanner;

public class Deduce
{
	public static void main(String args[])
	{
		Scanner frec = new Scanner (System.in);
		
		int marks= frec.nextInt();
		
		/*System.out.println("Enter your mark");
		int exam;//= frec.nextInt();
		
		System.out.println("Enter your assessment score");
		int assessment= frec.nextInt();
		marks = (int) (exam + assessment);*/
		int score;
		int exam;
		int assessment;
		
		System.out.println("Enter your exam score");
		exam = frec.nextInt();
		
		System.out.println("Enter your assessment");
		assessment = frec.nextInt();
		
		score = (int) (exam + assessment);
		
		
		
		
		
		if ((marks>=80) && (marks<100))
		{
			System.out.println("You have an A");
		}
		if ((marks<=79) && (marks>=70))
		{
			System.out.println("You have a B");
		}
		if ((marks<=69) && (marks>=60))
		{
			System.out.println("You have a C");
		}
		if ((marks<=59) && (marks>=50))
		{
			System.out.println("You have a D");
		}
		if ((marks<=49) && (marks>=40))
		{
			System.out.println("You have an E");
		}
		if ((marks<=39) && (marks==39))
		{
			System.out.println("You have an F");
		}
	}
}