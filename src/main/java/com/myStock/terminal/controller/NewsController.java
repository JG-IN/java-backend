package com.myStock.terminal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myStock.terminal.dao.NewsDAO;
import com.myStock.terminal.dto.GetNewsFilterDTO;

@RestController
public class NewsController {

	@Autowired
	NewsDAO newsDAO;
	
	@GetMapping("/newsfilterlist")
	public List<GetNewsFilterDTO> GetNewsFilter(String selectedDay){
		
		return newsDAO.getNewsFilterList(selectedDay);
		
	}
	

}
