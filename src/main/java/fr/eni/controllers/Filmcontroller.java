package fr.eni.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.eni.services.FilmService;

@Controller
@RequestMapping("/films")
public class Filmcontroller {
	
	private FilmService service;
	
	public Filmcontroller(FilmService service) {
		this.service = service;
	}

	@GetMapping({"/list"})
	public String films(Model model) {
	    model.addAttribute("films", service.listFilm());
	    return "films";
	}
}
