package fr.diginamic.controllers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import fr.diginamic.dao.PlatsDao;
import fr.diginamic.models.Plats;
import fr.diginamic.utils.ConnexionUtils;

public abstract class ControllerPlats {

	public static void insererPlats(Plats plats) {

		PlatsDao platsDao = new PlatsDao();
		platsDao.insererPlats(plats);
	}

	public static void supprimerPlat(int idPlat) {

		PlatsDao platsDao = new PlatsDao();
		platsDao.supprimerPlat(idPlat);

	}

	public static List<Plats> listerPlats() {

		Statement stmt;
		try {
			stmt = ConnexionUtils.getInstance().createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM plats");

			while (rs.next()) {
				System.out.println(rs.getInt("idplats") + " - " + rs.getString("nom"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;

	}

}
