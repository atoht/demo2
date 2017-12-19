package demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import demo.entity.User;
import demo.service.UserI;

@Controller
public class ShowUser {
	
	private UserI ui;

	public UserI getUi() {
		return ui;
	}
	@Autowired
	public void setUi(UserI ui) {
		this.ui = ui;
	}
	@RequestMapping(value="/Use", method = RequestMethod.GET)
	public String show(Model ml) {
		User u = ui.getUser(1);
		ml.addAttribute("User", 5);
		return "index";
	}
	@RequestMapping({"/User", "/"})
	public String showU() {
//		User u = ui.getUser(1);
//		ml.addAttribute("User", 5);
		System.out.println("skdfjlsakj");
		return "NewFile";
	}
}
