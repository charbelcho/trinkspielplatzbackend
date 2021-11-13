package trinkspielplatz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import trinkspielplatz.DTO.EherDTO;
import trinkspielplatz.service.interfaces.EherService;
import trinkspielplatz.service.interfaces.VorschlagEherService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("trinkspielplatz")
public class EherController {
	
	@Autowired
	EherService eherService;
	
	@Autowired
	VorschlagEherService vEherService;
	
	@GetMapping("/eher")
	public ResponseEntity<List<EherDTO>> getEherRandom() {
		return ResponseEntity.ok(eherService.randomizeEher());
	}
	
	@GetMapping("/allEher")
	public ResponseEntity<List<EherDTO>> getAllEher() {
		return ResponseEntity.ok(eherService.findAllEherAsDTO());
	}
	

}
