#include <iostream>
#include <string>
using namespace std;
char rad;
int a, b;
const double pi = 3.142;
char arrnum[26] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
char arrsma[26] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
char arrchar[6] = {'!', '$', '_', '?'};
int counter = 0;
int main()
{
    cout << "Enter the radius of your circle" << endl;
    cin >> rad;
    for (arrnum[0]; arrnum[25]; arrnum[0]++)
    {
        if (rad == arrnum[0])
        {
            cout << "Please enter a number" << endl;
        }
        else
        {
            cout << "The area is " << pi * rad * rad << endl;
            cout << "The perimeter is " << 2 * pi * rad << endl;
            break;
        }
    }

    for (arrsma[0]; arrsma[25]; arrsma[0]++)
    {
        if (rad == arrsma[0])
        {
            cout << "Please enter a number" << endl;
        }
        else
        {
            cout << "The area is " << pi * rad * rad << endl;
            cout << "The perimeter is " << 2 * pi * rad << endl;
        }
        break;
    }
    for (arrchar[0]; arrchar[25]; arrsma[0]++)
    {
        if (rad == arrchar[0])
        {
            cout << "Please enter a number" << endl;
        }
        else
        {
            cout << "The area is " << pi * rad * rad << endl;
            cout << "The perimeter is " << 2 * pi * rad << endl;
        }
        break;
    }
}
