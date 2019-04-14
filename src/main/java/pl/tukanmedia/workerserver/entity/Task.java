package pl.tukanmedia.workerserver.entity;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="task")
public class Task {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="task_generator")
	@SequenceGenerator(name="task_generator", sequenceName="task_seq")
	private Long id;
	@Column
	private String title;
	@Column
	private String content;
	@Column
	private BigDecimal price;
	@ManyToOne()
	@JoinColumn(name="id_priority")
	private Priority priority;
	@ManyToOne()
	@JoinColumn(name="id_settlement")
	private Settlement settlement;
	@ManyToOne()
	@JoinColumn(name="id_status")
	private Status status;
	@ManyToOne()
	@JoinColumn(name="id_client")
	private Client client;
	
	public Task() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Priority getPriority() {
		return priority;
	}

	public void setPriority(Priority priority) {
		this.priority = priority;
	}

	public Settlement getSettlement() {
		return settlement;
	}

	public void setSettlement(Settlement settlement) {
		this.settlement = settlement;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", title=" + title + ", content=" + content + ", price=" + price + ", priority="
				+ priority + ", settlement=" + settlement + ", status=" + status + ", client=" + client + "]";
	}
	
}
