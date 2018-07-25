package hello.service;

import hello.Model.OrderDet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailService  {
    @Autowired
    OrderDetailService orderDetailService;


    public Iterable<OrderDet>findAll(){
        return orderDetailService.findAll();
    }

    public String save(OrderDet orderDet){
        orderDetailService.save(orderDet);
        return "order details creations success";
    }
}
