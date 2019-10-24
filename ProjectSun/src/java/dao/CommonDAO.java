package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class CommonDAO {
	public Connection connect() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/openedu_project?user=root&password=123456");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
}
