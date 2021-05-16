package trinkspielMania.service.interfaces;

import trinkspielMania.DTO.VorschlagNochNieDTO;
import trinkspielMania.dbmodel.VorschlagNochNie;

public interface VorschlagNochNieService {
	VorschlagNochNieDTO addVorschlagNochNieFromDTO(VorschlagNochNieDTO newVorschlagNochNie);
	
	VorschlagNochNieDTO convertVorschlagNochNieToDTO(VorschlagNochNie vorschlagNochNie);
	
	VorschlagNochNie convertDTOToVorschlagNochNie(VorschlagNochNieDTO vorschlagNochNieDTO);
}
