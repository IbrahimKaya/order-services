package hello.service;

import hello.Repo.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderVerifyService {
    @Autowired
    private OrderRepository orderRepository;

    public String orderVerify(int id){
        if(null==orderRepository.isExistsById(id)){
            return "order cannot exists";
        }
        if(orderRepository.getStatusFromMst(id).equals("verified")){
            return "order already verified";
        }
        if(orderRepository.getStatusFromMst(id).equals("canceled")){
            return "order already canceled";
        }
        orderRepository.verifyStatus(id);
        return "order verify successful";
    }
}
