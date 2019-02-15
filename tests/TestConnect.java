import java.sql.*;
import java.util.*;

package tests;

public class TestConnect {

    public static void main(String[] args)
    {
        if (args.length == 0)
            {
            System.out.println("ERROR: connection URL must be provided in order to run the demo!");
            return;
            }

        String url = args[0];

        String testName = "Simple Connection";

        Connection conn = null;

        System.out.println(">>>" + testName + " test.");
        System.out.println("URL = \"" + url + "\"");

        try 
            {
	    Class.forName("com.informix.jdbc.IfxDriver");
            //Class.forName("com.cloudscape.core.JDBCDriver");
            } 
        catch (Exception e)
            {
            System.out.println("ERROR: failed to load Informix JDBC driver.");
            }

        try 
            {
            conn = DriverManager.getConnection(url);
	    System.out.println("Connected...");
            } 
        catch (SQLException e) 
            {
            System.out.println("ERROR: failed to connect!");
            }

	try
	    {
		Thread.sleep (5000);
	    }
        catch (InterruptedException i) 
            {
            System.out.println("Sleep interupted");
            }

        try 
            {
            conn.close();
            } 
        catch (SQLException e) 
            {
            System.out.println("ERROR: failed to close the connection!");
            }

        System.out.println(">>>End of " + testName + " test.");
    }
}

