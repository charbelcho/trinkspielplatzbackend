package trinkspielMania.service.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import trinkspielMania.DTO.VorschlagNochNieDTO;
import trinkspielMania.dbmodel.VorschlagNochNie;
import trinkspielMania.repository.VorschlagNochNieRepository;
import trinkspielMania.service.interfaces.VorschlagNochNieService;

@Service
public class VorschlagNochNieServiceImpl implements VorschlagNochNieService {
	
	@Autowired
	private VorschlagNochNieRepository vNochNieRepo;

	@Override
	public VorschlagNochNieDTO addVorschlagNochNieFromDTO(VorschlagNochNieDTO newVorschlagNochNie) {
		VorschlagNochNie vorschlagNochNie = new VorschlagNochNie();
		vorschlagNochNie.setVorschlagNochNie(newVorschlagNochNie.getVorschlagNochNie());
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
