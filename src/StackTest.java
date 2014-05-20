// Gokhan Arik
//
// Stack Implementation

public class StackTest{

    public static void main(String args[]){
       
       System.out.println("Creating new Stack");
       Stack<String> testStack = new Stack<String>();
       
       System.out.println("Adding element to Stack");
       testStack.push("Gokhan");
       testStack.print();
       testStack.push("Arik");
       testStack.print();
       testStack.push("asd");
       testStack.print();
       testStack.push("sss");
       testStack.print();
       testStack.push("as");
       testStack.print();
       testStack.push("ds");
       testStack.print();
       
       System.out.println("Popping element from the Stack");
       testStack.pop();
       testStack.print();
       testStack.pop();
       testStack.print();
       testStack.pop();
       testStack.print();
       testStack.pop();
       testStack.print();
    }
}
