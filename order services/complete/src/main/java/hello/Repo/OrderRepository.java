package hello.Repo;

import hello.Model.OrderMst;
import org.springframework.data.repository.CrudRepository;


public interface OrderRepository extends CrudRepository<OrderMst, Long> {

}
