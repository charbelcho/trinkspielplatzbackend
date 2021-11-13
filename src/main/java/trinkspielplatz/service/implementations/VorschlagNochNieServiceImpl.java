package trinkspielplatz.service.implementations;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import trinkspielplatz.DTO.VorschlagNochNieDTO;
import trinkspielplatz.dbmodel.VorschlagNochNie;
import trinkspielplatz.repository.VorschlagNochNieRepository;
import trinkspielplatz.service.interfaces.VorschlagNochNieService;

@Service
public class VorschlagNochNieServiceImpl implements VorschlagNochNieService {
	
	@Autowired
	private VorschlagNochNieRepository vNochNieRepo;

	@Override
	public List<VorschlagNochNie> findAllVorschlagNochNie() {
		return vNochNieRepo.findAll();
	}

	@Override
	public List<VorschlagNochNieDTO> findAllVorschlagNochNieAsDTO() {
		List<VorschlagNochNie> vNochNieList = findAllVorschlagNochNie();
		List<VorschlagNochNieDTO> vNochNieDTOList = new ArrayList<>();
		for (VorschlagNochNie vNochNieEntry : vNochNieList) {
			vNochNieDTOList.add(convertVorschlagNochNieToDTO(vNochNieEntry));
		}
		return vNochNieDTOList;
	}
	
	@Override
	public VorschlagNochNieDTO addVorschlagNochNieFromDTO(VorschlagNochNieDTO newVorschlagNochNieDTO) {
		VorschlagNochNie vorschlagNochNie = new VorschlagNochNie();
		vorschlagNochNie.setVorschlagNochNie(newVorschlagNochNieDTO.getVorschlagNochNie());
		vNochNieRepo.save(vorschlagNochNie);
		return convertVorschlagNochNieToDTO(vorschlagNochNie);
	}

	@Override
	public VorschlagNochNieDTO convertVorschlagNochNieToDTO(VorschlagNochNie vorschlagNochNie) {
		VorschlagNochNieDTO convertedDTO = new VorschlagNochNieDTO();
		convertedDTO.setId(vorschlagNochNie.getId());
		convertedDTO.setVorschlagNochNie(vorschlagNochNie.getVorschlagNochNie());
		return convertedDTO;
	}

	@Override
	public VorschlagNochNie convertDTOToVorschlagNochNie(VorschlagNochNieDTO vorschlagNochNieDTO) {
		VorschlagNochNie convertedVorschlagNochNie = new VorschlagNochNie();
		convertedVorschlagNochNie.setId(vorschlagNochNieDTO.getId());
		convertedVorschlagNochNie.setVorschlagNochNie(vorschlagNochNieDTO.getVorschlagNochNie());
		return convertedVorschlagNochNie;
	}

	

}
