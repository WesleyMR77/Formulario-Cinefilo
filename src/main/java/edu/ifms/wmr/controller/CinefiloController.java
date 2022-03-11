package edu.ifms.wmr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.ifms.wmr.model.Cinefilo;

@Controller
public class CinefiloController {
	
	@GetMapping("/")
	public String exibeFormulario(Model model) {
		model.addAttribute("cinefilo", new Cinefilo() );
		return "cinefiloform";
	}
	
	@GetMapping("/dados")
	public String exibeDados(@ModelAttribute Cinefilo cinefilo) {
		return "cinefilodados";
	}

}
