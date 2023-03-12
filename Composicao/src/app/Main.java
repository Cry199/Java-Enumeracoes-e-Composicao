package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import entidades.Department;
import entidades.HourContratc;
import entidades.Worker;
import entidades.enums.WorkerLevel;

public class Main {

	public static void main(String[] args) throws ParseException 
	{
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base Salary: ");
		double baseSalary = sc.nextDouble();
		
		Worker worker =
		new Worker(workerName, WorkerLevel.valueOf(workerLevel),baseSalary, new Department(departmentName));
		
		System.out.println("");
		
		System.out.print("How many contracts to this worker? ");
		int contContracts = sc.nextInt();
		
		for (int i = 1; i <= contContracts; i++)
		{
			System.out.printf("Enter conttract %d° data: \n", i);
			
			System.out.print("Data (dd/mm/yyyy): ");
			Date contractDate = sdf.parse(sc.next());
			
			System.out.print("Value per Hours: ");
			double valuePerHour = sc.nextDouble();
			
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			
			HourContratc contract = new HourContratc(contractDate, valuePerHour,hours);
			worker.addContratc(contract);
		}
		System.out.println("");
		
		System.out.print("Enter month and year to calculate income (MM/yyyy): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0,2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Deparment: " + worker.getDepartment().getName());
		System.out.printf("Income for %s: %.2f", monthAndYear, worker.income(year,month));
		
		sc.close();
	}

}
