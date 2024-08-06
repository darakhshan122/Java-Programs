
import java.sql.*;
import java.util.Scanner;

public class practice {

     public static void quiz()
     {
          Scanner scanner = new Scanner(System.in);

          System.out.println("Welcome to the Quiz!");

          System.out.println("Select difficulty level:");
          System.out.println("1. Simple");
          System.out.println("2. Moderate");
          System.out.println("3. Advanced");
          System.out.print("Enter your choice from 1 to 3 to play  OR press 4 to exit from the program : ");
          int choice = scanner.nextInt();

          // int score = 0;

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
                    System.out.println(" Invalid choice....please select valid option");
                    quiz();
                    break;
          }


          scanner.close();
     }
	 
	 //SIMPLE LEVEL

     public static void simpleLevelQuiz()
     {
          Scanner scanner = new Scanner(System.in);

          int score = 0;

          System.out.println(" you have selected Simple Level Quiz:\n");
          System.out.println(" your questions are:\n");
          System.out.println("Question 1: Which one of the following is not a Java feature??");
          System.out.println("a)Object-oriented\t\tb)Portable\nc) Use of pointers\t\t\td) Dynamic and Extensible");
          System.out.println("enter your answer:\n");
          String answer1 = scanner.nextLine();
          if (answer1.equalsIgnoreCase("c"))
          {
               score++;
          }

          System.out.println("\nQuestion 2: Who invented Java Programming? ?");
          System.out.println("a)Guido van Rossum\t\tb)James Gosling\nc)Dennis Ritchie\t\t\td)none of these");
          System.out.println("enter your answer:\n");
          String answer2 = scanner.nextLine();
          if (answer2.equalsIgnoreCase("b"))
          {
               score++;
          }

          System.out.println("\nQuestion 3:  Which component is used to compile, debug and execute the java programs??");
          System.out.println("a)JVM\t\tb)JRE\nc)JIT\t\t\td)JDBC ");
          System.out.println("enter your answer:\n");
          String answer3 = scanner.nextLine();
          if (answer3.equalsIgnoreCase("a"))
          {
               score++;
          }
          System.out.println("you have completed your simple level quiz.Do you want to play another level?:if yes enter yes otherewise enter no: ");
          String s = scanner.nextLine();

          if (s.equalsIgnoreCase("yes"))
          {
               quiz();
               System.out.println("score in the simple level is: " + score);
          } else {
               System.out.println("score in the simple level is: " + score);
          }

     }
	 
	 //MODERATE LEVEL
     public static void moderateLevelQuiz() {
          Scanner scanner = new Scanner(System.in);

          int score = 0;

          System.out.println("Moderate Level Quiz:\n");
          System.out.println("you have selected moderate Level Quiz:");
          System.out.println(" your questions are:\n");
          System.out.println("Question 1:Which of the following is a superclass of every class in Java? ?");
          System.out.println("a)ArrayList\t\tb)Abstract class\nc)String\t\t\td)Object class ");
          System.out.println("enter your answer:\n");
          String answer1 = scanner.nextLine();
          if (answer1.equalsIgnoreCase("d"))
          {
               score++;
          }

          System.out.println("\nQuestion 2:Which of the below is not a Java Profiler? ?");
          System.out.println("a)JProfiler\t\tb)Eclipse Profiler\nc)JVM\t\t\td)JConsole ");
          System.out.println("enter your answer:\n");
          String answer2 = scanner.nextLine();
          if (answer2.equalsIgnoreCase("c"))
          {
               score++;
          }

          System.out.println("\nQuestion 3: What is the extension of compiled java classes?");
          System.out.println("a).txt\t\tb).js\nc).class\t\t\td).java ");
          System.out.println("enter your answer:\n");
          String answer3 = scanner.nextLine();
          if (answer3.equalsIgnoreCase("c"))
          {
               score++;
          }
          System.out.println("you have completed your moderate level quiz.Do you want to play another level:if yes enter yes otherewise enter no : ");
          String s = scanner.nextLine();

          if (s.equalsIgnoreCase("yes")) {
               quiz();
               System.out.println("score in the moderate level is: " + score);
          } else {
               System.out.println("score in the moderate level is: " + score);
          }

     }
	 
	 //ADVANCE LEVEL

     public static void advancedLevelQuiz()
     {
          Scanner scanner = new Scanner(System.in);

          int score = 0;

          System.out.println("Advanced Level Quiz:\n");
          System.out.println(" you have selected advance Level Quiz:");
          System.out.println(" your questions are:\n");
          System.out.println("Question 1:  In Java 9, which type of methods can be added to interfaces to share code between methods?");
          System.out.println("a)static\t\tb)private\nc)protected\t\t\td)none of these");
          System.out.println("enter your answer:\n");
          String answer1 = scanner.nextLine();
          if (answer1.equalsIgnoreCase("b")) {
               score++;
          }

          System.out.println("\nQuestion 2: An interface with no methods is known as?");
          System.out.println("a)Marker Interface\t\tb)Functional Interface\nc)Empty Interface\t\t\td)Abstract Interface ");
          System.out.println("enter your answer:\n");
          String answer2 = scanner.nextLine();
          if (answer2.equalsIgnoreCase("a")) {
               score++;
          }

          System.out.println("\nQuestion 3: Starting from which Java version can an interface contain method implementations? ");
          System.out.println("a)Java 5\t\tb)Java 7\nc)Java 6\t\t\td)Java 8 ");
          System.out.println("enter your answer:\n");
          String answer3 = scanner.nextLine();
          if (answer3.equalsIgnoreCase("d")) {
               score++;
          }
          System.out.print("you have completed your moderate level quiz.Do you want to play another level:if yes enter yes otherewise enter no: ");
          String s = scanner.nextLine();

          if (s.equalsIgnoreCase("yes")) {
               quiz();
               System.out.println("score in the advance level is: " + score);
          } else {
               System.out.println("score in the advance level is: " + score);
          }

     }



    //method for login
     public static void userlogin(Scanner sc,Statement stmt)throws Exception
     {  System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ___ _ _ _");
          System.out.print("please enter the user name:");
    String username = sc.nextLine(); // replace with user input
    System.out.print("please enter your password:");
    String password = sc.nextLine(); // replace with user input

    // SQL query to check if username and password exist
    String sql = "SELECT * FROM users_info WHERE uaerNAME='" + username + "' AND userPASSWORD='" + password + "'";
    ResultSet rs = stmt.executeQuery(sql);

    // Check if user exists
    if (rs.next()) {
         System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ___ _ _ _");
         System.out.println("\t\t\t**Login successfully!**\n\n\n");
         practice a = new practice();
         a.quiz();
    } else {
         System.out.println("\n\t\t\tInvalid username or password please try again\n");
         userlogin(sc,stmt); 
    }

    // Clean-up environment
    rs.close();
    return;

    }


          //method for registration
    public static void reg(Scanner sc, Statement stmt,Connection con) throws SQLException {
        //QUERY TO INSERT THE VALUUE IN EXISTING TABLE IN DATABASE
        String q="insert into users_info(uaerNAME,userPASSWORD)values(?,?)";
        //get the preparedStatement object
        PreparedStatement pstm=con.prepareStatement(q);


        System.out.println("enter the  user name:");

        String username=sc.nextLine();
        System.out.println("enter your strong password:");
        String password=sc.nextLine();

        //inserting the values
        pstm.setString(1,username);
        pstm.setString(2,password);

        pstm.executeUpdate();
        System.out.println("updated");
        System.out.println("\t\t\tnow login with ur name and password\n");
        try {
            userlogin(sc,stmt);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
	 
	 //MAIN METHOD 

    public static void main(String[] args) {

          System.out.println("\n\n\n\t\t\t\t\tWELCOME TO JAVA QUIZ");
          System.out.println("\t\t\t\t(Here the user info is store in dk database)");
          System.out.println("\n\nTo play the quiz kindly login or register \n ");
          System.out.println("1.Login\n2.register");
          System.out.print("\t\t\t\t\t\tresponse:");
         

		  // SECTION DEALING WITH DATABASE 
          try
           { // LOAD THE DRIVER
               Class.forName("com.mysql.cj.jdbc.Driver");

               // CREATE A CONNECTION
               Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dk", "root", "Dk9643");


               // Create a statemen
                Statement stmt=con.createStatement();
                Scanner sc=new Scanner(System.in);

                int choice=sc.nextInt();
                sc.nextLine();
                // Prompt user for username and password
                // You can use Scanner class for input
//              Scanner sc=new Scanner(System.in);
                
                   

                    if(1 == choice)
                {
                    userlogin(sc,stmt);    

               }


                else if(choice==2)
                {
                     
                     reg(sc,stmt,con);

                }

                else
                {

                    System.out.println("please select the correct option:");
                }

                stmt.close();
                con.close();

          }

          catch (Exception e) 
          {
               System.out.println("error");
          }


         //ENDING OF SECTION



     }
}
