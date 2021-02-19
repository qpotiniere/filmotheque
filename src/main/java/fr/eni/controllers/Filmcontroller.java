package fr.eni.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.eni.services.FilmService;

@Controller
@RequestMapping("/films")
public class Filmcontroller {
	
	@Autowired
	private FilmService service;

	@GetMapping({"/list"})
	public String films(Model model) {
	    model.addAttribute("films", service.listFilm());
	    return "films";
	}
}
