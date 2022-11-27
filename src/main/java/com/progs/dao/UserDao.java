package com.progs.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserDao {

	private Connection conn;

	public UserDao(Connection conn) {
		super();
		this.conn = conn;
		// TODO Auto-generated constructor stub
	}

	public String getUser() {
		String name = null;

		try {

			Statement stmt = conn.createStatement();

			ResultSet rs = stmt.executeQuery("select office_code from sc_users where user_code='000577'");

			while (rs.next())
				System.out.println(rs.getString(1));
			name = rs.getString(1);
			// step5 close the connection object
			conn.close();

		} catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}

		return name;

	}

	public String getUserLogin() {
		String StringValue = null;

		try {

			Statement stmt = conn.createStatement();

			ResultSet rs = stmt.executeQuery(
					"SELECT 'X' FROM sc_users a WHERE  1 = 1  AND a.user_code = '000577'  AND a.password = security_pkg.f_md5 (UPPER('nubl@123'));");

			while (rs.next())
				System.out.println(rs.getString(1));
			StringValue = rs.getString(1);
			// step5 close the connection object
			conn.close();

		} catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}

		return StringValue;

	}

	public String getUserInfo() {
		String Sql = "SELECT user_name,\r\n" + "       role_code,\r\n" + "       office_code,b.institute_name,\r\n"
				+ "       date_conversion_pkg.f_eng_to_nep_daily (f_misdate (a.office_code))\r\n"
				+ "          misdate_bs,\r\n"
				+ "       TO_CHAR (f_misdate (a.office_code), 'DD-MON-YYYY') misdate_ad\r\n"
				+ "  FROM sc_users a,ms_institute b\r\n" + " WHERE a.user_code = '000577'\r\n"
				+ " and b.institute_code=a.office_code";
		String StringValue = null;

		try {

			Statement stmt = conn.createStatement();

			ResultSet rs = stmt.executeQuery(Sql);

			while (rs.next())
				System.out.println(rs.getString(4));
			StringValue = rs.getString(4);
			// step5 close the connection object
			conn.close();

		} catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}

		return StringValue;

	}

}
