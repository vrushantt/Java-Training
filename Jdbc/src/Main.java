import java.sql.*; //step 1 is to import the java.sql.* package

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String url = "jdbc:mysql://localhost:3306/asint";
        String user = "root";
        String password = "Vru@1893";
        String query = "select * from employee";

        // load and register the driver
        Class.forName("com.mysql.jdbc.Driver");
        // Create a connection
        Connection con = DriverManager.getConnection(url, user, password);

        // Create a statement
        Statement stmt = con.createStatement();

        // write a query
        ResultSet rs = stmt.executeQuery(query);

        // refine the result set
   if (rs.next()) {
       String name = rs.getString("empname");
       System.out.println(name);
   } else {
       System.out.println("No record found!");
   }

        // close the connection
        stmt.close();
        con.close();

    }
}