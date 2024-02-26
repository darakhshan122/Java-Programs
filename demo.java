import java.util.Scanner;
public class array{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in)
        int[] marks ={54,67,88,72}
        for(int a:marks)
        {
            if(a==67)
            {
                continue;
            }
            System.out.println(a);
        } 
    }

}