package pl.tukanmedia.workerserver.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "task")
public class Task {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 200)
	private String title;
	
	@Column(length = 10000)
	private String content;
	
	@Column
	private BigDecimal price;
	
	@Column
	private Long progress;
	
	@Column
	private Boolean paid;
	
	@Column
	private Date createDate;
	
	@Column
	private Date closeDate;
	
	@ManyToOne()
	@JoinColumn(name = "id_priority")
	private Priority priority;
	
	@ManyToOne()
	@JoinColumn(name = "id_status")
	private Status status;
	
	@ManyToOne()
	@JoinColumn(name = "id_client")
	private Client client;

	@OneToMany(mappedBy = "task")
	private List<Comment> comments = new ArrayList<>();
	
	public Task() {
	}

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

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	public Priority getPriority() {
		return priority;
	}

	public void setPriority(Priority priority) {
		this.priority = priority;
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

	public Date getCloseDate() {
		return closeDate;
	}

	public void setCloseDate(Date closeDate) {
		this.closeDate = closeDate;
	}

	public Long getProgress() {
		return progress;
	}

	public void setProgress(Long progress) {
		this.progress = progress;
	}

	public Boolean getPaid() {
		return paid;
	}

	public void setPaid(Boolean paid) {
		this.paid = paid;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", title=" + title + ", content=" + content + ", price=" + price + ", progress="
				+ progress + ", paid=" + paid + ", createDate=" + createDate + ", closeDate=" + closeDate
				+ ", priority=" + priority + ", status=" + status + ", client=" + client + "]";
	}
	
}
