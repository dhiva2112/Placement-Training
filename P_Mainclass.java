import java.io.FileWriter;
public class P_Mainclass {
    public static void main(String[] args)
    {
        try{
            FileWriter fw=new FileWriter("Output.txt",false);
            fw.append("Mannn");
            fw.close();
            System.out.println("Sucess");
        }
        catch(Exception e)
        {
            System.out.println("Something has happened");
        }
    }
}