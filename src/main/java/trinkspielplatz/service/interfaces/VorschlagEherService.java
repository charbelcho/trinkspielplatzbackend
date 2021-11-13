package trinkspielplatz.service.interfaces;

import java.util.List;

import trinkspielplatz.DTO.VorschlagEherDTO;
import trinkspielplatz.dbmodel.VorschlagEher;

public interface VorschlagEherService {
	List<VorschlagEher> findAllVorschlagEher();
	List<VorschlagEherDTO> findAllVorschlagEherAsDTO();
	VorschlagEherDTO addVorschlagEherFromDTO(VorschlagEherDTO newVorschlagEherDTO);
	VorschlagEherDTO convertVorschlagEherToDTO(VorschlagEher vorschlagEher);
	VorschlagEher convertDTOToVorschlagEher(VorschlagEherDTO vorschlagEherDTO);
}
