///Student Management System using linked list
import java.util.Scanner;
class Student_Management {
    static class Node{
        int id;
        String name;
        int age;
        String blood;
        Node next;
        Node(int id, String name, int age,String blood) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.blood=blood;
            this.next = null;
        }
    }
    Node head=null;
    public void addStudent(int id,String name,int age,String blood){
        Node newNode=new Node(id,name,age,blood);
        if (head==null){
            head=newNode;
        }
        else{
            Node temp=head;
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
        System.out.println("Student added successfully!");
    }
    public void displayStudents(){
        if(head==null){
            System.out.println("No students found.");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.println("ID: "+temp.id+", Name: "+temp.name+", Age: "+temp.age+", Blood Group: "+temp.blood);
            temp=temp.next;
        }
    }
    public void searchStudent(int id){
        Node temp=head;
        while(temp!=null){
            if(temp.id==id){
                System.out.println("Student Found:");
                System.out.println("ID: "+temp.id+", Name: " +temp.name+", Age: "+temp.age+", Blood Group: "+temp.blood);
                return;
            }
            temp=temp.next;
        }
        System.out.println("Student not found.");
    }
    public void deleteStudent(int id){
        if (head==null){
            System.out.println("List is empty.");
            return;
        }
        if (head.id==id) {
            head=head.next;
            System.out.println("Student deleted.");
            return;
        }
        Node temp=head;
        while (temp.next!=null && temp.next.id!=id){
            temp=temp.next;
        }
        if (temp.next==null){
            System.out.println("Student not found.");
        }
        else{
            temp.next=temp.next.next;
            System.out.println("Student deleted.");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Student_Management  sms=new Student_Management();
        while(true){
            System.out.println("--- Student Management System ---");
            System.out.println("1.Add Student");
            System.out.println("2.Display Students");
            System.out.println("3.Search Student");
            System.out.println("4.Delete Student");
            System.out.println("5.Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter ID: ");
                    int id=sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name=sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age=sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Blood Group: ");
                    String blood=sc.nextLine();

                    sms.addStudent(id,name,age,blood);
                    break;
                case 2:
                    sms.displayStudents();
                    break;
                case 3:
                    System.out.print("Enter ID to search: ");
                    int searchId = sc.nextInt();
                    sms.searchStudent(searchId);
                    break;
                case 4:
                    System.out.print("Enter ID to delete: ");
                    int deleteId = sc.nextInt();
                    sms.deleteStudent(deleteId);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
