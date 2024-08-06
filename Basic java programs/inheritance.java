public class inheritance {
    public static void main(String[] args) {
        // question 1 inherentance using constructor
        // circle c=new circle(4);
        // c.area();
        // c.circumference();
        // cylinder5 cy=new cylinder5(6,8);
        // cy.volume();
        // cy.surfaceArea();

        // QUESTION 2

        // rectangle r=new rectangle();
        // r.setlenght_breath(2, 6);
        // r.area();
        // r.perimeter();

        // cuboid cu=new cuboid(4);
        // cu.setlenght_breath(1, 02);
        // cu.area();
    
//ANOTHER METHOD FORE QUESTION 2

    // rectangle1 re=new rectangle1(2, 9);
    // re.area();
    // re.perimeter();
    // cuboid1 cub=new cuboid1(1, 2, 3);
    // cub.area();


//3rd way to solve question 2

// cuboid2 r2=new cuboid2();
// r2.lenght=4;
// r2.breath=6;
// r2. height=5;
// r2.area();

    }
}

// // question 1 inherentance using constructor
// class circle
// {  int radius; 

//     circle (int r){this.radius=r;
//         System.out.println("the radius is:"+radius);
//     }
//     void area(){
//         System.out.println("area of the circle is:"+3.14*radius*radius);
//     }

//     void circumference(){
//         System.out.println("circumference of the circle is:"+2*3.14*radius);
//     }
// }

// class cylinder5 extends circle{int height;
    
//  cylinder5 (int r ,int h){
//         super(r);
//         height=h;
//         System.out.println("the height of cylinder is: "+height);

//     }

//  void volume(){
//     System.out.println("volume of cylinder is :"+3.14*radius*height);
//  }

//  void surfaceArea(){
//     System.out.println("the surface area of cylinder is:"+2*3.14*radius*radius*height+2*3.14*radius*height);
//  }
// }





// QUESTION 2 CREATE RANTANGLE AS A PARENT AND CUBIOD AS A CHILD
//USING GETTER AND SETTER METHOD TO SET VALUES




// class rectangle{
//     int lenght,breath;

//     void setlenght_breath(int l,int b){
//         this.lenght=l; this.breath=b;
//     }

// void area(){
//     System.out.println("area of the reactangle is:"+lenght*breath);
// }
// void perimeter(){
//     System.out.println("perimeter of rectangle is :"+2*(lenght+breath ) );
// }
}

// class cuboid extends rectangle{int height;
//     cuboid(int h){this.height=h;}
//     void area(){ 
//         System.out.println("area of cuboid is:"+2*(lenght*breath+breath*height+height*lenght));
//     }
// }







//ANOTHER METHOD FORE QUESTION 2



// class rectangle1{
//     int lenght,breath;
//     rectangle1(int l, int b)
//     {lenght=l;breath=b;
    
//     }

// void area(){
//     System.out.println("area of the reactangle is:"+lenght*breath);
// }
// void perimeter(){
//     System.out.println("perimeter of rectangle is :"+2*(lenght+breath ) );
// }
// }

// class cuboid1 extends rectangle1{int height;
//     cuboid1(int l,int b,int h){ super(l, b);
//         this.height=h;}
//     void area(){ 
//         System.out.println("area of cuboid is:"+2*(lenght*breath+breath*height+height*lenght));
//     }
// }

//3rd way to solve question 2
// class rectangle2{
//     int lenght,breath;


// void area(){
//     System.out.println("area of the reactangle is:"+lenght*breath);
// }
// void perimeter(){
//     System.out.println("perimeter of rectangle is :"+2*(lenght+breath ) );
// }
// }

// class cuboid2 extends rectangle2{int height;
//     void area(){ 
//         System.out.println("area of cuboid is:"+2*(lenght*breath+breath*height+height*lenght));
//     }
// }



