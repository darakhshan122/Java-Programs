import javax.sound.sampled.SourceDataLine;

class stack{
    private node top;
    private int size;
    private class node{
        private int data;
        private node next;
        public node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public stack(){
        top= null;
        size=0;
    }
    public void push(int data){
        node tempnode= new node(data);
        tempnode.next=top;
        top= tempnode;
        size++;
    }
    public void pop(){
        if(isEmpty()){
            System.out.println("STACK IS EMPTY");

            //throw new EmptystackException();
        }
         //int result =top.data;
         top= top.next;
         size--;
        // return result;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("STACK IS EMPTY");

            //throw new EmptystackException();
        }
        return top.data;


    }
    public void displayStack(){
        node current = top;
        while(current!= null){
            System.out.println(current.data + "  ");
            current=current.next;
        }
    }
    // public int size(){
    //     return size;
    //}
    public boolean isEmpty(){
        return size==0;
    }
    public static void main(String[] args){
        stack Stack= new stack();
        //System.out.println(Stack.size());
        // Stack.push(18);
        // Stack.push(1);

        Stack.push(19);
        Stack.push(11);
        Stack.push(14);
        Stack.push(16);
        Stack.push(155);
        //System.out.println(Stack.size());
        System.out.println(Stack.peek());
        Stack.pop();
        System.out.println(Stack.peek());
       // System.out.println(Stack.size());
Stack.pop();
//Stack.push(1);
System.out.println(Stack.peek());
System.out.println("after poping elemnt are :");
Stack.displayStack();





    }
}