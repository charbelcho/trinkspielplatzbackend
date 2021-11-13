package trinkspielplatz.service.implementations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import trinkspielplatz.DTO.EherDTO;
import trinkspielplatz.dbmodel.Eher;
import trinkspielplatz.repository.EherRepository;
import trinkspielplatz.service.interfaces.EherService;

@Service
public class EherServiceImpl implements EherService {
	
	@Autowired
	private EherRepository eherRepo;

	@Override
	public List<Eher> findAllEher() {
		return eherRepo.findAll();
	}

	@Override
	public List<EherDTO> findAllEherAsDTO() {
		List<Eher> eherList = findAllEher();
		List<EherDTO> eherDTOList = new ArrayList<>();
		for (Eher eherEntry : eherList) {
			eherDTOList.add(convertEherToDTO(eherEntry));
		}
		return eherDTOList;
	}

	@Override
	public List<EherDTO> randomizeEher() {
		List<Eher> eherList = eherRepo.findAll();
		Collections.shuffle(eherList);
		List<EherDTO> eherDTOList = new ArrayList<>();
		for (Eher eherEntry : eherList) {
			eherDTOList.add(convertEherToDTO(eherEntry));
		}
		return eherDTOList;
	}

	@Override
	public EherDTO convertEherToDTO(Eher eher) {
		EherDTO convertedDTO = new EherDTO();
		convertedDTO.setId(eher.getId());
		convertedDTO.setEher(eher.getEher());
		return convertedDTO;
	}

	@Override
	public Eher convertDTOToEher(EherDTO eherDTO) {
		Eher convertedEher = new Eher();
		convertedEher.setId(eherDTO.getId());
		convertedEher.setEher(eherDTO.getEher());
		return convertedEher;
	}
}
