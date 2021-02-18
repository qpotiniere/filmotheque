package fr.eni.services;

import java.util.ArrayList;

import fr.eni.bo.Avis;
import fr.eni.bo.Film;

public interface FilmService {
	
	public void ajouterUnFilm(Film film);
	
	public void ajouterUnAvis(Avis avis);
	
	public void detailFilm(int idFilm);
	
	public ArrayList<Film> listFilm();
}
