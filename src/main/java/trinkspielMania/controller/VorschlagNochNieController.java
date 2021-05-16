package trinkspielMania.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import trinkspielMania.DTO.VorschlagNochNieDTO;
import trinkspielMania.service.interfaces.VorschlagNochNieService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("mania")
public class VorschlagNochNieController {

	@Autowired
	private VorschlagNochNieService vNochNieService;

	@PostMapping("/addVorschlagNochNie")
	public ResponseEntity<VorschlagNochNieDTO> addVorschlagToNochNie(
			@RequestBody VorschlagNochNieDTO newVorschlagNochNie) {
		return ResponseEntity.ok(vNochNieService.addVorschlagNochNieFromDTO(newVorschlagNochNie));
	}

}
