public class opps {
    public static void main(String[] args) {

        // employee class
        //  employee harry=new employee();
        //  employee john=new employee();
        //  harry.name="harry";
        // harry.id=9;
        // harry.salary=456;
        // john.name="john";
        // john.id=90;
        // john.salary=5657;
       
        
        // harry.printDetail();
        // john.printDetail();
        // harry.get_salary();
        // john.get_salary();


        //SQAUARE CLASS

        // square sq=new square();
        // sq.side=4;
        // sq.area();
        // sq.perimeter();


        // //RECTANGLE CLASS
        //  rectangle rec=new rectangle();
        //  rec.area(4, 03);
        //  rec.perimeter(4, 03);
        

        // CLASS WITHout PRIVATE VARIABLE
         employee e=new employee();
         e.id=7;
         e.display();

         employee em=new employee();
        em.id=4;
        em.display();
        
        // CLASS WITH PRIVATE VARIABLE
        // employee2 e2=new employee2();
        // e2.display(3);
        
        

        // PRACTICE QUESTION 

        // 1

        // cylinder c=new cylinder();
        // c.display(5, 7);

        //  same question using getter and setter method

        // cylinder1 c1=new cylinder1();
        // c1.setHeight(12);
        // System.out.println(c1.getHeight()); //compulsory to use system.out.print here because of int data type method
        // c1.setRadius(9);
        // System.out.println(c1.getRadius());
        
//2ND QUESTION
// cylinder2 c2=new cylinder2();
// c2.setHeight(12);
// System.out.println(c2.getHeight()); //compulsory to use system.out.print here because of int data type method
// c2.setRadius(9);
// System.out.println(c2.getRadius());//using s.o.p bcz of int data type method
// System.out.println(c2.area());//using s.o.p bcz of double data type method
// c2.volume();

//3RD QUESTION
// cylinder3 c3=new cylinder3(4, 8);

//4TH QUESTION

//5TH QUESTION
          }
    
}

// customize classes 

//1. employee class
// class employee{
//     int id,salary;
//     String name;
//     public void  printDetail()
//     {
//         System.out.println("the name of employee is:"+name);
//         System.out.println("the id of employee is:"+id);
//     }
//     public void  get_salary()
//     { 
//        System.out.println("the salary is:"+salary);
//     }
// }

//2.sqare class

// class square{
//     int side;
//     public void area()
//     {
//         System.out.println("the area of square is:" +side*side);
//     }
//     public void perimeter()
//     {
//         System.out.println("the perimeter of square is:" +4*side);
//     }

// }

//3.rectangle class

// class rectangle
// {
    
//      void area(int l ,int b)
//       {
//         System.out.println(" the area of rectangle is:"+l*b);
//       }
//      void perimeter( int l,int b)
//       {
//         System.out.println("the perimeter of the rectangle is :"+2*(l+b));
//       }
// }






// CLASS WITHOUT PRIVATE VARIABLE

class employee{
     int id;
     
    public void  display(){
        
        System.out.println("the id of the employee is:"+ id);;
    }
}




//  CLASS WITH PRIVATE VARIABLE

// class employee2{
//         private int id;
       
       
//         public void  display(int i){
//             id=i;
//             System.out.println("the id of the employee is:"+ id);;
//         }
//     }












//practice QUESTION CHAPTER 9

// 1)

// class cylinder{
//     private int height ,radius;
//     public void display(int h,int r){
//          height=h; //this.height=h; this can be also used here
//         radius=r;//this.radius=r; this can be also used here
//         System.out.println(" the height and the radius pf the cylinder is:"+height+ " "+ radius);
//     }
// }

// ABOVE QUESTION SOLVING SET AND GET METHOD

// class cylinder1{
//     private int height ,radius;
//     public void setHeight(int i){
//         height=i;
//     }
//     public int getHeight(){
//         return height;

//     }
//     public void setRadius(int i){
//         radius=i;
//     }
//     public int getRadius(){
//         return radius;
//     }
// }




// 2nd question finding area and volume of cylinder using getter and setter

// class cylinder2{
//     private int height ,radius;
//     public void setHeight(int i){
//         height=i;
//     }
//     public int getHeight(){
//         return height;

//     }
//     public void setRadius(int i){
//         radius=i;
//     }
//     public int getRadius(){
//         return radius;
//     }

//     public double  area(){
//         System.out.print("the area of the cylinder is:");
            
//          return 2* 3.14* radius*  height +  2* 3.14* radius* radius;
//     }

//     public void volume()
//     {
//         double a=3.14* radius* radius* height;
//         System.out.println("the volume of cylinder is:"+a);
//     }
// }







//3RD QUESTION DUING QUESTION 1 WITH CONSTRUCTION

// class cylinder3{
//     private int height,radius;
//     cylinder3(int h,int r)
//     { height=h;
//         radius=r;
//         System.out.println("height of the cylinder is :"+height+"\n the radius of the cylinder is:"+radius);

//     }
// }
