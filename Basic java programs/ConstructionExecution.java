public class ConstructionExecution {
    public static void main(String[] args) {
        C c=new C();
    }
}
class A{
    A(){
        System.out.println("u are under class A");
    }
}
class B  extends A{
    B(){
        System.out.println("u are under class B");
    }
}

class C  extends B{
    C(){
        System.out.println("u are under class C");
    }
}

