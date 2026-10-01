int calPoints(char** operations, int operationsSize) {
    int stack[1001],top=-1;
    for(int i=0;i<operationsSize;i++)
    {
        char ch=operations[i][0];
        if(ch!='+'&&ch!='C'&&ch!='D')
        {
            stack[++top]=atoi(operations[i]);
        }
        else if(ch=='C')
        {
            top--;
        }
        else if (ch=='D')
        {
            int b=stack[top]*2;
            top++;
            stack[top]=b;
        }
        else
        {
            int c=stack[top]+stack[top-1];
            stack[++top]=c;
        }
    }   
    int sum=0;
    for(int i=top;i>=0;i--)sum+=stack[i];
    return sum;
}