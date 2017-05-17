package com.niit.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.DAO.ProductDAO;
import com.niit.model.Product;



@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	ProductDAO pDAO;

	@RequestMapping(value = "/product")
	public ModelAndView adminview() {
		ModelAndView mv = new ModelAndView("adminview");
		mv.addObject("product", new Product());
		mv.addObject("products", pDAO.getAll());
		return mv;
	}
	
    
	@RequestMapping(value = "/delete/{id}")
	public String adminDelete(@PathVariable("id") Integer rt) {
		pDAO.delete(rt);
		return "redirect:/admin/product";
	}
	
	@RequestMapping(value = "/edit/{id}")
	public String adminEdit(@PathVariable("id") int rt,Model model) {
		model.addAttribute("product",pDAO.getProduct(rt));
		model.addAttribute("products",pDAO.getAll());
		
		return "redirect:/admin/product";
	}

	
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String adminSave(@ModelAttribute("product") Product product, BindingResult results, Model model) 
	{
		if(product.getId()==0)
		{
			pDAO.insert(product);
		}
		else{
			pDAO.update(product);
		}
		
				return "redirect:/admin/product";
	}
	
	
}
