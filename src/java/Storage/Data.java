package Storage;

import java.sql.*;

public class Data {
    
    public Connection cn;
    public Statement st;
    public ResultSet rs;
    
    public Data()
    {
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","PANDYADB","111");
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
    
}
