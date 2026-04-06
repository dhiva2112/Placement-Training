import java.sql.*;

public class IIselction {
    public static void main(String[] args) {
        try {
            // 1. Create connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Simple9",
                "root",
                "@dhiva912352D"
            );

            // 2. Create statement
            Statement stmt = con.createStatement();

            // 3. Execute SELECT query
            ResultSet rs = stmt.executeQuery("SELECT * FROM Student3");

            // 4. Display data
            while(rs.next()) {
                int Rollno = rs.getInt("Rollno");
                String name = rs.getString("name");

                System.out.println(Rollno+ " " + name);
            }

            // 5. Close connection
            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}