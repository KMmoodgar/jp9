package lab9.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerMVC {
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/inventory")
	public String inventory(@RequestParam String cusname, @RequestParam String itemname, @RequestParam String itemqty, @RequestParam String itemprice, @RequestParam String itemdescription, Model model) {
		if(cusname.length()>10) {
			model.addAttribute("error", "Name is long");
			return "index";
		}
		else {	
			model.addAttribute("cusname", cusname);
			model.addAttribute("itemname", itemname);
			model.addAttribute("itemqty", itemqty);
			model.addAttribute("itemprice", itemprice);
			model.addAttribute("itemdescription", itemdescription);
			return "inventory";
		}
	}
	
//	@RequestMapping("/inventory")
//	public ModelAndView inventory(@RequestParam String cusname, @RequestParam String itemname, @RequestParam String itemqty, @RequestParam String itemprice, @RequestParam String itemdescription) {
//		ModelAndView model = new ModelAndView("inventory");
//		model.addObject("cusname", cusname);
//		model.addObject("itemname", itemname);
//		model.addObject("itemqty", itemqty);
//		model.addObject("itemprice", itemprice);
//		model.addObject("itemdescription", itemdescription);
//		return model;
//	}
	
}
