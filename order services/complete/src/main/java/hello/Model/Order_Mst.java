package hello.Model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Order_Mst {

	public Order_Mst() {
	}

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private Integer customer_id;
	private String status;
	private String date;

//	@JoinColumn
//	@OneToMany
//	private List<Order_Det>;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Integer getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


}

