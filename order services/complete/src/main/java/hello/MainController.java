package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(path="/order")
public class MainController {
	@Autowired

	private OrderRepository orderRepository;
	
	@GetMapping(path="/creation")
	public @ResponseBody String addNewOrder (@RequestParam Integer customer_id,
                                             @RequestParam String status,
                                             @RequestParam String date) {


		
		order_mst n = new order_mst();

		n.setCustomer_id(customer_id);
		n.setStatus(status);
		n.setDate(date);
		orderRepository.save(n);
		return "Saved";
	}
	
	@GetMapping(path="/all")
    public @ResponseBody Iterable<order_mst> getAllOrder() {

        return orderRepository.findAll();
    }
}
