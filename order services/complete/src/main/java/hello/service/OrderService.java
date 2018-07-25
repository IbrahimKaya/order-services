package hello.service;

import hello.Model.OrderMst;
import hello.Repo.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;


    public List<OrderMst> findAll(){
        return (List<OrderMst>) orderRepository.findAll();
    }

    public String save(OrderMst orderMst){
        orderRepository.save(orderMst);
        return "order master saved";
    }

}
