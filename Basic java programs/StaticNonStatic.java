class StaticNonStatic{

    int a=10;
        static int b=20;
        static void show()
        {
         System.out.println("static method access only static variablee"+b);
        }
        void dis()
        {System.out.println("non static method can access both static and non static variables"+a+" "+b);

        }
    public static void main(String[] args) 
    {
     StaticNonStatic s=new StaticNonStatic();
     s.dis();
     show();
      System.out.println(b);
      System.out.println(s.a);
    }
}
