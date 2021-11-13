package trinkspielplatz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import trinkspielplatz.dbmodel.NochNie;

@Repository
public interface NochNieRepository extends JpaRepository<NochNie, Integer> {
	
}
