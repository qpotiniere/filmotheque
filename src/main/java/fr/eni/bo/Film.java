package fr.eni.bo;

import java.util.List;

public class Film {

	private int id;
	private String titre;
	private int annee;
	

	private Genre genre;
	private Realisateur real;
	private String duree;
	private List<Acteur> acteurs;
	
	private String synopsis;
	
	
	
	public Film() {

	}

	public Film(String titre, int annee, Genre genre, Realisateur real, String duree, List<Acteur> acteurs, String synopsis) {
		this.titre = titre;
		this.annee = annee;
		this.genre = genre;
		this.real = real;
		this.duree = duree;
		this.acteurs = acteurs;
		this.synopsis = synopsis;
	}
	
	public Film(int id, String titre, int annee, Genre genre, Realisateur real, String duree, List<Acteur> acteurs,
			boolean vu, String synopsis) {
		this.id = id;
		this.titre = titre;
		this.annee = annee;
		this.genre = genre;
		this.real = real;
		this.duree = duree;
		this.acteurs = acteurs;
		this.synopsis = synopsis;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTitre() {
		return titre;
	}
	
	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	public int getAnnee() {
		return annee;
	}
	
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	
	public Genre getStyle() {
		return genre;
	}
	
	public void setStyle(Genre genre) {
		this.genre = genre;
	}
	
	public Realisateur getReal() {
		return real;
	}
	
	public void setReal(Realisateur real) {
		this.real = real;
	}
	
	public String getDuree() {
		return duree;
	}
	
	public void setDuree(String duree) {
		this.duree = duree;
	}
	
	public List<Acteur> getActeurs() {
		return acteurs;
	}
	
	public void setActeurs(List<Acteur> acteurs) {
		this.acteurs = acteurs;
	}
	
	public String getSynopsis() {
		return synopsis;
	}
	
	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}



	@Override
	public String toString() {
		return "Film [id=" + id + ", titre=" + titre + ", annee=" + annee + ", genre=" + genre + ", real=" + real
				+ ", duree=" + duree + ", acteurs=" + acteurs + ", synopsis=" + synopsis + "]";
	}

	
	
}
