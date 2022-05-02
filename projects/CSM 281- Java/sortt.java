import java.util.Scanner;
class Sortt{

	public static int plc = 5;

	public static int [][] arrayy = new int [plc][plc];

	public static void main(String[] args){
		Scanner inside = new Scanner(System.in);
		int [][] arrayy = new int [plc][plc];

		//taking in the numbers
		for (int i=0; i<plc; i++)
		{
			for (int j=0; j<plc; j++)
			{
				System.out.print("Key in the numbers to be sorted [" + i + "][" + j + "]: ");
				arrayy[i][j] = inside.nextInt();
			}
		}

		// converting the multidimensional array to one dimension
		int [] newarr = new int[26];
		int c = 0;
		for (int i=0; i<5; i++)
		{
			for (int j=0; j<5; j++)
			{
				newarr[c] = arrayy[i][j];
				c++;
			}
		}

		for(int i=0; i<25; i++)
		{
			//System.out.println("This is the array sent into 1 dimension"); 
			System.out.print(newarr[i] + " ");
		}

		//sorting the numbers
		int ver;
		for (int b=0; b<26-1; b++)
		{
			int min = b;
			for (int n=b+1;n<26; n++)
			{
				if (newarr[n] < newarr[min])
				{
					min = n;
				}
			}
			if (min != b)
			{
				ver = newarr[min];
				newarr[min] = newarr[b];
				newarr[b] = ver;
			}
		}



		// arranging it in the matrix form
		for (int i=0; i<26; i++)
		{
			//for (int j=0; j<arrayy[i].length; j++)
			//{
			System.out.print(newarr[i] + " 		");
			//}
			System.out.println();
		}



	}
}


