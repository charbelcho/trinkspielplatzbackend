package trinkspielMania.service.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import trinkspielMania.dbmodel.Kontakt;
import trinkspielMania.repository.KontaktRepository;
import trinkspielMania.service.interfaces.KontaktService;

@Service
public class KontaktServiceImpl implements KontaktService {
	
	private KontaktRepository kontaktRepo;
	
	
	@Autowired
	public KontaktServiceImpl(KontaktRepository kontaktRepo) {
		this.kontaktRepo = kontaktRepo;
	}

	@Override
	public void addNachricht(Kontakt kontakt) {
		kontaktRepo.save(kontakt);
	}

}
