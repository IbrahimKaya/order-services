package hello.service;

import hello.Model.Order_Det;
import hello.Repo.OrderDetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderDetailService  {
    @Autowired
    OrderDetRepository orderDetRepository;


    public List<Order_Det> findAll(){
        return (List<Order_Det>) orderDetRepository.findAll();
    }

    public String save(Order_Det orderDet){
        orderDetRepository.save(orderDet);
        return "order details creations success";
    }
}
