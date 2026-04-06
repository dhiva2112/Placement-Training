import java.util.Scanner;
public class simple_calculator {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
          int a,b;
    while (true) { 
            System.out.println("Click 1 for Addition\n2  for Subtraction\n3 for Multiplication\n4 for Divison\n5 for Exit");

        System.out.println("Enter the choice:");
        int num=sc.nextInt();
       
        switch( num ){
            case 1:
       System.out.println("Enter the two numbers:");
        a= sc.nextInt();
        b= sc.nextInt();
                System.out.println("Sum:"+(a+b)); 
                break;
            case 2:
                 System.out.println("Enter the two numbers:");
                  a= sc.nextInt();
                 b= sc.nextInt();
                System.out.println("Subtraction:"+(a-b));
                break;
            case 3:
                 System.out.println("Enter the two numbers:");
                 a= sc.nextInt();
                 b= sc.nextInt();
                System.out.println("multiplication:"+(a*b));
                break;
            case 4:
                 System.out.println("Enter the two numbers:");
                 a= sc.nextInt();
                b= sc.nextInt();
                if(b!=0){
                    System.out.println("Divison:"+(a/b));
                }
                else{
                    System.out.println("Cannot divide by zero.");
                }
                break;
            case 5:
                return;
            default:
                System.out.println("Invalid input");
}
    }
}
}