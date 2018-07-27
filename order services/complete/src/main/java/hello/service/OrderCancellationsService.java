package hello.service;

import hello.Repo.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderCancellationsService {
    @Autowired
    private OrderRepository orderRepository;

    public String orderCancel(int id){
        if(null==orderRepository.isExistsById(id)){
            return "order cannot exists";
        }
        if(orderRepository.getStatusFromMst(id).equals("verified")){
            return "order already verified";
        }
        if(orderRepository.getStatusFromMst(id).equals("canceled")){
            return "order already cancell";
        }
        orderRepository.cancelStatus(id);
        return  "cancellation successful";
    }
}
