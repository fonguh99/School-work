#include<iostream>
#include<cmath>
#include<typeinfo>
using namespace std;
int a;
int main() {
	cout<<"please enter any number"<<endl;
	cin>>a;
	while (typeid (a) == typeid(int&)) {
		if(a%5==0) {
			cout<<"yes"<<endl;
		} else
			cout<<"no"<<endl;
	return 0;}
}
