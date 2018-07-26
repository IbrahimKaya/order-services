package hello.Repo;

import hello.Model.OrderDet;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface OrderDetRepository extends CrudRepository<OrderDet, Long>{
    @Query("UPDATE OrderDet SET product_id =:#{#orderDetails.getProduct_id()},product_name=:#{#orderDetails.getProduct_name()},quantity=:#{#orderDetails.getQuantity()},amount=:#{#orderDetails.getAmount()} WHERE order_id=:#{#orderDetails.getOrder_id()}")
    void orderDetUpdate(OrderDet orderDetails);
}
