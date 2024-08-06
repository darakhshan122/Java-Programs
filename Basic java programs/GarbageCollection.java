public class GarbageCollection{
    public void finalize(){
        System.out.println("object is jj garbage collected");
    }

    public static void main(String[] args) {
        GarbageCollection a=new GarbageCollection();
        a=null;
        System.gc();
        
    }

}
// class A{
//     public void finalize(){
//         System.out.println("object is jj garbage collected");
//     }
// }
