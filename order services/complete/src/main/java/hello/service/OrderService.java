package hello.service;

import hello.Model.Order_Mst;
import hello.Repo.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;

    public List<Order_Mst> findAll(){
        return (List<Order_Mst>) orderRepository.findAll();
    }

    public String save(Order_Mst orderMst){
        orderRepository.save(orderMst);
        return "order master saved";
    }

}
