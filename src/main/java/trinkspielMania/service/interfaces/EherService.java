package trinkspielMania.service.interfaces;

import java.util.List;

import trinkspielMania.dbmodel.Eher;

public interface EherService {
	List<Eher> findAllEher();
	List<Eher> randomizeEher();
}
