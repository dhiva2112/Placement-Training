import java.util.*;
class Stack1 {
    int maxSize;
    int top;
    int [] stackArray;
    Stack1 (int size){
        maxSize=size;
        stackArray=new int[maxSize];
        top=-1;
    }
    void push(int value){
        if(top==maxSize-1){
            System.out.println("Stack Overflow");
        }
        else{
            stackArray[++top]=value;
            System.out.println(value+" pushed into stack");
            top--;
        }
    }
    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! Nothing to pop.");
        } 
        else {
            int removedElement = stackArray[top--]; // Get value, then decrement top
            System.out.println(removedElement + " popped from stack");
        }
    }
    void peek(){
        if(top==-1){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Top element: "+stackArray[top]);
        }
    }
    void display(){
        if(top==-1){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Stack elements:");
            for (int i = top; i >=0; i--) {
                System.out.println(stackArray[i]);
            }
        }
    }
}
public class Stack2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter stack size: ");
        int size =sc.nextInt();
        Stack1 stack=new Stack1(size);
        int choice;
        do { 
            System.out.println("\n--Stack Menu--");
            System.out.println("1.push");
            System.out.println("2.Pop");
            System.out.println("3.Peek");
            System.out.println("4.Display");
            System.out.println("5.Exit");

            System.out.println("Enter your choice: ");
            choice=sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter value: ");
                    int value=sc.nextInt();
                    stack.push(value);
                    break;

                case 2:
                    stack.pop();
                    break;

                case 3:
                    stack.peek();
                    break;

                case 4:
                    stack.display();
                    break;

                case 5:
                    System.out.println("Exiting..");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
        while(choice!=5);
    }
}
