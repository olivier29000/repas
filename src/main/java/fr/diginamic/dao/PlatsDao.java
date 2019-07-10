package fr.diginamic.dao;

import java.sql.SQLException;
import java.sql.Statement;

import fr.diginamic.Exceptions.TechnicalException;
import fr.diginamic.models.Plats;
import fr.diginamic.utils.ConnexionUtils;

public class PlatsDao {

	public void supprimerPlat(int idPlat) {

		try {

			String sql = "delete from plats where idplats=" + idPlat;

			Statement monStatement = ConnexionUtils.getInstance().createStatement();
			int nbCol = monStatement.executeUpdate(sql);
			System.out.println(nbCol + " - " + sql);

		} catch (SQLException e) {
			throw new TechnicalException("une exception est apparut", e);
		} catch (Exception e) {
			System.err.println("Error : " + e.getMessage());

		}

	}

	public void insererPlats(Plats repas) {

		try {

			String sql = "INSERT INTO plats (nom,prix,quantite,description) VALUES (\"" + repas.getNom() + "\","
					+ repas.getPrix() + "," + repas.getQuantite() + ",\"" + repas.getDescription() + "\")";

			Statement monStatement = ConnexionUtils.getInstance().createStatement();
			int nbCol = monStatement.executeUpdate(sql);
			System.out.println(nbCol + " - " + sql);

		} catch (SQLException e) {
			throw new TechnicalException("une exception est apparut", e);
		} catch (Exception e) {
			System.err.println("Error : " + e.getMessage());

		}

	}
}
