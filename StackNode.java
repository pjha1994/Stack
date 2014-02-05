public class StackNode<T>{

    private T data;
    private StackNode<T> nextNode;

    public StackNode(T data){
        this.data = data;
        nextNode = null;
    }
    
    public void setNext(StackNode<T> node){
        nextNode = node;
    }
    public T getData(){
        return this.data;
    }

    public StackNode<T> getNext(){
        return nextNode;
    }
}
