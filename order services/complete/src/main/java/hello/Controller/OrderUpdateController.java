package hello.Controller;

import hello.Model.Order_Det;
import hello.service.OrderUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(path="/orderUpdate")
public class OrderUpdateController {

    @Autowired
    private OrderUpdateService orderUpdateService;

    @RequestMapping(value = "/order-update",method = RequestMethod.PUT)
    public @ResponseBody String updateOrderDetails(@RequestBody Order_Det Order_Det){
        return orderUpdateService.update(Order_Det);
    }


}
