#include<iostream>
#include"student.cpp"
using namespace std;

 int main(){
   student s1;
   s1.display();

   student s2(52);
   s2.display();

   student *s3=new student;
   s3->display();

   student s4(10,100);
   s4.display();

return 0;
}

