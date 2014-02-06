// Gokhan Arik
//
// Stack Implementation

public class Stack<T>{

    private StackNode<T> node;
    private StackNode<T> lastNode;
    private int nOfElements;

    public Stack(){
        node = null;  
        nOfElements = 0;
    }
    
    public void push(T data){
        if( isEmpty() ){
            node = new StackNode<T>(data);
            lastNode = node;
        }
        else{
            StackNode<T> newNode = new StackNode<T>(data);
            lastNode.setNext(newNode);
            lastNode = newNode;
        }
        nOfElements++;
    }
    
    public T top(){
        return lastNode.getData();
    }
    public T pop(){
        if( isEmpty() ){
            System.out.println("The Stack is empty");
            return null;
        }
        else{
            StackNode<T> currentNode = node;
            while(currentNode.getNext() != lastNode){
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(null);
            lastNode = currentNode;
            return lastNode.getData();
        }
    }

    public void print(){
        
        StackNode<T> currentNode = node;

        while( currentNode!= null ){
            System.out.println(currentNode.getData() + " ");
            currentNode = currentNode.getNext();
        }
        System.out.println();

    }

    public boolean isEmpty(){
        return nOfElements == 0;    
    }
}
