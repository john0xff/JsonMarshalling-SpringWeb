package com.phoenixjcam.json.controller.dynamic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.phoenixjcam.json.chart.model.JsonChartModel;
import com.phoenixjcam.json.chart.service.JsonChartService;

@Controller
public class JsonDynamicSourceController
{
	@Autowired
	private JsonChartService chartService;
	
	@RequestMapping(value = "/dynamicJson", method = RequestMethod.GET)
	public ModelAndView getJqxJsonTest()
	{
		ModelAndView modelAndView = new ModelAndView("dynamicSource/dynamicChartJson");

		return modelAndView;
	}

	// @RequestMapping(value = "/dynamicJsonFile", method = RequestMethod.GET) = Response Headers - Content-Type	application/json;charset=UTF-8
	// difference between MediaType and above -> produces = MediaType.APPLICATION_JSON_VALUE = Response Headers - application/json
	// both working well
	@RequestMapping(value = "/dynamicJsonFile", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE) 
	@ResponseBody
	public List<JsonChartModel> getDynamicJsonFile()
	{
		List<JsonChartModel> list = chartService.getAllCharts();

		return list;
	}
	
	// Request GET -> Response Headers - Content-Type = application/json;charset=UTF-8
	@RequestMapping(value = "/dynamicJsonFileArray")
	@ResponseBody
	public String[] getDynamicJsonFileArray()
	{
		String[] data =
		{ "China", "134", "45" };

		return data;
	}
}
