import java.util.Scanner;
public class studentmarks{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter student name: ");
        String name=sc.nextLine();
        
        int [] marks= new int[3];
        String [] subjects={"Sub 1","Sub 2","Sub 3"};
        
        for(int i=0;i<3;i++){
            System.out.println("enter mark of "+subjects[i]+" (out of 100): ");
            marks[i]=sc.nextInt();
        }
        int total=0;
        for (int i=0;i<3;i++){
            total=total+marks[i];
        }
        double average=total/3.0;
        String grade;
        boolean hasFail = false; 
        for (int i = 0; i < 3; i++) {
            if (marks[i] < 45) {
                hasFail = true;
                break;
            }
        } 
        if (hasFail) {
            grade = "F (Fail)";
        } else if (average >= 95) {
            grade = "S";
        } else if (average >= 85) {
            grade = "A";
        } else if (average >= 75) {
            grade = "B";
        } else if (average >= 65) {
            grade = "C";
        } else if (average >= 55) {
            grade = "D";
        } else if (average >= 45){
            grade = "E";
        }else{
            grade = "F (Fail)";
        }
        System.out.println("");
        System.out.println("Student Name: "+name);
        System.out.println("");
        for(int i=0;i<3;i++){
            System.out.println(subjects[i] + "   : " + marks[i]);
        }
        System.out.println("");
        System.out.println("Total   : " + total + " / 300");
        System.out.println("");
        System.out.println("Average : " + String.format("%.2f", average) + "%");
        System.out.println("");
        System.out.println("Grade   : " + grade);
    }
}