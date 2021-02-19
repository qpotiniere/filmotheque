package fr.eni.services;

import java.util.ArrayList;
import org.springframework.stereotype.Service;
import fr.eni.bo.Avis;
import fr.eni.bo.Film;
import fr.eni.bo.Genre;
import fr.eni.bo.Participant;

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
	public Film detailFilm(int idFilm) {
		ArrayList<Participant> acteurs = new ArrayList<Participant>();
		acteurs.add(new Participant("DiCaprio", "Leonardo"));
		acteurs.add(new Participant("Winselt", "Kate"));
		Film film = new Film(0 ,"Titanic", 2005, new Genre(1,"romantic"), new Participant("James", "Cameron") , "1h30 min", acteurs , "En 1997, l'épave du Titanic est l'objet d'une exploration fièvreuse");
		return film;
	}

	@Override
	public ArrayList<Film> listFilm() {
		ArrayList<Film> films = new ArrayList<Film>();
		ArrayList<Participant> acteurs = new ArrayList<Participant>();
		acteurs.add(new Participant("DiCaprio", "Leonardo"));
		acteurs.add(new Participant("Winselt", "Kate"));
		
		films.add(new Film(0 ,"Titanic", 2005, new Genre(1,"romantic"), new Participant("James", "Cameron") , "1h30 min", acteurs , "En 1997, l'épave du Titanic est l'objet d'une exploration fièvreuse"));
		return films;
	}
}
