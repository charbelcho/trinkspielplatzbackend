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

import trinkspielplatz.DTO.VorschlagEherDTO;
import trinkspielplatz.service.interfaces.VorschlagEherService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("trinkspielplatz")
public class VorschlagEherController {
	
	@Autowired
	private VorschlagEherService vEherService;
	
	@GetMapping("/allVorschlagEher")
	public ResponseEntity<List<VorschlagEherDTO>> getVorschlagEher() {
		return ResponseEntity.ok(vEherService.findAllVorschlagEherAsDTO());
	}
	
	@PostMapping("/addVorschlagEher")
	public ResponseEntity<VorschlagEherDTO> addVorschlagEher(
			@RequestBody VorschlagEherDTO newVorschlagEherDTO) {
		return ResponseEntity.ok(vEherService.addVorschlagEherFromDTO(newVorschlagEherDTO));
	}
}
