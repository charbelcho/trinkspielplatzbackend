package trinkspielMania.service.interfaces;

import java.util.List;

import trinkspielMania.DTO.NochNieDTO;
import trinkspielMania.dbmodel.NochNie;

public interface NochNieService {
	List<NochNie> findAllNochNie();
	List<NochNieDTO> findAllNochNieAsDTO();
	List<NochNieDTO> randomizeNochNie();
	List<NochNieDTO> findBySearch(String nochNie);
	
	NochNieDTO convertNochNieToDTO(NochNie nochNie);
	
	NochNie convertDTOToNochNie(NochNieDTO nochNieDTO);
}
