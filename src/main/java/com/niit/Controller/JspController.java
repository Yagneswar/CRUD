package com.niit.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JspController {

	@RequestMapping(value="/")
	public ModelAndView view()
	{
		ModelAndView mov=new ModelAndView("index");
		
		return mov;
	}
}
