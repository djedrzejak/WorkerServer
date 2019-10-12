package pl.tukanmedia.workerserver.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.tukanmedia.workerserver.entity.Settlement;
import pl.tukanmedia.workerserver.repository.SettlementRepository;

@Service
public class SettlementService {

	@Autowired
	private SettlementRepository settlementRepository;
	
	public List<Settlement> getAll() {
		return settlementRepository.findAll();
	}
	
}
