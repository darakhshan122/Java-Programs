public class STACK1 {
    
        private node top;
        private class node{
            private int data;
            private node next;
            public node(int data){
                this.data=data;
            }
        }
        public STACK1(){
            top= null;
        }
        public void push(int data){
            node tempnode= new node(data);
            tempnode.next=top;
            top= tempnode;
            System.out.println("the push elemnt is:"+ top.data);
        }
        public void pop(){
            if(top==null){
                System.out.println("STACK IS EMPTY");
            }
             
             System.out.println("thye pop elemnt is :" + top.data);
             top= top.next;
        }
        public int peek(){
            if(top==null){
                System.out.println("STACK IS EMPTY");
            }
            System.out.println("the elemnt at the top is:");
            return top.data;
        }
        public void displayStack(){
            node current = top;
            while(current!= null){
                System.out.println(current.data + "  ");
                current=current.next;
            }
        }
        public static void main(String[] args){
            STACK1 Stack= new STACK1();
             Stack.push(18);
             Stack.push(1);
     Stack.push(19);
     Stack.push(11);
     Stack.push(14);
    Stack.push(16);
    Stack.push(155);
        System.out.println(Stack.peek());
             Stack.pop();
             System.out.println(Stack.peek());
     Stack.pop();
    Stack.push(1);
    System.out.println(Stack.peek());
     System.out.println("after poping elemnt are :");
     Stack.displayStack();
        }
    }
    

