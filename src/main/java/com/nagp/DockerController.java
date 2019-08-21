package com.nagp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DockerController {
	/**
	 * @param model
	 * @return JSP view
	 */
	@RequestMapping(value="/jenkins", method = RequestMethod.GET)
	public String sayHello(Model model){
		model.addAttribute("welcome", "Jenkins Workflow");
		
		return "jenkins";
	}
}