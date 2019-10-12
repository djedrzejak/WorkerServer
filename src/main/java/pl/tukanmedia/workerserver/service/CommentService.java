package pl.tukanmedia.workerserver.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import pl.tukanmedia.workerserver.entity.Comment;
import pl.tukanmedia.workerserver.repository.CommentRepository;

@Controller
public class CommentService {

	@Autowired
	private CommentRepository commentRepository;
	
	public List<Comment> getAllByTaskId(Long taskId) {
		return commentRepository.findAllByTaskIdOrderByIdAsc(taskId);
	}

	public List<Comment> findAll() {
		return commentRepository.findAll();
	}
	
	public void save(Comment comment) {
		comment.setCreateDate(new Date());
		commentRepository.save(comment);
	}
	
	public void delete(Long id) {
		commentRepository.deleteById(id);
	}
}
