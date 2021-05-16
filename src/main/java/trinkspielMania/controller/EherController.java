package trinkspielMania.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import trinkspielMania.dbmodel.Eher;
import trinkspielMania.dbmodel.VorschlagEher;
import trinkspielMania.service.interfaces.EherService;
import trinkspielMania.service.interfaces.VorschlagEherService;

@Controller
public class EherController {
	private EherService eherService;
	private VorschlagEherService vEherService;
	private List<Eher> alleEher = new ArrayList<>();
	private List<Eher> randomEher = new ArrayList<>();
	
	@Autowired
	public EherController(EherService eherService, VorschlagEherService vEherService) {
		this.eherService = eherService;
		this.vEherService = vEherService;
	}
	
	@GetMapping("/eher/{id}")
	public String getEher(ModelMap model, @PathVariable int id) {
	randomEher = eherService.randomizeEher();
	Eher eher = randomEher.get(id-2);
	model.addAttribute("eher", eher);
	return "eher";
	}
	
	@GetMapping("/addEher")
	public String addEherPage(ModelMap model) {
		alleEher = eherService.findAllEher();
		model.addAttribute("alleEher", alleEher);
		return "addEher";
	}
	
	@PostMapping("/addEher")
	public String addEher(ModelMap model, @RequestParam String vorschlagEher) {
		VorschlagEher newEher = new VorschlagEher(vorschlagEher);
		vEherService.addVorschlagEher(newEher);
		alleEher = eherService.findAllEher();
		model.addAttribute("alleEher", alleEher);
		return "addEher";
	}
}
