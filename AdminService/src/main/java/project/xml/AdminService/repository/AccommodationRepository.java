package project.xml.AdminService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.xml.AdminService.model.Accommodation;

@Repository
public interface AccommodationRepository extends JpaRepository<Accommodation, Long>{
	
}
