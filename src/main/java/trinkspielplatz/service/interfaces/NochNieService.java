package trinkspielplatz.service.interfaces;

import java.util.List;

import trinkspielplatz.DTO.NochNieDTO;
import trinkspielplatz.dbmodel.NochNie;

public interface NochNieService {
	List<NochNie> findAllNochNie();
	List<NochNieDTO> findAllNochNieAsDTO();
	List<NochNieDTO> randomizeNochNie();
	NochNieDTO convertNochNieToDTO(NochNie nochNie);
	NochNie convertDTOToNochNie(NochNieDTO nochNieDTO);
}
