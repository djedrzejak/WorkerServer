package pl.tukanmedia.workerserver.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.tukanmedia.workerserver.entity.Priority;
import pl.tukanmedia.workerserver.service.PriorityService;

@RestController
@RequestMapping("/priorities")
public class PriorityController {

	@Autowired
	private PriorityService priorityService;
	
	@GetMapping
	public List<Priority> getAll() {
		return priorityService.getAll();
	}
	
}
