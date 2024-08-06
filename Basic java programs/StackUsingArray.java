public class StackUsingArray
 {
    int n=10,top=-1;
    int[]stack=new int[n];
    void push(int x)
    {
        if (top==n-1)
        {
            System.out.println("overflow");
        }
        else{
            top++;
            stack[top]=x;

        }
    }
    void pop()
    {
        int item;
        if(top==-1)
        {
            System.out.println("UNDERFLOW");
        }
        else{
            item=stack[top];
            top--;
            System.out.println("the pop item is:"+item);
        }
    }
        void display()
        {
            if(top==-1)
            {
                System.out.println("underflow");
            }
            else{
                System.out.println("the elements of stack are:");
                for(int i=top;i>0;i--)
                {
                    System.out.println(stack[i]);
                }
            }
        }
            public static void main(String[] args) {
                StackUsingArray s=new StackUsingArray();
                s.push(59);
                s.push(79);
                s.push(10);
                s.display();
                s.pop();
                s.display();
                
            }
        
    }
