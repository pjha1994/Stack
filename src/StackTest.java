// Gokhan Arik
//
// Stack Implementation

public class StackTest{

    public static void main(String args[]){
       
       System.out.println("New Stack Created");
       System.out.println("-----------------");
       Stack<String> testStack = new Stack<String>();
       
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
       
       System.out.println("\nPopping element from the Stack");
       System.out.println("------------------------------");
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
