package trinkspielMania.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import trinkspielMania.DTO.NochNieDTO;
import trinkspielMania.dbmodel.NochNie;

@Repository
public interface NochNieRepository extends JpaRepository<NochNie, Integer> {
	
	@Query("SELECT n FROM NochNie n WHERE n.nochNie LIKE %:nochNie%")
	List<NochNieDTO> findNochNieBySearch(String nochNie);
}
