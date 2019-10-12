package pl.tukanmedia.workerserver.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.tukanmedia.workerserver.entity.Status;
import pl.tukanmedia.workerserver.service.StatusService;

@RestController
@RequestMapping("/statuses")
public class StatusController {

	@Autowired
	private StatusService statusService;
	
	@GetMapping
	public List<Status> getAll() {
		return statusService.getAll();
	}
	
}
