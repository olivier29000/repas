package fr.diginamic.repas_bdd;

import java.sql.SQLException;
import java.util.Scanner;

import fr.diginamic.controllers.ControllerPlats;
import fr.diginamic.models.Plats;
import fr.diginamic.utils.ConnexionUtils;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws SQLException

	{
		while (true) {

			Scanner sc = new Scanner(System.in);
			System.out.println("Que voulez vous faire ? ");
			System.out.println("1 : lister les plats");
			System.out.println("2 : ajouter un plats");
			System.out.println("3 : supprimer un plats");
			String str = sc.nextLine();
			System.out.println("Vous avez saisi : " + str);

			if (str.equals("1")) {
				ControllerPlats.listerPlats();
				ConnexionUtils.fermerConnection();
			} else if (str.equals("2")) {
				System.out.println("Nom du plat");
				String nomPlat = sc.nextLine();
				System.out.println("Prix du plat");
				String prixPlat = sc.nextLine();
				System.out.println("Quantite du plat");
				String quantitePlat = sc.nextLine();
				System.out.println("Description du plat");
				String descriptionPlat = sc.nextLine();
				Plats plat1 = new Plats(nomPlat, Integer.parseInt(prixPlat), Integer.parseInt(quantitePlat),
						descriptionPlat);
				ControllerPlats.insererPlats(plat1);
				ConnexionUtils.fermerConnection();
			} else if (str.equals("3")) {
				ControllerPlats.listerPlats();
				System.out.println("Quel plat voulez vous supprimer?");
				String platASupprimer = sc.nextLine();
				ControllerPlats.supprimerPlat(Integer.parseInt(platASupprimer));
				ConnexionUtils.fermerConnection();
			}

		}
	}
}
