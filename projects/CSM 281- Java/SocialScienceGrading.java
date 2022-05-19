package CodeDessy7;

import java.util.Scanner;

public class SocialScience {
public static void main(String args[]){
Scanner input = new Scanner(System.in);
String []grade=new String[15];
int [] Index = {10021007,10021107, 10021207,10021307
,10021407, 10021507,10021607 ,10021707, 10021807,10021907
,10022007, 10022107,10022207 ,10022307,10022407};
int []midSem=
{65,48,22,32,80,12,45,25,33,67,23,45,56,34,81};
int []Exam= {78,54,90,32,66,60,48,65,45,56,33,45,67,90,67};
double [] sum=new double [15];
double [] Final1=new double [15];
int []Total= new int[15];
for(int i=0; i<Index.length;i++){
//adding midsem scores to exam sxore
sum[i]= Exam[i]+midSem[i];
//finding 100% of the total score
Final1[i] =(sum[i]/200) *100;
//converting total score to integer for easy computing
Total[i]=(int)Math.round(Final1[i]);
}
for(int i=0; i<Index.length;i++){
//grading
if (Total[i] >=70)
{
grade [i]= "A";
}
else if(Total[i]>=60 && Total[i]<=69)
{
grade [i]= "B";
}
else if(Total[i]>=50 && Total[i]<=59)
{
grade [i]= "C";
}
else if(Total[i]>=40 && Total[i]<=49){
grade [i]= "D";
}
else if(Total[i]>=30 && Total[i]<=39)
{
grade[i] = "E";
}
else if(Total[i]>=0 && Total[i]<=29)
{
grade[i] = "F";
}
// displaying grade of student
}
System.out.println(" index no. final Score
grade\n");
for( int i=0; i<Exam.length;i++){
System.out.println(" "+Index[i] +"\t "+Total[i]+"\t
"+grade[i]);
}
int count1 = 0;
int count2 = 0;
int count3 = 0;
int count4 = 0;
int count5 = 0;
int count6 = 0; int min =Total[0], max = Total [0];
int Sum=0;
int Avg=0;
//frequency of grades
for(int i = 0; i < grade.length; i++ ){
if(grade[i]=="A"){
count1+=1 ;
}
else if(grade[i]=="B"){
count2 = count2 + 1;
}
else if(grade[i]=="C"){
count3 = count3 + 1;
}
else if(grade[i]=="D"){count4 = count4 + 1;
}
else if(grade[i]=="E"){
count5 = count5 + 1;
}
else{
count6= count6 + 1;
}
//finding average score
Sum+=Total[i];
Avg=Sum/Exam.length;
//finding min and max scores
if (Total[i]<min)
min=Total[i];
if(Total[i]>max)
max=Total[i];
}
System.out.println("\n\n Grade \tFrequency");
System.out.println("\n\tA\t\t" +count1);
System.out.println("\tB\t\t" +count2);
System.out.println("\tC\t\t" +count3);
System.out.println("\tD\t\t" +count4);
System.out.println("\tE\t\t" +count5);
System.out.println("\tF\t\t" +count6);
System.out.println("\n Average Score :: \t" +Avg);
System.out.println("\n Minimum Score ::\t"+min);
System.out.println("\n Maximum Score ::\t"+max);
}
}