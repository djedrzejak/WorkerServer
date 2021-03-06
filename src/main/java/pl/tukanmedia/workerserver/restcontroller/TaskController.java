package pl.tukanmedia.workerserver.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.tukanmedia.workerserver.entity.Task;
import pl.tukanmedia.workerserver.service.TaskService;

@CrossOrigin()
@RestController
@RequestMapping("/tasks")
public class TaskController {

	@Autowired
	private TaskService taskService;
	
	@GetMapping
	public List<Task> getAll() {
		return taskService.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Task> getOne(@PathVariable Long id) {
		return taskService.findOne(id);
	}
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public void save(@RequestBody Task task) {
		taskService.save(task);
	}
	
	@PutMapping(path =  "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE) 
	public void update(@RequestBody Task task) {
		taskService.save(task);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		taskService.delete(id);
	}
	
}
