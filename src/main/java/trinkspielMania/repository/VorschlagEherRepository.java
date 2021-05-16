package trinkspielMania.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import trinkspielMania.dbmodel.VorschlagEher;

@Repository
public interface VorschlagEherRepository extends JpaRepository<VorschlagEher, Integer> {

}
