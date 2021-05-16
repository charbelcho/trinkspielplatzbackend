package trinkspielMania.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import trinkspielMania.dbmodel.Eher;

@Repository
public interface EherRepository extends JpaRepository<Eher, Integer> {

}
