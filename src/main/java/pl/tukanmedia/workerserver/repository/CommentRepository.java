package pl.tukanmedia.workerserver.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.tukanmedia.workerserver.entity.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long>{

	List<Comment> findAllByTaskIdOrderByIdAsc(Long idTask);
	
}
