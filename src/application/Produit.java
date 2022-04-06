package application;

public class Produit {

	private String nom;
	private double prix;
	@Override
	public String toString() {
		return "Produit [nom=" + nom + ", prix=" + prix + ", qte=" + qte + ", pays=" + pays + ", date=" + date
				+ ", remarque=" + remarque + "]";
	}

	private int qte;
	private String pays;
	private String date;
	private String remarque;
	
	public Produit(String nom, double prix, int qte, String pays, String date, String remarque) {
		this.nom = nom;
		this.prix = prix;
		this.qte = qte;
		this.pays = pays;
		this.date = date;
		this.remarque = remarque;
	}
}
