package hello.Controller;

import hello.Model.Order_Mst;
import hello.service.OrderVerifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/orderVerify")
public class OrderVerifyController {
    @Autowired
    private OrderVerifyService orderVerifyService;

    @RequestMapping(value="/verify",method = RequestMethod.PUT)
    public @ResponseBody String orderVerify(@RequestBody Order_Mst order_mst){
        return orderVerifyService.orderVerify(order_mst.getId());
    }
}
