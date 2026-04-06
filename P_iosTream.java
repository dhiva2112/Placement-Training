import java.io.File;
//import java.io.IOException;
public class P_iosTream {
    public static void main(String[] args) {
        try {
            File obj=new File("filename.txt");
            if(obj.createNewFile())
            {
             System.out.println("FileCreated:"+obj.getName());
            }
            else{
                System.out.println("File already exits");
            }
        } catch (Exception e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}