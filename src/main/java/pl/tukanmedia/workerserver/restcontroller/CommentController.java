package pl.tukanmedia.workerserver.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.tukanmedia.workerserver.entity.Comment;
import pl.tukanmedia.workerserver.service.CommentService;

@CrossOrigin()
@RestController
@RequestMapping("/comments")
public class CommentController {

	@Autowired
	private CommentService commentService;
	
	@GetMapping
	public List<Comment> getAll() {
		return commentService.findAll();
	}
	
	@GetMapping("/{taskId}")
	public List<Comment> getAllByTaskId(@PathVariable Long taskId) {
		return commentService.getAllByTaskId(taskId);
	}
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public void save(@RequestBody Comment comment) {
		commentService.save(comment);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		commentService.delete(id);
	}
	
}
