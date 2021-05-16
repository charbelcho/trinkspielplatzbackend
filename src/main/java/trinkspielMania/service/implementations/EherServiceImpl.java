package trinkspielMania.service.implementations;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import trinkspielMania.dbmodel.Eher;
import trinkspielMania.repository.EherRepository;
import trinkspielMania.service.interfaces.EherService;

@Service
public class EherServiceImpl implements EherService {
	
	private EherRepository eherRepo;
	
	@Autowired
	public EherServiceImpl(EherRepository eherRepo) {
		this.eherRepo = eherRepo;
	}

	@Override
	public List<Eher> findAllEher() {
		return eherRepo.findAll();
	}

	@Override
	public List<Eher> randomizeEher() {
		List<Eher> eher = eherRepo.findAll();
		Collections.shuffle(eher);
		return eher;
	}
}
