package hello.Controller;

import hello.Model.OrderDet;
import hello.service.OrderUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(path="/orderUpdate")
public class OrderUpdateController {

    @Autowired
    private OrderUpdateService orderUpdateService;

    @RequestMapping(value = "/order-update",method = RequestMethod.POST)
    public @ResponseBody String updateOrderDetails(@RequestBody OrderDet orderDet){

    return orderUpdateService.update(orderDet);
    }


}
