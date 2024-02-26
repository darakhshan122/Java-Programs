 import java.util.Scanner;
 public class array {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        // int[] marks={12,67,55,88};
        // for(int a:marks)
        // {
        //     if(a==55)
        //    { continue;}
        //    System.out.println(a);
        // }



 
        // 2D ARRAY CONCEPT

        // 1.ARRAY (PRINTING ELEMENT OF ARRAY)

        // int [][] two_D_array={ {1,2,3},{4,6,7}};
        // for(int i=0;i<two_D_array.length;i++)
        // {
        //    for(int j=0;j<two_D_array[i].length;j++)
        //    {
        //     System.out.print(two_D_array[i][j]);
        //     System.out.print(" ");
        //    } 
        //    System.out.print("\n");
        // } 
        
        
        
        //2. PRINTING ROW REVERSE(2D ARRAY)

        // int [][] two_D_array={ {1,2,3},{4,6,7},{8,9,10},{11,12,13}};
        // for(int i=two_D_array.length-1;i>=0;i--)
        // {
        //    for(int j=0;j<two_D_array[i].length;j++)
        //    {
        //     System.out.print(two_D_array[i][j]);
        //     System.out.print(" ");
        //    } 
        //    System.out.print("\n");
        // }
        
        

// 3.PRINTING ROW AND COLUMN IN REVERSE (2D ARRAY) 
        // int [][] two_D_array={ {1,2,3},{4,6,7},{8,9,10},{11,12,13}};
        // for(int i=two_D_array.length-1;i>=0;i--)
        // {
        //    for(int j=two_D_array[i].length-1;j>=0;j--)
        //    {
        //     System.out.print(two_D_array[i][j]);
        //     System.out.print(" ");
        //    } 
        //    System.out.print("\n");
        // } 


        
        // 4.PRINTING REVERSE OF COLUMN (2D ARRAY)

        // int [][] two_D_array={ {1,2,3},{4,6,7},{8,9,10},{11,12,13}};
        // for(int i=0;i<two_D_array.length;i++)
        // {
        //    for(int j=two_D_array[i].length-1;j>=0;j--)
        //    {
        //     System.out.print(two_D_array[i][j]);
        //     System.out.print(" ");
        //    } 
        //    System.out.print("\n");
        // }
        

       // reverse of 1 d array using normal method but there is SWAPPINH METHOD TO

    //    int []a={1,4,6,9,8};
    //    for(int i=a.length-1;i>=0;i--)
    //    {
    //     System.out.println(a[i]);
    //    }





 // PRACTICE QUESTION:

// 1.calculating sum of element in 1D array and average

// int[] a={2,5,7,9,8,44,4};
// float sum=0;
// for(int x:a)
// {
    // sum =sum+x;
// }
// System.out.println("sum of element of a is :"+sum); 
 // optional // float average=(sum)/(a.length);       
// System.out.printf("avrg of element of a is :"+sum/a.length);  //sum must be in float      
        
    
 

//2.SEARCHING GIVEN ELEMENT IN ARRAY
// int[] a={2,5,7,9,8,44,4}; 
// System.out.print("enter the element to be search in the array:");
// int search_element=sc.nextInt();
/*boolean valuef=false;
for(int x:a)
{
    if(search_element==x)
    { valuef=true;
    break;}
}

if(valuef==true)
{System.out.println("the element is found ");}
else{System.out.println("element is not found");}*/

//4.ADDING ELEMENT OF TWO MATRIX 

// int[][] mat1={{1,2,3},{4,5,6}};
// int[][] mat2={{7,8,9},{10,11,12}};
// int[][] result={{0,0,0},{0,0,0}};
// System.out.print("sum of matrix is:\n");
//     for(int i=0;i<mat1.length;i++)
//     {
//         for(int j=0;j<mat1[i].length;j++)
//         {     
//             result [i][j]=mat1[i][j]+mat2[i][j];
//             System.out.print(result[i][j]+" ");
//         }
//         System.out.print("\n");
//     }
 // REVERSE OF ELEMENT IN ARRAY
//  int[] array1={2,4,6,9,88};
//  for(int i=array1.length-1;i>0;i--)
//  {
//     System.out.print(array1[i]+" ");
//  }

// int temp;
// for(int i=0;i<array1.length/2;i++)
// {
//     temp=array1[i];
//     array1[i]=array1[array1.length-i-1];
//     array1[array1.length-i-1]=temp;
// }
// for(int b:array1)
// {
//     System.out.print(b+" ");
// }




// PRINTING MAX AND MIN OF THE ELEMENT OF THE ARRRAY

// int[] array1={1,21,3,455,5,34,67,0};
// int max=0;
// int min=array1[0];
// for(int e:array1)
// {   if(e>max){
//     max=e;
// }
// if(min>e)
// {
//   min=e;
// }
//     }
//     System.out.printf("the max is : %d \n and min is :%d\n",max,min);
     
}
  }