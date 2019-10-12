package pl.tukanmedia.workerserver.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import pl.tukanmedia.workerserver.entity.Task;
import pl.tukanmedia.workerserver.repository.TaskRepository;

@Service
public class TaskService {

	@Autowired
	private TaskRepository taskRepository;
	
	public List<Task> findAll() {
		return taskRepository.findAllByOrderByIdAsc();
	}
	
	public ResponseEntity<Task> findOne(Long id) {
		return taskRepository.findById(id)
				.map(ResponseEntity::ok)
				.orElseGet(() -> ResponseEntity.notFound().build());
	}

	public void save(Task task) {
		task.setCreateDate(new Date());
		taskRepository.save(task);
	}
	
	public void delete(Long id) {
		taskRepository.deleteById(id);
	}
	
}
//zamiast report zrobic main i na niej obrazek
//wygląd strony dodawania nowego elementu