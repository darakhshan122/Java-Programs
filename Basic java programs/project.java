import java.util.Scanner;
import java.util.Random;;
public class project {
    public static void main(String[] args) {
        A obj=new A();
        obj.display();
    }
}

class A{
        // 0 for seccor
        //1 for paper
        //2 for stone
         void  display(){
        Scanner input=new Scanner(System.in);
        System.out.println("enter your choice:\n1) 0 for sessor\n2)1 for paper\n3)2 for stone ");
        int user_choice=input.nextInt();       
        Random r=new Random();
        int computer_choice=r.nextInt(3);//here random number generate from zero to 2 i.e 0,1,2
        if(user_choice==computer_choice)
        {
            System.out.println("Draw");
        }
        else if(user_choice==0 && computer_choice==1 || user_choice==1 && computer_choice==2 || user_choice==2 && computer_choice==0)
        {
            System.out.println("you win");
        }
        else{
            System.out.println(" OOOPS!!!!COMPUTER WIN,TRY AGAIN");
        }
        
        //WHAT COMPUTER HAVE CHOICEN

        if(computer_choice==0)
        {
            System.out.println(" AS computer choice:sessor");
        }
        if(computer_choice==1)
        {
            System.out.println("as computer choice:paper");
        }
        if(computer_choice==2)
        {
            System.out.println("as computer choice:stone");
        }
    }

}
    

