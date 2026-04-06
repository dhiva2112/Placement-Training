import java.util.Scanner;
public class user_name_pass {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String name="";
        String pass="";
        String name1="";
        String pass1="";
        boolean bol=true;
        while(bol)
        {
        System.out.println("Click 1 for Signup & 2 for login & 3 for Exit");
        int num=sc.nextInt();
        switch(num)
        {
            case 1:
                System.out.println("Enter user name:");
                name=sc.next();
                System.out.println("-------------------------------------------------------");
                System.out.println("Enter password and make sure don't forgot it: ");

                pass=sc.next();
                break;
            case 2:
                System.out.println("Enter your user name:");
               name1=sc.next();
                System.out.println("-------------------------------------------------------");
               int i=1;
               if(i<=3)
               {
            System.out.println("Enter your password:");
            pass1=sc.next();
            if(!pass1.equals(pass))
            {
                 System.out.println("You Enter wrong password");
                 i++;
                 System.out.println("You have only "+i+"attempts");
            }
            else{
                System.out.println("Login Sucessfull");
            }
               }
               else{
                System.out.println("You account has been Locked ");
               }
               break;
        case 3:
            bol=false;
            System.out.println("Thank You");
            break;
        default :
            System.out.println("You Enter  wrong number try again");
        }
        }    
    }

}