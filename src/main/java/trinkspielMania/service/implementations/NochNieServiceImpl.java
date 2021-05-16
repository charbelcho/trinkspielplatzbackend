package trinkspielMania.service.implementations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import trinkspielMania.DTO.NochNieDTO;
import trinkspielMania.dbmodel.NochNie;
import trinkspielMania.repository.NochNieRepository;
import trinkspielMania.service.interfaces.NochNieService;

@Service
public class NochNieServiceImpl implements NochNieService {
	
	NochNieRepository nochNieRepo;
	
	@Autowired
	public NochNieServiceImpl(NochNieRepository nochNieRepo) {
		this.nochNieRepo = nochNieRepo;
	}

	@Override
	public List<NochNie> findAllNochNie() {
		return nochNieRepo.findAll();
	}
	
	@Override
	public List<NochNieDTO> findAllNochNieAsDTO() {
		List<NochNie> nochNieList = this.findAllNochNie();
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
	public List<NochNieDTO> findBySearch(String nochNie) {
		return nochNieRepo.findNochNieBySearch(nochNie);
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
