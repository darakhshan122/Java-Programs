import java.util.Scanner;

public class quizApplication
 {
       public static void quiz()
       {
          Scanner scanner = new Scanner(System.in);
        
           System.out.println("Welcome to the Quiz!");

           System.out.println("Select difficulty level:");
           System.out.println("1. Simple");
           System.out.println("2. Moderate");
           System.out.println("3. Advanced");
           System.out.print("Enter your choice from 1 to 3 or 4 to exit from the program : ");
           int choice =scanner.nextInt();

        //    int score = 0;

           switch (choice)
            {
               case 1:
                simpleLevelQuiz();
                break;
               case 2:
                moderateLevelQuiz();
                break;
                case 3:
                advancedLevelQuiz();
                break;
                case 4:
                System.exit(1);
                default:
                System.out.println("Invalid choice....please select valid choice");
                quiz();
                break;
            }
        
        //    System.out.println("Your score is: " + score);

                        scanner.close();}
            
    

           public static void simpleLevelQuiz()
      {
          Scanner scanner = new Scanner(System.in);

           int score = 0;

           System.out.println(" you have selected Simple Level Quiz:");
           System.out.println(" your questions are:\n");
          System.out.println("Question 1: What is 2 + 2?");
          System.out.println("a)xsknck\t\tb)dvdvd\nc)dvddv\t\t\td)ddv ");
               System.out.println("enter your answer:\n");
           String answer1 = scanner.nextLine();
            if (answer1.equalsIgnoreCase("a")) {
            score++;
             }

            System.out.println("\nQuestion 2: What is 2 + 2?");
            System.out.println("a)xsknck\t\tb)dvdvd\nc)dvddv\t\t\td)ddv ");
                 System.out.println("enter your answer:\n");
           String answer2 = scanner.nextLine();
            if (answer2.equalsIgnoreCase("b")) {
            score++;
            }
           
           System.out.println("\nQuestion 3: What is 2 + 2?");
           System.out.println("a)xsknck\t\tb)dvdvd\nc)dvddv\t\t\td)ddv ");
                System.out.println("enter your answer:\n");
            String answer3 = scanner.nextLine();
            if (answer3.equalsIgnoreCase("C")) {
            score++;
            }
           System.out.println("you have completed your simple level quiz\n do you want to play another level:if yes enter yes otherewise enter no ");
         String s=scanner.nextLine();
        
         if(s.equalsIgnoreCase("yes")){quiz();
            System.out.println("score in the simple level is: "+score);}   
          else{System.out.println("score in the simple level is: "+score);}
    

          
       }
        
    
    public static void moderateLevelQuiz() 
    {
        Scanner scanner = new Scanner(System.in);

        int score = 0;

        System.out.println("Moderate Level Quiz:");
        System.out.println(" you have selected moderate Level Quiz:");
        System.out.println(" your questions are:\n");
       System.out.println("Question 1: What is 2 + 2?");
       System.out.println("a)xsknck\t\tb)dvdvd\nc)dvddv\t\t\td)ddv ");
            System.out.println("enter your answer:\n");
            String answer1 = scanner.nextLine();
            if (answer1.equalsIgnoreCase("a")) {
            score++;
             }
             
            System.out.println("\nQuestion 2: What is 2 + 2?");
            System.out.println("a)xsknck\t\tb)dvdvd\nc)dvddv\t\t\td)ddv ");
                 System.out.println("enter your answer:\n");
           String answer2 = scanner.nextLine();
            if (answer2.equalsIgnoreCase("b")) {
            score++;
            }

            System.out.println("\nQuestion 3: What is 2 + 2?");
            System.out.println("a)xsknck\t\tb)dvdvd\nc)dvddv\t\t\td)ddv ");
                 System.out.println("enter your answer:\n");
           String answer3 = scanner.nextLine();
            if (answer3.equalsIgnoreCase("c")) {
            score++;
            }
            System.out.println("you have completed your moderate level quiz\n do you want to play another level:if yes enter yes otherewise enter no ");
            String s=scanner.nextLine();
           
            if(s.equalsIgnoreCase("yes")){quiz();
               System.out.println("score in the moderate level is: "+score);}   
             else{System.out.println("score in the moderate level is: "+score);}
       
        
    }

    public static void advancedLevelQuiz() 
    {
        Scanner scanner = new Scanner(System.in);

        int score = 0;

        System.out.println("Advanced Level Quiz:");
        System.out.println(" you have selected advance Level Quiz:");
        System.out.println(" your questions are:\n");
       System.out.println("Question 1: What is 2 + 2?");
       System.out.println("a)xsknck\t\tb)dvdvd\nc)dvddv\t\t\td)ddv ");
            System.out.println("enter your answer:\n");
            String answer1 = scanner.nextLine();
            if (answer1.equalsIgnoreCase("a")) {
            score++;
             }
             
            System.out.println("\nQuestion 2: What is 2 + 2?");
            System.out.println("a)xsknck\t\tb)dvdvd\nc)dvddv\t\t\td)ddv ");
                 System.out.println("enter your answer:\n");
           String answer2 = scanner.nextLine();
            if (answer2.equalsIgnoreCase("b")) {
            score++;
            }

            System.out.println("\nQuestion 3: What is 2 + 2?");
            System.out.println("a)xsknck\t\tb)dvdvd\nc)dvddv\t\t\td)ddv ");
                 System.out.println("enter your answer:\n");
           String answer3 = scanner.nextLine();
            if (answer3.equalsIgnoreCase("c")) {
            score++;
            }
            System.out.println("you have completed your moderate level quiz\n do you want to play another level:if yes enter yes otherewise enter no ");
            String s=scanner.nextLine();
           
            if(s.equalsIgnoreCase("yes")){quiz();
               System.out.println("score in the advance level is: "+score);}   
             else{System.out.println("score in the advance level is: "+score);}
       
         
}
       

    
    public static void main(String[] args) {
        quizApplication a=new quizApplication();
        a.quiz();

}
}
