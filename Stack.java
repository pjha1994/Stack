public class Stack<T>{

    private StackNode<T> node;
    private int nOfElements;

    public Stack(){
        node = null;  
        nOfElements = 0;
    }
    
    public void push(T data){
        if( isEmpty() )
            node = new StackNode<T>(data);
        else{
            StackNode<T> newNode = new StackNode<T>(data);
            node.setNext(newNode);
        }
        nOfElements++;
    }

    public void print(){
        
        StackNode<T> currentNode = node;

        while( currentNode!= null ){
            System.out.println(currentNode.getData() + "\n");
            currentNode = node.getNext();
        }
    }

    public boolean isEmpty(){
        return nOfElements == 0;    
    }
}
