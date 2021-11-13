package trinkspielplatz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import trinkspielplatz.dbmodel.VorschlagEher;

@Repository
public interface VorschlagEherRepository extends JpaRepository<VorschlagEher, Integer> {

}
