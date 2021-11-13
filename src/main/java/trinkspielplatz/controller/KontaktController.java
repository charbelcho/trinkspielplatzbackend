package trinkspielplatz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import trinkspielplatz.dbmodel.Kontakt;
import trinkspielplatz.service.interfaces.KontaktService;

@Controller
public class KontaktController {
	private KontaktService kontaktService;
	
	
	@Autowired
	public KontaktController(KontaktService kontaktService) {
		this.kontaktService = kontaktService;
	}
	
	@GetMapping("/kontakt")
	public String kontaktPage() {
		return "kontakt";
	}
	
	@PostMapping("/kontakt")
	public String addKontaktStart(@RequestParam String email, @RequestParam String nachricht) {
		Kontakt kontakt = new Kontakt(email, nachricht);
		kontaktService.addNachricht(kontakt);
		return "kontakt";
	}
	
}
