package newlib;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
public class database {
    private Statement stmt;
    private ResultSet rs;
    private Connection conn;
    private boolean loggedIn;
    public database(String username, String password) throws ClassNotFoundException {
        this.stmt = null;
        this.rs = null;
        this.loggedIn = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library1",username,password);
            System.out.println("Connected successfully");
            this.loggedIn = true;
        } catch (SQLException e) {
//          e.printStackTrace();
            System.out.println("Incorrect username and/or password");
        }
    }
    public ArrayList<String> selectAllBooks() throws SQLException {
        this.stmt = this.conn.createStatement();
        this.rs = this.stmt.executeQuery("SELECT * FROM book;");
        ArrayList<String> allBooks = new ArrayList<String>();
//        String[] allBooks1 = {};
        while(rs.next()) {
            System.out.println(rs.getString("b_id") +":"+ rs.getString("B_name"));
            allBooks.add(rs.getString("B_name"));
//            allBooks1.
        }
        System.out.println(allBooks);
		return allBooks;
    }
    
   public ArrayList<String> selectAllcustomer() throws SQLException{
	   this.stmt = this.conn.createStatement();
	   this.rs = this.stmt.executeQuery("SELECT * FROM issue");
	   ArrayList<String> customer = new ArrayList<String>();
	   while(rs.next()) {
		   System.out.println(rs.getString("user_name"));
		   customer.add(rs.getString("user_name"));
	   }
	   System.out.println(customer);
		return customer;
   }
   
   
    public boolean isLoggedIn() {
        return loggedIn;
    }
}