package trinkspielplatz.service.implementations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import trinkspielplatz.DTO.NochNieDTO;
import trinkspielplatz.dbmodel.NochNie;
import trinkspielplatz.repository.NochNieRepository;
import trinkspielplatz.service.interfaces.NochNieService;

@Service
public class NochNieServiceImpl implements NochNieService {
	
	@Autowired
	NochNieRepository nochNieRepo;

	@Override
	public List<NochNie> findAllNochNie() {
		return nochNieRepo.findAll();
	}
	
	@Override
	public List<NochNieDTO> findAllNochNieAsDTO() {
		List<NochNie> nochNieList = findAllNochNie();
		List<NochNieDTO> nochNieDTOList = new ArrayList<>();
		for (NochNie nochNieEntry : nochNieList) {
			nochNieDTOList.add(convertNochNieToDTO(nochNieEntry));
		}
		return nochNieDTOList;
	}

	@Override
	public List<NochNieDTO> randomizeNochNie() {
		List<NochNie> nochNieList = nochNieRepo.findAll();
		Collections.shuffle(nochNieList);
		List<NochNieDTO> nochNieDTOList = new ArrayList<>();
		for (NochNie nochNieEntry : nochNieList) {
			nochNieDTOList.add(convertNochNieToDTO(nochNieEntry));
		}
		return nochNieDTOList;
	}

	@Override
	public NochNieDTO convertNochNieToDTO(NochNie nochNie) {
		NochNieDTO convertedDTO = new NochNieDTO();
		convertedDTO.setId(nochNie.getId());
		convertedDTO.setNochNie(nochNie.getNochNie());
		return convertedDTO;
	}

	@Override
	public NochNie convertDTOToNochNie(NochNieDTO nochNieDTO) {
		NochNie convertedNochNie = new NochNie();
		convertedNochNie.setId(nochNieDTO.getId());
		convertedNochNie.setNochNie(nochNieDTO.getNochNie());
		return convertedNochNie;
	}
}
