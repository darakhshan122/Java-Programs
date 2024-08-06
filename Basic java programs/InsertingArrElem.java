import java.util.*;
public class InsertingArrElem{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int loc,item;
            System.out.print("size:");
           int size=sc.nextInt();
            int a[]=new int[size+1];
            System.out.println("enter array element: ");
            for(int i=0;i<size;i++)
            { a[i]=sc.nextInt();}
            System.out.print("\nenter the element to be inserted: ");
            item=sc.nextInt();
            System.out.print("\nenter the location at which item should be added: ");
            loc=sc.nextInt();
            //loop for inserting element at desired position
            for(int i=size;i>loc;i--)
            {   a[i]=a[i-1];}
                a[loc]=item;
                size++;
            //printing element after inserting element at desired position
            System.out.println("new array elements");
            for(int i=0;i<size;i++)
            {System.out.print(a[i]+" ");}
    }  
}