import java.sql.*;
public class IV_update {
    public static void main(String[] args) {
        try {
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/Simple9",
            "root","@dhiva912352D");
            Statement stmt = con.createStatement();
            String query = "UPDATE Student3 SET name='Kumar' WHERE Rollno=3";
            int rows = stmt.executeUpdate(query);
            System.out.println(rows + " row updated");
            con.close();
        } 
        catch(Exception e) {
            System.out.println(e);
        }
    }
}