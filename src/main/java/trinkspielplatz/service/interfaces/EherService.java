package trinkspielplatz.service.interfaces;

import java.util.List;

import trinkspielplatz.DTO.EherDTO;
import trinkspielplatz.dbmodel.Eher;

public interface EherService {
	List<Eher> findAllEher();
	List<EherDTO> findAllEherAsDTO();
	List<EherDTO> randomizeEher();
	
	EherDTO convertEherToDTO(Eher eher);
	
	Eher convertDTOToEher(EherDTO eherDTO);
}
