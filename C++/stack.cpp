#include <iostream>

using namespace std;

struct stack
{
    int data;
    struct stack* next;
    struct stack* prev;

};
struct stack* head;
struct stack* one;
struct stack* two;

one -> data=10;
two -> data=20;
three -> data=30;
four -> data=40;
five -> data=50;

head=one;
one -> next =two;
one -> prev =NULL;
two -> next =three;
two -> prev =one;
three -> next =four;
three -> prev =two;
four -> next =five;
four -> prev =three;
five -> next =NULL;
five -> prev =four;

int main(){

    cout<<data;

    return 0;
    
}
