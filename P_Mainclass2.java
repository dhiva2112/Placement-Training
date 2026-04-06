import java.io.BufferedWriter;
import java.io.FileWriter;
public class P_Mainclass2 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("output.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Hey Man");
            bw.newLine();
            bw.write("Okay");
            bw.close(); 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}