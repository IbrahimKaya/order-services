package hello.service;

import hello.Model.OrderMst;
import hello.Repo.OrderDetRepository;
import hello.Repo.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import hello.Model.OrderDet;

@Service
public class OrderUpdateService {
    @Autowired
    OrderDetRepository orderDetRepository;
    @Autowired
    OrderRepository orderRepository;


 OrderMst orderMstTemp;
    public String update(OrderDet order_det){
        if(!orderRepository.existsById((long)order_det.getOrder_id())){
            return "order cannot exists";
        }

       String status=orderRepository.getStatusFromMst(order_det.getOrder_id());

        if(status.equals("verified")){

            orderDetRepository.orderDetUpdate(order_det);

            return"update is success";
        }else{

            return "error: order already is verified";
        }
    }

}
