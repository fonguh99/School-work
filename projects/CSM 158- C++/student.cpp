 #include<iostream>
 using namespace std;
 
 class student
 {
 	int age;
 public:
 	
 ///default constructor
 student(){
 	cout<<"constructor 1 is called"<<endl;
 }
 ///parameterised constructor
  
 student(int r){
 	cout<<"constructor 2 called"<<endl;
 	rollnumber=r;
	 }	
 student(int a,int b){
 	cout<<"constructor 3 is called"<<endl;
 	age= a;
 	rollnumber= b;
 }
 int rollnumber;
  void display(){
  	cout<<age<<" "<<rollnumber<<endl;
	}
  	int getage(){
  	return age;
	  }
	void setage(int a){
	age=a;
	}
 };
