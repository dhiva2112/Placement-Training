import java.sql.Connection;
import java.sql.DriverManager;

public class IConnection {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Simple4",
                "root","@dhiva912352D"
            );
            System.out.println("Connected Successfully!");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
