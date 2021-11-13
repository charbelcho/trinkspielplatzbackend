package trinkspielplatz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import trinkspielplatz.DTO.NochNieDTO;
import trinkspielplatz.service.interfaces.NochNieService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("trinkspielplatz")
public class NochNieController {
	
	@Autowired
	private NochNieService nochNieService;
	
	@GetMapping("/nochNie")
	public ResponseEntity<List<NochNieDTO>> getNochNieRandom() {
		return ResponseEntity.ok(nochNieService.randomizeNochNie());
	}
	
	@GetMapping("/allNochNie")
	public ResponseEntity<List<NochNieDTO>> getAllNochNie() {
		return ResponseEntity.ok(nochNieService.findAllNochNieAsDTO());
	}
	
}
