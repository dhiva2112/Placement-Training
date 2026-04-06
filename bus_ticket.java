import java.util.Scanner;
public class bus_ticket {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,n;
        int [] arr=new int [5];
        int [] seats=new int[10];
        while(true)
        {
            System.out.println("Enter your choice");
                        System.out.println("Click 1 for Check Avaible Seats\n2 for book ticket\n3 for check booked seats\n4 for Exit");
                    num=sc.nextInt();
                    switch(num)
                    {
                        case 1:
                            System.out.println("Availble bus seats are");
                            for(int i=0;i<seats.length;i++)
                            {
                                if(seats[i]==0)
                                {
                                    System.out.println("Seat:"+(i+1));
                                }
                            }
                            break;
                            case 2:
                                System.out.println("no.of seats you want:");
                                n=sc.nextInt();
                                System.out.println("select the seats to book");
                                for(int i=0;i<n;i++)
                                {
                                   arr[i]=sc.nextInt();
                                }
                                for(int j=0;j<n;j++)
                                {
                                if(arr[j]<1 || arr[j]>seats.length)
                                {
                                    System.out.println("Invalid Tty again");
                                }
                                else if(seats[arr[j]-1]==1)
                                    {
                                    System.out.println("Seat already booked try another ");
                                }
                                else{
                                    
                                    seats[arr[j]-1]=1;
                                    System.out.println("seat booked");
                                }
                            }
                            break;
                            case 3:
                                System.out.println("Booked seats:");
                                for(int i=0;i<seats.length;i++)
                                {
                                  if(seats[i]==1)
                                  {
                                    System.out.println("Seat number:"+(i+1)+" Booked");
                                  }
                                }
                                break;
                            case 4:
                                System.out.println("Thank you");
                                return;
                                default:
                                    System.out.println("Invalid input");
                                    break;
                    }
            }
    }}