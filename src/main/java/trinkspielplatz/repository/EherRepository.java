package trinkspielplatz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import trinkspielplatz.dbmodel.Eher;

@Repository
public interface EherRepository extends JpaRepository<Eher, Integer> {

}
