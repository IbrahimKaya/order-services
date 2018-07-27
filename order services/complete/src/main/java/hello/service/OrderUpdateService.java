package hello.service;

import hello.Model.Order_Det;
import hello.Repo.OrderDetRepository;
import hello.Repo.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderUpdateService {
    @Autowired
    OrderDetRepository orderDetRepository;
    @Autowired
    OrderRepository orderRepository;

    public String update(Order_Det order_det){
       if(!orderRepository.existsById((long)(order_det.getOrder_id()))){
           return "order cannot exists";
       }
       String status=orderRepository.getStatusFromMst(order_det.getOrder_id());

        if(!status.equals("verified")){
            orderDetRepository.orderDetUpdate(order_det.getOrder_id(),
                    order_det.getLine_no(),order_det.getProduct_id(),
                    order_det.getProduct_name(),order_det.getQuantity(),
                    order_det.getAmount());
            return"update is success";
        }else{
            return "error: order already is verified";
        }
    }

}
