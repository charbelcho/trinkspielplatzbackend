package trinkspielplatz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import trinkspielplatz.dbmodel.VorschlagNochNie;

@Repository
public interface VorschlagNochNieRepository extends JpaRepository<VorschlagNochNie, Integer> {

}
