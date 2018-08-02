package hello.Repo;

import hello.Model.Order_Mst;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface OrderRepository extends JpaRepository<Order_Mst, Integer> {

    @Query("select status from Order_Mst where id = :orderId")
    String getStatusFromMst (int orderId);

    @Query("select id from Order_Mst  where id= :id")
    String isExistsById(int id);

    @Modifying
    @Transactional
    @Query("update Order_Mst set status= 'canceled' where id= :id")
    void  cancelStatus(int id);

    @Modifying
    @Transactional
    @Query("update Order_Mst set status= 'verified' where id= :id")
    void verifyStatus(int id);
}
