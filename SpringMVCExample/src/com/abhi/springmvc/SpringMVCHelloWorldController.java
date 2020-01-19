/**
 * 
 */
package com.abhi.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author absingh
 *
 */

@Controller
public class SpringMVCHelloWorldController {

	@Autowired
	private SpringMVCHelloWorldService service;

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public ModelAndView printHello(Model model)

	{
		System.out.println("Hello !!!");
		String serviceResponse = service.printHello();
		System.out.println(serviceResponse);
		model.addAttribute("message", "Hello Spring MVC Framework!");
		ModelAndView view = new ModelAndView();
		view.setViewName("hello");
		return view;
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(ModelMap model) {
		System.out.println("Hello !!!");
		model.addAttribute("message", "Hello Spring MVC Framework!");
		return "hello";
	}
}
