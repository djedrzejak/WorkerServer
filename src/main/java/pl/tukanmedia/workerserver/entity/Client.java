package pl.tukanmedia.workerserver.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="client")
public class Client {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="client_generator")
	@SequenceGenerator(name="client_generator", sequenceName="client_seq")
	private Long id;
	@Column
	private String name;
	@Column
	private String description;
	
	public Client() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
	
}