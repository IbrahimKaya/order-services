package hello.Controller;

import hello.Model.OrderDet;
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
    public @ResponseBody String addNewOrderDetails(@RequestBody OrderDet OrderDet){


        return orderDetailService.save(OrderDet);
    }

    @RequestMapping(value = "/order-details",method = RequestMethod.GET)
    public @ResponseBody List<OrderDet> getAllOrderDet(){
       return orderDetailService.findAll();
   }
}
