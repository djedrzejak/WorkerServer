package pl.tukanmedia.workerserver.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.tukanmedia.workerserver.entity.Status;
import pl.tukanmedia.workerserver.repository.StatusRepository;

@Service
public class StatusService {

	@Autowired
	private StatusRepository statusRepository;
	
	public List<Status> getAll() {
		return statusRepository.findAll();
	}
	
}
