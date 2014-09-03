package com.phoenixjcam.json.controller.staticc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JsonStaticSourceController
{
	/**
	 * Return jsp with jquery chart content
	 * second step, request for JSON file with XHR object which is in data.json 
	 * path to this file - res/chartjqx/chartJson/data.json
	 * 
	 * @return
	 */
	@RequestMapping(value = "/staticJson", method = RequestMethod.GET)
	public ModelAndView getJqxJsonTest()
	{
		ModelAndView modelAndView = new ModelAndView("staticSource/staticChartJson");

		return modelAndView;
	}

}
