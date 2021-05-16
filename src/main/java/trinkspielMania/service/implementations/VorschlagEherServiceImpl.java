package trinkspielMania.service.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import trinkspielMania.dbmodel.VorschlagEher;
import trinkspielMania.repository.VorschlagEherRepository;
import trinkspielMania.service.interfaces.VorschlagEherService;

@Service
public class VorschlagEherServiceImpl implements VorschlagEherService {
	
	private VorschlagEherRepository vEherRepo;
	
	@Autowired
	public VorschlagEherServiceImpl(VorschlagEherRepository vEherRepo) {
		this.vEherRepo = vEherRepo;
	}


	@Override
	public void addVorschlagEher(VorschlagEher vorschlagEher) {
		vEherRepo.save(vorschlagEher);
	}
	
}
