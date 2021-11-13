package trinkspielplatz.service.implementations;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import trinkspielplatz.DTO.VorschlagEherDTO;
import trinkspielplatz.dbmodel.VorschlagEher;
import trinkspielplatz.repository.VorschlagEherRepository;
import trinkspielplatz.service.interfaces.VorschlagEherService;

@Service
public class VorschlagEherServiceImpl implements VorschlagEherService {
	@Autowired
	private VorschlagEherRepository vEherRepo;

	@Override
	public List<VorschlagEher> findAllVorschlagEher() {
		return vEherRepo.findAll();
	}

	@Override
	public List<VorschlagEherDTO> findAllVorschlagEherAsDTO() {
		List<VorschlagEher> vEherList = findAllVorschlagEher();
		List<VorschlagEherDTO> vEherDTOList = new ArrayList<>();
		for (VorschlagEher vEherEntry : vEherList) {
			vEherDTOList.add(convertVorschlagEherToDTO(vEherEntry));
		}
		return vEherDTOList;
	}

	@Override
	public VorschlagEherDTO addVorschlagEherFromDTO(VorschlagEherDTO newVorschlagEherDTO) {
		VorschlagEher saveVorschlagEher = new VorschlagEher();
		saveVorschlagEher.setVorschlagEher(newVorschlagEherDTO.getVorschlagEher());
		vEherRepo.save(saveVorschlagEher);
		return convertVorschlagEherToDTO(saveVorschlagEher);
	}

	@Override
	public VorschlagEherDTO convertVorschlagEherToDTO(VorschlagEher vorschlagEher) {
		VorschlagEherDTO convertedVorschlagEherDTO = new VorschlagEherDTO();
		convertedVorschlagEherDTO.setId(vorschlagEher.getId());
		convertedVorschlagEherDTO.setVorschlagEher(vorschlagEher.getVorschlagEher());
		return convertedVorschlagEherDTO;
	}

	@Override
	public VorschlagEher convertDTOToVorschlagEher(VorschlagEherDTO vorschlagEherDTO) {
		VorschlagEher convertedVorschlagEher = new VorschlagEher();
		convertedVorschlagEher.setId(vorschlagEherDTO.getId());
		convertedVorschlagEher.setVorschlagEher(vorschlagEherDTO.getVorschlagEher());
		return convertedVorschlagEher;
	}

	
}
