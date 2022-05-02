#include<iostream>
using namespace std;

int i,j,rows;

int main() {
	cout<<"Please enter the number of rows"<<endl;
	cin>>rows;
	for(i<rows; i=0; i--) {
		for(j=0; j<i; ++j) {
			cout<<"*";
		}
		cout<<endl;
	}
	return 0;
}

