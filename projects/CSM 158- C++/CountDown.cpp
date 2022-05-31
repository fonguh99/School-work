#include <iostream>
using namespace std;

int main()
{
    int n;
    cin >> n;

    // your code goes here
    int i;
    for (i = n; i >= 1; i--)
    {
        cout << i << endl;
        if (i % 5 == 0)
        {
            cout << "Beep" << endl;
        }
    }
    return 0;
}
