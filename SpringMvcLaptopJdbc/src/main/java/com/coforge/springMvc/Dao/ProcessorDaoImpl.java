package com.coforge.springMvc.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.coforge.SpringEx.jdbcSpringProject.services.ProcessorService;
import com.coforge.springMvc.model.Id;
import com.coforge.springMvc.model.Laptop;
import com.coforge.springMvc.model.Processor;
@Repository //mentions that the class provides the mechanism 
//for database CRUD operations on Objects 

@Qualifier("Processordao")
public class ProcessorDaoImpl implements ProcessorService{

	
	@Autowired 
	JdbcTemplate jdbcTemplate;   
	int Laptopid=0;
	Id i1= new Id();
	
	public int getId() {
		return Laptopid;
	}

	public void setId(int Laptopid) {
		this.Laptopid = Laptopid;
	}
		
	@Override
	public void Save(Processor processor) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("INSERT INTO processor (id, generation," 
				+ " company, chipset) VALUES (?, ?, ?, ?)", processor.getId(),processor.getGeneration(),processor.getCompany(),processor.getChipset());
		i1.setId(processor.getId());
					System.out.println("Processor Added!!");
					
	}

	@Override
	public void editProcessor(Processor processor,int id) {
		// TODO Auto-generated method stub
		//Processor e=new Processor();  
		jdbcTemplate.update("UPDATE processor SET generation= ?, company = ? , " 
				+ "chipset = ? WHERE id = ? ", processor.getGeneration(),
				processor.getCompany(),processor.getChipset(), id); 
					System.out.println("processor Updated!!"); 
					i1.setId(Laptopid);
	}

	@Override
	public void deleteProcessor(int id) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("DELETE from processor WHERE id = ?", id); 
		System.out.println("processor Deleted!!"); 
	}
	@Override
	public Processor find(int id) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("rawtypes") 
		Processor processor = (Processor) jdbcTemplate.queryForObject("SELECT * FROM processor where id = ? ", new Object[] { id }, new BeanPropertyRowMapper(Processor.class)); 
		return processor; }

	
	@Override
	public List<Processor> findAll() {
		// TODO Auto-generated method stub
		 return jdbcTemplate.query("select * from processor",new RowMapper<Processor>(){    
		        public Processor mapRow(ResultSet rs, int row) throws SQLException {    
		        	Processor e=new Processor();    
		            e.setId(rs.getInt(1)); 
		            e.setGeneration(rs.getString(2));
		            e.setCompany(rs.getString(3));
		            e.setChipset(rs.getString(4));
		            
		            return e;    
		        }    
		    });    
	}

	@Override
	public void Save(Laptop laptop) {
		// TODO Auto-generated method stub
		
		Integer id1 = i1.getId();
		jdbcTemplate.update("INSERT INTO laptop (serial_no, graphic_card," 
				+ " ram, company) VALUES (?, ?, ?, ?)", id1,laptop.getGraphic_card(),laptop.getRam(),laptop.getCompany());
				
					System.out.println("Laptop Added!!");
	}

	@Override
	public List<Laptop> findAllLaptop() {
		// TODO Auto-generated method stub
		 return jdbcTemplate.query("select * from laptop",new RowMapper<Laptop>(){    
		        public Laptop mapRow(ResultSet rs, int row) throws SQLException {    
		        	Laptop e=new Laptop();    
		        	 e.setSerial_no(rs.getInt(1));
		            e.setGraphic_card(rs.getString(2));
		           
		            e.setRam(rs.getString(3));
		            e.setCompany(rs.getString(4));
		            
		            
		            return e;    
		        }    
		    });    
	}

	@Override
	public void editLaptop(Laptop laptop, int id) {
		// TODO Auto-generated method stub
		//int id1= i1.getId();
		jdbcTemplate.update("UPDATE laptop SET graphic_card= ?, ram = ? , " 
				+ "company = ? WHERE serial_no = ? ", laptop.getGraphic_card(),
				laptop.getRam(),laptop.getCompany(), id); 
					System.out.println("Laptop Updated!!");  
	}

	@Override
	public Laptop findLaptop(int id) {
		// TODO Auto-generated method stub
		@SuppressWarnings("rawtypes") 
		Laptop laptop = (Laptop) jdbcTemplate.queryForObject("SELECT * FROM laptop where serial_no = ? ", new Object[] { id }, new BeanPropertyRowMapper(Laptop.class)); 
		return laptop;
	}

	@Override
	public void deleteLaptop(int serial_no) {
		// TODO Auto-generated method stub
		
		jdbcTemplate.update("DELETE from laptop WHERE serial_no = ?",serial_no); 
		
		System.out.println("data Deleted!!");
	}

	
}
