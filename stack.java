import java.util.Scanner;
public class stack
{
    int top,size,A[];
    stack(int size)
    {
        this.size=size;
        top=-1;
        A = new int[size];  
    }
    void push(int data)
    {
        if(top==size-1)
        {
            System.out.println("Stack Overflow");
            return;
        }
        else
        {
            top=top+1;
            A[top]=data;
        }
    }
    int pop()
    {
        if(top==-1)
        {
            return -999;
        }
        else{
            int data = A[top];
            top=top-1;
            return data;
        }
    }
    void popitem()
    {
        if(top==-1)
        {
            System.out.println("Stack Underflow");
            return;
        }
        else{
            int data = A[top];
            top=top-1;
            System.out.println("The popped element is:"+data);
        }
    }
    void peek()
    {
        if(top==-1)
        {
            System.out.println("Stack underflow");
            return;    
        }
        else{
            int data = A[top];
            System.out.println("Recent element is:"+data);
        }
    }
    void display()
    {
        if(top==-1)
        {
            System.out.println("Stack Underflow");
            return;
        }
        else
        {
            System.out.println("The elements in the stack are:");
            for(int i=top;i>=0;i--)
            {
                System.out.println(A[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        stack ob = new stack(size);
        while(true)
        {
            System.out.println("Enter 1 to add\nEnter 2 to remove\nEnter 3 to display\nEnter 4 to exit");
            int ch = sc.nextInt();
            if(ch==1)
            {
                System.out.println("Enter the data:");
                int data = sc.nextInt();
                ob.push(data);
            }
            else if(ch==2)
            {
                ob.popitem();
            }
            else if(ch==3)
            {
                ob.display();
            }
            else{
                break;
            }
        }
        sc.close();
    }
}