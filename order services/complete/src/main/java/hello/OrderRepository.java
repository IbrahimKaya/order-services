package hello;

import org.springframework.data.repository.CrudRepository;


public interface OrderRepository extends CrudRepository<order_mst, Long> {

}
