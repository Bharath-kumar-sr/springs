package programs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class Controller {
	@Autowired
	Emplyoee emplyoee;
	@Autowired
	Operations operations;

	@RequestMapping("/signup")
	public ModelAndView signup() {
		ModelAndView m1 = new ModelAndView("signup.jsp");
		m1.addObject("key", emplyoee);
		return m1;
	}

	@ResponseBody
	@RequestMapping("/signupjs")
	public void signup(Emplyoee emp) {
		operations.signup(emp);
	}

	public void login() {
 
	}

	@RequestMapping("/update")
	public ModelAndView update() {
		ModelAndView m4 = new ModelAndView("update.jsp");
		m4.addObject("key", emplyoee);
		return m4;
	}

	@ResponseBody
	@RequestMapping("/updatejs")
	public void update(int id, long number) {
		operations.update(id, number);
	}

	@RequestMapping("/delete")
	public ModelAndView delete() {
		ModelAndView m2 = new ModelAndView("remove.jsp");
		m2.addObject("key", emplyoee);
		return m2;
	}

	@ResponseBody
	@RequestMapping("/deletejs")
	public void delete(int id) {
		operations.delete(id);
	}

	@RequestMapping("/fetch")
	public ModelAndView fetch() {
		ModelAndView m3 = new ModelAndView("fetch.jsp");
		m3.addObject("key", emplyoee);
		return m3;
	}

	@ResponseBody
	@RequestMapping("/fetchjs")
	public ModelAndView fetch(int id) {
		Emplyoee emp = operations.fetch(id);
		ModelAndView fetch = new ModelAndView("display.jsp");
		fetch.addObject("key", emp);
		System.out.println(emplyoee);
		return fetch;

	}

}
