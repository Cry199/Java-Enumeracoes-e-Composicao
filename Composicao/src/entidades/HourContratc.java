package entidades;

import java.util.Date;

public class HourContratc 
{
	private Date date;
	private Double valuePerHour;
	private Integer hours;
	
	public HourContratc(){}
		
	public HourContratc(Date date, Double valorPorHoras, Integer hours) {
		this.date = date;
		this.valuePerHour = valorPorHoras;
		this.hours = hours;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValorPorHoras() {
		return valuePerHour;
	}

	public void setValorPorHoras(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public Integer getHoras() {
		return hours;
	}

	public void setHoras(Integer hours) {
		this.hours = hours;
	}
	
	public double totalValue()
	{
		return valuePerHour * hours;
	}
	
}
