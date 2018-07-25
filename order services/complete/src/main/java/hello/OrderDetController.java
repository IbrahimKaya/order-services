package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/orderDet")
public class OrderDetController {
    @Autowired
    private OrderDetRepository orderDetRepository;

    @GetMapping(path="/creationDet")
    public @ResponseBody String addNewOrderDetails(@RequestParam Integer order_id,
                                                   @RequestParam Integer line_no,
                                                   @RequestParam Integer product_id,
                                                   @RequestParam String product_name,
                                                   @RequestParam Integer quantity,
                                                   @RequestParam Integer amount){

        order_det n=new order_det();

        n.setOrder_id(order_id);
        n.setLine_no(line_no);
        n.setProduct_id(product_id);
        n.setProduct_name(product_name);
        n.setQuantity(quantity);
        n.setAmount(amount);

        orderDetRepository.save(n);


        return "order details creations success";
    }

    @GetMapping(path="/detAll")
    public @ResponseBody Iterable<order_det>getAllOrderDet(){
        return orderDetRepository.findAll();
    }
}
