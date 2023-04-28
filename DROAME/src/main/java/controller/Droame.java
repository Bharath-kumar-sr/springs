package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import dao.Operations;
import dto.Customer;
import dto.Operator;

@Controller
public class Droame {
	Operator operator = new Operator();
	Customer customer = new Customer();
	Operations operations = new Operations();

	@RequestMapping("/signup")
	public ModelAndView Osignup() {
		ModelAndView create = new ModelAndView("osignup.jsp");
		create.addObject("signup", operator);
		return create;
	}

	@ResponseBody
	@RequestMapping("/signupjs")
	public String Osignup(Operator operator) {
		String message = "";
		Operator flag = operations.verify(operator.getEmail());
		if (flag == null) {
			operations.signup(operator);
		} else {
			message = "account already exists";
		}
		return message;
	}

	@RequestMapping("/login")
	public ModelAndView Ologin() {
		ModelAndView login = new ModelAndView("ologin.jsp");
		login.addObject("login", operator);
		return login;
	}

	@ResponseBody
	@RequestMapping("/loginjs")
	public String Ologin(String email, String password) {
		String message = "";
		Operator operator = operations.login(email, password);
		if (operator != null) {
			if (operator.getPassword().equals(password)) {
				message = "LOGGED IN";
			} else {
				message = "INCORRECT PASSWORD";
			}
		} else {
			message = "ACCOUNT DOES NOT EXISTS";
		}

		return message;

	}
}
