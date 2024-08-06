import java.util.Scanner;
public class practice1 {
    public static void main(String[] args) {

        // checking whether the double or triple space is present in the string or not
        
        // String name=" harry is a good  coder  ";
        // int double1=name.indexOf("  ");
        // int triple1=name.indexOf("   ");
        // if(double1==-1)
        // {
        //     System.out.println("double quotes is  not present");
        // }
        // else{
        //     System.out.println("double quotes is   present");
        // }
        // if(triple1==-1)
        // {
        //     System.out.println("triple qoutes is not present");
        // }
        // else{
        //     System.out.println("triple qoutes is  present");
        // }





        //taking string as a name from iser and relace of the user with our name

        Scanner sc= new Scanner( System.in);
        // System.out.println("enter your namre");
        // String name1=sc.nextLine();
        // System.out.println("your name is :"+name1);
        // String REPLACE=name1.replace(name1, "shadman");
        // System.out.println("DEAR"+name1+" THANX A LOT \n  now your replace name is :"+REPLACE);
         





        // CHECKING WHETHER THE INPUT GIVEN BY USER IS A LEAP YEAR OR NOT
        
        //    System.out.print("ENTER THE YEAR :");
        //    int year=sc.nextInt();
        //    System.out.printf("your enter number is : %d\n",year);
        //    if(year%4==0 && year%100!=0 || year%400==0) 
        //    {
        //     System.out.printf("your enter number  is a leap year \n"+year);
        //    }
        //    else {
        //     System.out.printf("your entered number %d is not a leap year",year);
        //    }






           // PRINTING FIRST STARTING  ODD NUMBER SELECTED BY USER
        
           //    System.out.print("ENTER THE NUMBER UPTO WHICHG YOU WANT A ODD NUMBER:");
        //    byte a=sc.nextByte();
        //    System.out.println("your enter number is :"+a);
        //    for(int i=1;i!=a;i++)
        //    {
        //     System.out.print(2*i+1+", ");
        //    }






           //PRINTING EVEN NUMBER COMES WITH IN A NUMBER GIVEN BY USER 

        //    System.out.print(" \n ENTER THE NUMBER within WHICH YOU WANT  AN EVEN NUMBER:");
        //    byte b=sc.nextByte();
        //    System.out.println("your enter number is :"+b); 
        //    for(int i=1;i<=b;i++)
        //    {
            
        //     if(i%2==0)
        //     {
        //         System.out.print("your even number is: ");
        //         System.out.print(i + ", ");
        //     }






        //    // break keyword

           System.out.print("ENTER THE NUMBER UPTO WHICHG YOU WANT A ODD NUMBER:");
           byte c=sc.nextByte();
           System.out.println("your enter number is :"+c);
           for(int i=0;i!=c;i++)
           {
            
           if (i==2)
           { System.out.println("you are exit from loop due to break keyword");
              break;  }
        System.out.print(2*i+1+", ");
           }




//CONTINUE KEYWORD
// System.out.print("ENTER THE NUMBER UPTO WHICHG YOU WANT A ODD NUMBER:");
// byte d=sc.nextByte();
// System.out.println("your enter number is :"+d);
// for(int i=0;i!=d;i++)
// {
// if (i==2)
// { System.out.println("\n skip value from loop due to continue keyword");
//    continue;  }
//    System.out.print(2*i+1+", ");
// }  


    



// PRACTICE QUESTION

// int x=4;
// for(int i=1;i<=x;i++)
// {
  
//    for(int j=4;j>=i; j--)
//    { System.out.print("*"+" ");}
//    System.out.print("\n");
// }




// w.a.p to sum first even number using for loop and while loop

// int even=4;
// int i=0;
// int sum=0;
// while(i<even) 
// {
//    sum =sum+(2*i);
//    i++;
// } 
// System.out.print("sum of even number is:"+sum);   





// w. a .p to prinnt a table

// int table=sc.nextInt();
// int mul;
// for(int i=1;i<=10;i++ )
// { mul=i*table;
//    System.out.printf("%d * %d = %d \n",table,i,mul);//System.out.printf("%d * %d =",table,i);System.out.print(mul+"\n");
                                                        
// }





// SUM OF TABLES
// int table=sc.nextInt();
// int sum1=0;
// for(int i=1;i<=10;i++ )
// { sum1 +=i*table;   }
// System.out.println("SUM OF TABLE:"+sum1);




// TABLE IN REVERSE ORDER
// int table1=sc.nextInt();
// int mul1;
// for(int i=10;i>=1;i--)
// { mul1=i*table1;
//    System.out.printf("%d * %d = %d \n",table1,i,mul1);
// }




// factorial
// int factorial=sc.nextInt();
// int i=1,fact=1;
// while(i<=factorial)
// {
// fact=fact*i;
// i++;
// }
// System.out.println("factorial of given number is:"+fact);



    }
    
}
