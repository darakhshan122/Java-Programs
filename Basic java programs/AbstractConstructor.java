public class AbstractConstructor {
    public static void main(String[] args) {
        // animal m=new dog();
        dog g=new dog();
        System.out.println("\n\n");
        // animal m1=new dog(2);
         dog g1=new dog(3); 
         System.out.println("\n\n");
        g.sound();
        System.out.println("\n\n");
        g1.sound();
        System.out.println("\n\n");
        // animal m3=new cat();
        // cat c=new cat();
        animal m4=new cat(4);
        System.out.println("\n\n");
        // cat c1=new cat(4);
        m4.sound();
        // c1.sound();
       


        
    }
    
}
abstract class animal{
    animal(){
        super();
        System.out.println("u r under default constructor abstract class");
    }
    animal(int i){
        System.out.println("u r under parametrized constructor of abstract class ");
    }
    public abstract void sound();
}
class dog extends animal{
    dog(){

    }
    dog(int i){
        // super(i);
        System.out.println("u r under paramatrizes constructor of dog class");
    }
    public void sound(){
        System.out.println("barking");
    }
}
class cat extends animal{
    cat(int i){
        super(i);
        System.out.println("paramaterized constructor of cat class using super keyword");
    }
    public void sound(){
        System.out.println("mew meowwww!!!!!!");
    }
}