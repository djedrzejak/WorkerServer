package pl.tukanmedia.workerserver.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.tukanmedia.workerserver.entity.Settlement;
import pl.tukanmedia.workerserver.service.SettlementService;

@RestController
@RequestMapping("/settlements")
public class SettlementController {

	@Autowired
	private SettlementService settlementService;
	
	@GetMapping
	public List<Settlement> getAll() {
		return settlementService.getAll();
	}
	
}
