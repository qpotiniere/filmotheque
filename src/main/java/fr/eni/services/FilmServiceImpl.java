package fr.eni.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import fr.eni.bo.Acteur;
import fr.eni.bo.Avis;
import fr.eni.bo.Film;
import fr.eni.bo.Genre;
import fr.eni.bo.Realisateur;

@Service
public class FilmServiceImpl implements FilmService {

	@Override
	public void ajouterUnFilm(Film film) {
		// TODO Auto-generated method stub

	}

	@Override
	public void ajouterUnAvis(Avis avis) {
		// TODO Auto-generated method stub

	}

	@Override
	public void detailFilm(int idFilm) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<Film> listFilm() {
		ArrayList<Film> films = new ArrayList<Film>();
		ArrayList<Acteur> acteurs = new ArrayList<Acteur>();
		acteurs.add(new Acteur("DiCaprio", "Leonardo"));
		acteurs.add(new Acteur("Winselt", "Kate"));
		
		films.add(new Film("Titanic", 2005, new Genre(1,"romantic"), new Realisateur("James", "Cameron") , "1h30 min", acteurs , "En 1997, l'épave du Titanic est l'objet d'une exploration fiévreuse"));
		return films;
	}
}
