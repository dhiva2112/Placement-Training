import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P_Filehandle {
    static File myObj=new File("filename.txt");
    public static void main(String[] args) {
        try (Scanner myReader=new Scanner(myObj)){
            while (myReader.hasNextLine()){
                String data=myReader.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
        if(myObj.delete()){
            System.out.println("Deleted the file: "+ myObj.getName());
        }
        else{
            System.out.println("Failed to delete the file");
        }
    }
}
