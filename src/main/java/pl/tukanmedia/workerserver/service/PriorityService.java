package pl.tukanmedia.workerserver.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.tukanmedia.workerserver.entity.Priority;
import pl.tukanmedia.workerserver.repository.PriorityRepository;

@Service
public class PriorityService {

	@Autowired
	private PriorityRepository priorityRepository;
	
	public List<Priority> getAll() {
		return priorityRepository.findAll();
	}
	
}
