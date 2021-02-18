package fr.eni.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.eni.services.FilmService;

@Controller
@RequestMapping("/")
public class Filmcontroller {
	

	private FilmService service;
	
	public Filmcontroller(FilmService service) {
		this.service = service;
	}
	
	@RequestMapping("/films")
	public String films(Model model) {
	    model.addAttribute("films", this.service.listFilm());
	    return "films";
	}
}
