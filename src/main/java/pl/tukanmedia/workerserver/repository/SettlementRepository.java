package pl.tukanmedia.workerserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.tukanmedia.workerserver.entity.Settlement;

@Repository
public interface SettlementRepository extends JpaRepository<Settlement, Long> {

}
