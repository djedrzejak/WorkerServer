package pl.tukanmedia.workerserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.tukanmedia.workerserver.entity.Priority;

@Repository
public interface PriorityRepository extends JpaRepository<Priority, Long>{

}
