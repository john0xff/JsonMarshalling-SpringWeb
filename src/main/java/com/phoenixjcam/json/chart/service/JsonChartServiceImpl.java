package com.phoenixjcam.json.chart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.phoenixjcam.json.chart.dao.JsonChartDAO;
import com.phoenixjcam.json.chart.model.JsonChartModel;

@Service
@Transactional
public class JsonChartServiceImpl implements JsonChartService
{
	@Autowired
	private JsonChartDAO jsonChartDAO;
	
	@Override
	public List<JsonChartModel> getAllCharts()
	{
		return jsonChartDAO.getAllCharts();
	}
	
}
