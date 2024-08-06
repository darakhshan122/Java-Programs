import java.util.Scanner;

public class DeletionArrayElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int loc,item;
            System.out.print("size:");
           int size=sc.nextInt();
            int a[]=new int[size];
            System.out.println("enter array element: ");
            for(int i=0;i<size;i++)
            { a[i]=sc.nextInt();}
            
            System.out.print("\nenter the location which item should be deleted: ");
            loc=sc.nextInt();
            //loop for inserting element at desired position
            for(int i=loc;i<size-1;i++)
            {   a[i]=a[i+1];}
                
                size--;
            //printing element after inserting element at desired position
            System.out.println("new array elements");
            for(int i=0;i<size;i++)
            {System.out.print(a[i]+" ");}
    }
}
