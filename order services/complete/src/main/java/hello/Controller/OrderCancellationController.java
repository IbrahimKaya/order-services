package hello.Controller;

import hello.Model.Order_Mst;
import hello.service.OrderCancellationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/orderCancellation")
public class OrderCancellationController {

    @Autowired
    private OrderCancellationsService orderCancellationsService;

    @RequestMapping(value="/order-cancellation",method = RequestMethod.PUT)
    public @ResponseBody String orderCancel(@RequestBody Order_Mst order_mst){
        return orderCancellationsService.orderCancel(order_mst.getId());
    }
}
