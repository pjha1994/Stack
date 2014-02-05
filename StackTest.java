public class StackTest{

    public static void main(String args[]){
       
       System.out.println("Creating new Stack");
       Stack<String> testStack = new Stack<String>();
       
       System.out.println("Adding element to Stack");
       testStack.push("Gokhan");
       testStack.print();
       testStack.push("Arik");
       testStack.print();
       System.out.println("Popping element from the Stack");
//       testStack.pop();
       testStack.print();
    }
}
