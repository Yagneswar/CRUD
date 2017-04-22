package com.niit.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.niit.DAO.UserDAO;
import com.niit.model.User;



@Controller
public class UserController {

	@Autowired
	UserDAO  prodao;
	@RequestMapping("/displayall")
	public @ResponseBody List<User> getallproduct()
	{
		return prodao.getAll();
	}
}
