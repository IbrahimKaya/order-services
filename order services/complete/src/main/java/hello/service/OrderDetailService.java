package hello.service;

import hello.Model.OrderDet;
import hello.Repo.OrderDetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderDetailService  {
    @Autowired
    OrderDetRepository orderDetRepository;


    public List<OrderDet> findAll(){
        return (List<OrderDet>) orderDetRepository.findAll();
    }

    public String save(OrderDet orderDet){
        orderDetRepository.save(orderDet);
        return "order details creations success";
    }
}
