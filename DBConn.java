
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class DBConn {
    
    //driver used
    final static String JDBC_Driver = "com.mysql.jdbc.Driver";
    // db location
    final static String DB_URL = "jdbc:mysql://localhost:3306/infodb";
    
    final static String User = "root";
    final static String Password ="";
    
    public static Connection connection(){
        
        try{
            Class.forName(JDBC_Driver);
            //get the connection
            Connection conntodb = DriverManager.getConnection(DB_URL,User,Password);
            return conntodb;
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
}
// C:\Program Files\Java\jdk\jre\lib\ext