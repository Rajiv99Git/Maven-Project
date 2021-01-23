package com.coforge.SpringEx.JDBCSpringLaptopProject;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.coforge.SpringEx.config.ApplicationConfig;
import com.coforge.SpringEx.jdbcSpringProject.entity.Laptop;
import com.coforge.SpringEx.jdbcSpringProject.entity.Processor;
import com.coforge.SpringEx.jdbcSpringProject.services.LaptopService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
    	LaptopService laptopService = (LaptopService) context.getBean("laptopService");
		Processor processor=new Processor(103,"8","intel","A14");
		Processor processor1=new Processor(104,"8","AMD","A14");
		Processor processor2=new Processor(105,"8","intel","A14");
		Laptop hp =new Laptop(1,processor,"i5",4,"HP",40000.0);
		Laptop dell = new Laptop(2,processor1,"i3",2,"Dell",30000.0);
		
		Laptop asus = new Laptop(3,processor2,"i3",2,"Asus",30000.0);
		
		laptopService.addLaptop(hp);
		laptopService.addLaptop(dell);
		laptopService.addLaptop(asus);
		
		System.out.println("Find All");
		
		List<Laptop> laptops  = laptopService.findAll();
		for (Laptop laptop: laptops) { 
    		System.out.println(laptop); 
    	} 
		System.out.println("Delete Serial No. = 6");
		int deleteMe = 6;
		laptopService.deleteLaptop(deleteMe);
		
		System.out.println("Find All Again");
		laptops  = laptopService.findAll();
		for (Laptop laptop: laptops) { 
    		System.out.println(laptop); 
    	} 
	}

}
