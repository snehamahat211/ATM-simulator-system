import java.sql.*;
import java.sql.ResultSet;

//my sql is external entities so there is a chance of error accuring
public class Conn {
    Connection c;
    Statement s;

    public Conn() {
        try{
            Class.forName(com.mysql.cj.jdbc.Driver);
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","sneha");
            s=c.createStatement();
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
