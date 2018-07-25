package hello.Model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class OrderDet {

     public OrderDet(){}

    @Id

    private Integer order_id;
    private Integer line_no;
    private Integer product_id;
    private String  product_name;
    private Integer quantity;
    private Integer amount;

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public Integer getLine_no() {
        return line_no;
    }

    public void setLine_no(Integer line_no) {
        this.line_no = line_no;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }


}
