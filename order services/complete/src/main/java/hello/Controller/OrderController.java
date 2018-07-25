package hello.Controller;

import hello.Model.OrderMst;
import hello.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping(path="/order")
public class OrderController {
	@Autowired
	private OrderService orderService;

		@RequestMapping(value = "/order-master",method = RequestMethod.POST)
		public @ResponseBody String addNewOrderMaster(@RequestBody OrderMst orderMst){




			return orderService.save(orderMst);

	}


	@RequestMapping(value = "/order-master",method = RequestMethod.GET)
	public @ResponseBody Iterable<OrderMst> getAllOrderMaster(){
		return orderService.findAll();
	}

    }
