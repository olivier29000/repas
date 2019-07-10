package fr.diginamic.models;

public class Plats {

	public String nom;
	public int prix;
	public int quantite;
	public String description;

	/**
	 * Constructeur
	 * 
	 * @param nom
	 * @param prix
	 * @param quantite
	 * @param description
	 */
	public Plats(String nom, int prix, int quantite, String description) {
		super();
		this.nom = nom;
		this.prix = prix;
		this.quantite = quantite;
		this.description = description;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prix
	 */
	public int getPrix() {
		return prix;
	}

	/**
	 * Setter
	 * 
	 * @param prix
	 *            the prix to set
	 */
	public void setPrix(int prix) {
		this.prix = prix;
	}

	/**
	 * @return the quantite
	 */
	public int getQuantite() {
		return quantite;
	}

	/**
	 * Setter
	 * 
	 * @param quantite
	 *            the quantite to set
	 */
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Setter
	 * 
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

}
