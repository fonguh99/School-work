
import java.util.*;


public class Netpay
{


public static void main(String args[])
{


Scanner input = new Scanner(System.in);

System.out.println("how many employee do you want to input");

int n = input.nextInt();

int i;

double income = .15, health = 0.01, district = 0.03;

String []names = new String[n];

double []children = new double[n];

double []hour = new double[n];

double []grosspay = new double[n];

double []inco = new double[n];

double []heal = new double[n];

double []dist = new double[n];

double []getfund = new double[n];

double []netpay = new double[n];

for(i=0; i<n; i++)
{

	
System.out.println("please enter the name of employee");

		names[i] = input.next();

	
System.out.println("enter "+names[i]+" work hours");
		
hour[i] = input.nextInt();
		

if (hour[i]<=40)
{

grosspay[i] = hour[i] * 50;

}
else if(hour[i]>40)
{
				
grosspay[i] = 40 * 50 + (hour[i] - 40)*7.5;
			
}
			
inco[i] = grosspay[i] * income;
			
heal[i] = inco[i] * health;
			
dist[i] = heal[i] * district;
	
System.out.println("enter "+names[i]+" children number");
		
children[i] = input.nextInt();
			
if(children[i] > 3){
				
getfund[i] = (children[i] - 3)*1;
			
}
		
netpay[i] = grosspay[i] -(inco[i] + heal[i] + dist[i] + getfund[i]);	
	
}


System.out.println("Name\tHours\tChildren\tGrosspay\tincome tax\tNHIL\tdistrict tax\tGetfund\t\tNetpay");


for(i=0; i<n; i++)
{
	
System.out.println(names[i]+"\t"+hour[i]+"\t"+children[i]+"\t\t"+grosspay[i]+"\t\t"+inco[i]+"\t\t"+heal[i]+"\t"+dist[i]+"\t\t"+getfund[i]+"\t\t"+netpay[i]);	

}

}

}

