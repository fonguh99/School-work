#include<iostream>
#include<typeinfo>

using namespace std;

int rows,i,j ;
bool calculate();
int main() {
	bool res = true;
	if (res == calculate()) {
		cout<<"Well done!";
	} else {
		cout<<"please enter an integer";
	}
//	return 0;
}

bool calculate() {
	cout<<"Please enter the rows of your triangle"<<endl;
	cin>>rows;
	while (typeid (rows) == typeid(int&)) {
		for(j=0; j<rows; j++) {
			for(i=0; i<=j; ++i) {
				cout<<"*";
			}
			cout<<endl;
		}
		return true;
	} 
		//cout<<"please enter an integer";
		
	}



