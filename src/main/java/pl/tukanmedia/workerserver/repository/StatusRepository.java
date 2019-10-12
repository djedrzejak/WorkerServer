package pl.tukanmedia.workerserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.tukanmedia.workerserver.entity.Status;

@Repository
public interface StatusRepository extends JpaRepository<Status, Long>{

}
