package com.phoenixjcam.json.chart.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.phoenixjcam.json.chart.model.JsonChartModel;

@Repository
public class JsonChartDAOImpl implements JsonChartDAO
{
	@Autowired
	SessionFactory sessionFactory;

	private Session getCurrentSession()
	{
		return sessionFactory.getCurrentSession();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<JsonChartModel> getAllCharts()
	{
		return getCurrentSession().createQuery("from JsonChartModel").list();
	}

}
