package hello.Controller;

import hello.Model.Order_Det;
import hello.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path="/orderDet")
public class OrderDetController {

    @Autowired
    private OrderDetailService orderDetailService;

    @RequestMapping(value = "/order-details",method = RequestMethod.POST)
    public @ResponseBody String addNewOrderDetails(@RequestBody Order_Det Order_Det){


        return orderDetailService.save(Order_Det);
    }

    @RequestMapping(value = "/order-details",method = RequestMethod.GET)
    public @ResponseBody List<Order_Det> getAllOrderDet(){
       return orderDetailService.findAll();
   }
}
