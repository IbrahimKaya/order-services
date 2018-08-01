package hello.service;

import hello.Model.OrderResult;
import hello.Model.Order_Det;
import hello.Model.Order_Mst;
import hello.Repo.OrderDetRepository;
import hello.Repo.OrderRepository;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Convert;
import java.util.List;
import java.util.Optional;

@Service
public class OrderResultService {
    @Autowired
    private OrderDetRepository orderDetRepository;
    @Autowired
    private OrderRepository orderRepository;
    //private OrderResult orderResult;

    public OrderResult getOrderResultById(int id){
        int totalAmount;
        OrderResult orderResult=new OrderResult(0,0,"new","",0,0,"",0,2,0);

        Optional<Order_Mst> orderMstTemp=  orderRepository.findById(id);
        Optional<Order_Det> orderDetTemp= orderDetRepository.findById(id);

        totalAmount=orderDetTemp.get().getAmount()*orderDetTemp.get().getQuantity();

        orderResult.setId(orderMstTemp.get().getId());
        orderResult.setAmount(orderDetTemp.get().getAmount());
        orderResult.setCustomer_id(orderMstTemp.get().getCustomer_id());
        orderResult.setLine_no(orderDetTemp.get().getLine_no());
        orderResult.setOrder_date(orderMstTemp.get().getDate());
        orderResult.setProduct_id(orderDetTemp.get().getProduct_id());
        orderResult.setProduct_name(orderDetTemp.get().getProduct_name());
        orderResult.setQuantity(orderDetTemp.get().getQuantity());
        orderResult.setStatus(orderMstTemp.get().getStatus());
        orderResult.setTotalAmount(totalAmount);



        return orderResult;

    }
}
