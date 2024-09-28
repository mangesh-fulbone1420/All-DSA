#include <iostream>

using namespace std;

int main(){
    int n;

    cout<<"Enter the Number :";

    cin >> n;
    bool isPrime=true;

    for (int i = 2; i * i<=n; i++)
    {
       if (n % i == 0)
       {
        isPrime=false;
        break;
       }
       
    }
    if (isPrime ==true)
    {
cout<<"Your Entered Number is Prime Number ";
    }else{
        cout<<"Your Entered Number is Not Prime Number ";
    }
    return 0;

    
}