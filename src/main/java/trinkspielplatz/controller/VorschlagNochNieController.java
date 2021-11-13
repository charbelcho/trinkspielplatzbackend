package trinkspielplatz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import trinkspielplatz.DTO.VorschlagNochNieDTO;
import trinkspielplatz.service.interfaces.VorschlagNochNieService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("trinkspielplatz")
public class VorschlagNochNieController {

	@Autowired
	private VorschlagNochNieService vNochNieService;
	
	@GetMapping("/allVorschlagNochNie")
	public ResponseEntity<List<VorschlagNochNieDTO>> getVorschlagNochNie() {
		return ResponseEntity.ok(vNochNieService.findAllVorschlagNochNieAsDTO());
	}
	
	@PostMapping("/addVorschlagNochNie")
	public ResponseEntity<VorschlagNochNieDTO> addVorschlagToNochNie(
			@RequestBody VorschlagNochNieDTO newVorschlagNochNieDTO) {
		return ResponseEntity.ok(vNochNieService.addVorschlagNochNieFromDTO(newVorschlagNochNieDTO));
	}

}
