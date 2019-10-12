package pl.tukanmedia.workerserver.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.tukanmedia.workerserver.entity.Client;
import pl.tukanmedia.workerserver.service.ClientService;

@CrossOrigin()
@RestController
@RequestMapping("/clients")
public class ClientController {

	@Autowired
	private ClientService clientService;
	
	@GetMapping
	public List<Client> getAll() {
		return clientService.getAll();
	}
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public void save(@RequestBody Client client) {
		clientService.save(client);
	}
	
	@PutMapping(path =  "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE) 
	public void update(@RequestBody Client client) {
		clientService.save(client);
	}
	
}
