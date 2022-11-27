package com.progs.dbConnect;

import java.sql.Connection;
import java.sql.DriverManager;

public class standbydbConn {

	
private static Connection conn;
	
	public static Connection getConn()
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@10.0.1.122:1521:mfinprod", "mfbs_live",
					"mfbs_live");
		}
		catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
			
			return conn;
	}

}
