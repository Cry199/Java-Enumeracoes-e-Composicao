package entidades;

import java.util.*;

import entidades.enums.WorkerLevel;

public class Worker 
{
	private String name;
	private WorkerLevel workerLevel;
	private Double baseSalary;
	
	private Department department;
	private List<HourContratc> contratcs = new ArrayList<>();
	
	public Worker(){}
	
	public Worker(String name, WorkerLevel workerLevel, Double baseSalary, Department department) 
	{
		this.name = name;
		this.workerLevel = workerLevel;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getWorkerLevel() {
		return workerLevel;
	}

	public void setWorkerLevel(WorkerLevel workerLevel) {
		this.workerLevel = workerLevel;
	}

	public Double getSalarioBase() {
		return baseSalary;
	}

	public void setSalarioBase(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContratc> getContratcs() {
		return contratcs;
	}

	
	public void addContratc(HourContratc contract)
	{
		contratcs.add(contract);
	}
	
	public void removeContratc(HourContratc contract)
	{
		contratcs.remove(contract);
	}
	
	public double income(int year, int month)
	{	
		double sum = baseSalary;
		
		Calendar cal = Calendar.getInstance();
		for (HourContratc c: contratcs)
		{
			cal.setTime(c.getDate());
			
			int c_year = cal.get(Calendar.YEAR), c_month = 1 + cal.get(Calendar.MONTH);
			
			if(year == c_year && month == c_month)
			{
				sum += c.totalValue();
			}
		}
		
		return sum;
	}
}
