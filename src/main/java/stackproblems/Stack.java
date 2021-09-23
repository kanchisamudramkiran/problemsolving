package stackproblems;

public class Stack {
    int size;
    int top;
    int[] items;
    public  Stack(int size){
        this.size = size;
        items = new int[size];
        top = -1;
    }

    public  Boolean isEmpty(){
        return (top == -1);
    }

    public  Boolean isStackFull(){
        return  (top == size-1);
    }

    public void push(int item){
if(isStackFull()){
    System.out.println("Stack is full");
    return;
}
top = top+1;
items[top] = item;
    }

public int pop(){
    if(isEmpty()){
        System.out.println("Stack is Empty");
        return -1;
    }
    int item = items[top];
    top = top-1;
    return item;
}


    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        int item = items[top];
        return item;
    }

}
