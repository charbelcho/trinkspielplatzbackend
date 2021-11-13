package trinkspielplatz.service.interfaces;

import java.util.List;

import trinkspielplatz.DTO.VorschlagNochNieDTO;
import trinkspielplatz.dbmodel.VorschlagNochNie;

public interface VorschlagNochNieService {
	List<VorschlagNochNie> findAllVorschlagNochNie();
	List<VorschlagNochNieDTO> findAllVorschlagNochNieAsDTO();
	VorschlagNochNieDTO addVorschlagNochNieFromDTO(VorschlagNochNieDTO newVorschlagNochNieDTO);
	VorschlagNochNieDTO convertVorschlagNochNieToDTO(VorschlagNochNie vorschlagNochNie);
	VorschlagNochNie convertDTOToVorschlagNochNie(VorschlagNochNieDTO vorschlagNochNieDTO);
}
