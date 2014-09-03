package com.phoenixjcam.json.chart.model;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "json_chart", catalog = "jquery_data_source")
public class JsonChartModel
{
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private int id;

	@Column(name = "country", length = 60)
	private String country;

	@Column(name = "population", length = 60)
	private String population;

	@Column(name = "percent")
	private double percent;

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getCountry()
	{
		return country;
	}

	public void setCountry(String country)
	{
		this.country = country;
	}

	public String getPopulation()
	{
		return population;
	}

	public void setPopulation(String population)
	{
		this.population = population;
	}

	public double getPercent()
	{
		return percent;
	}

	public void setPercent(double percent)
	{
		this.percent = percent;
	}

}
