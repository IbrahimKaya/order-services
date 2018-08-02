package hello.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

public class OrderResult {


    private Integer id;
    private Integer customer_id;
    private String status;
    private String order_date;
    private Integer line_no;
    private Integer product_id;
    private String  product_name;
    private Integer quantity;
    private Integer amount;
    private Integer totalAmount;

    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
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

    public String getOrder_date() {
        return order_date;
    }

    public void setOrder_date(String order_date) {
        this.order_date = order_date;
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

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderResult that = (OrderResult) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(customer_id, that.customer_id) &&
                Objects.equals(status, that.status) &&
                Objects.equals(order_date, that.order_date) &&
                Objects.equals(line_no, that.line_no) &&
                Objects.equals(product_id, that.product_id) &&
                Objects.equals(product_name, that.product_name) &&
                Objects.equals(quantity, that.quantity) &&
                Objects.equals(amount, that.amount) &&
                Objects.equals(totalAmount, that.totalAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, customer_id, status, order_date, line_no, product_id, product_name, quantity, amount, totalAmount);
    }
}
