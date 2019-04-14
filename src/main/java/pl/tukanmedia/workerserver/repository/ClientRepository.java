package pl.tukanmedia.workerserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.tukanmedia.workerserver.entity.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
