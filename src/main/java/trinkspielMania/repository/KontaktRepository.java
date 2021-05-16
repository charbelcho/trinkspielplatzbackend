package trinkspielMania.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import trinkspielMania.dbmodel.Kontakt;

@Repository
public interface KontaktRepository extends JpaRepository<Kontakt, Integer> {

}
