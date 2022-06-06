package brief5;

public class Candidats {
	private int id;
	private String nom;
	private String prenom;
	private String mail;
	private String adresse;
	private String ville;
	private String pays;
	
	public Candidats(String nom , String prenom , String mail , String adresse , String ville , String pays) {
		this.nom=nom;
		this.prenom=prenom;
		this.mail=mail;
		this.adresse=adresse;
		this.ville=ville;
		this.pays=pays;
	}
	
	public Candidats() {}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom=nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom=prenom;
	}
	
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail=mail;
	}
	
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse=adresse;
	}
	
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville=ville;
	}
	
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays=pays;
	}

	@Override
	public String toString() {
		return "Candidats [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", mail=" + mail + ", adresse=" + adresse
				+ ", ville=" + ville + ", pays=" + pays + "]";
	}

}
