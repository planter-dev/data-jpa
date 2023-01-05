package stydt.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import stydt.datajpa.entity.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {

}
