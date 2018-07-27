package hello.Repo;

import hello.Model.Order_Mst;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface OrderRepository extends CrudRepository<Order_Mst, Long> {

    @Query("select status from Order_Mst where id = :orderId")
    String getStatusFromMst (int orderId);

    @Query("select id from Order_Mst  where id= :id")
    String isExistsById(int id);
}
