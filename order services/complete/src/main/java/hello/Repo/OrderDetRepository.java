package hello.Repo;

import hello.Model.Order_Det;
import hello.Model.Order_Mst;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface OrderDetRepository extends JpaRepository<Order_Det, Integer> {
    @Modifying
    @Transactional
    @Query("UPDATE Order_Det SET line_no= :lineNo ," +
            "product_id= :productId, product_name= :productName," +
            "quantity= :quantity,amount= :amount WHERE order_id = :orderId")
    void orderDetUpdate(int orderId,int lineNo,int productId,String productName,int quantity,int amount);
}

