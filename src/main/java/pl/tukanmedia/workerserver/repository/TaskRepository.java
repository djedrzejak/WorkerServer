package pl.tukanmedia.workerserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.tukanmedia.workerserver.entity.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long>{

}
