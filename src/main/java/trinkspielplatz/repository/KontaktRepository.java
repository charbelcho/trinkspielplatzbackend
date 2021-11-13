package trinkspielplatz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import trinkspielplatz.dbmodel.Kontakt;

@Repository
public interface KontaktRepository extends JpaRepository<Kontakt, Integer> {

}
