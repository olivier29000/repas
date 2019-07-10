package fr.diginamic.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

import fr.diginamic.Exceptions.TechnicalException;

public class ConnexionUtils {

	private static Connection conn = null;

	static {

		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		} catch (SQLException e) {
			throw new TechnicalException("l'appel du driver a foiré mec!", e);
		}
	}

	public static Connection getInstance() throws SQLException {

		if (conn == null || conn.isClosed()) {

			ResourceBundle monFichierConf = ResourceBundle.getBundle("database");
			String user = monFichierConf.getString("database.user");
			String url = monFichierConf.getString("database.url");
			String password = monFichierConf.getString("database.password");

			conn = DriverManager.getConnection(url, user, password);
			// conn.setAutoCommit(false);

			System.out.println(conn);

		}
		return conn;
	}

	public static void fermerConnection() throws SQLException {

		if (conn != null || !conn.isClosed()) {

			conn.close();
		}

	}

}
