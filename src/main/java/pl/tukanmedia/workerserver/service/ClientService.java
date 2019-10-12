package pl.tukanmedia.workerserver.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import pl.tukanmedia.workerserver.entity.Client;
import pl.tukanmedia.workerserver.repository.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;
	
	public List<Client> getAll() {
		return clientRepository.findAll();
	}
	
	public ResponseEntity<Client> findOne(Long id) {
		return clientRepository.findById(id)
				.map(ResponseEntity::ok)
				.orElseGet(() -> ResponseEntity.notFound().build());
	}
	
	public void save(Client client) {
		clientRepository.save(client);
	}
	
	public void deleteById(Long id) {
		clientRepository.deleteById(id);
	}
}
