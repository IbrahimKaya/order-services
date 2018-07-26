package hello.Repo;

import hello.Model.OrderMst;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface OrderRepository extends CrudRepository<OrderMst, Long> {

    @Query("select status from OrderMst where id = :#{#orderId}")
    String getStatusFromMst (int orderId);
}
