package fr.eni.services;

import fr.eni.bo.Avis;
import fr.eni.bo.Film;

public interface FilmService {
	
	void ajouterUnFilm(Film film);
	
	void ajouterUnAvis(Avis avis);
	
	void detailFilm(int idFilm);
	
	void listFilm();
}
