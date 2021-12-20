package com.myStock.terminal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myStock.terminal.dao.ChartDataDAO;
import com.myStock.terminal.dto.ChartDataDTO;

@CrossOrigin("*")
@RestController
public class ChartDataController {

	
	@Autowired
	ChartDataDAO chartDataDAO;
	
	@GetMapping("/chartdata/day")
	public List<ChartDataDTO> getDayChartData(String stockName){

		List<ChartDataDTO> output = chartDataDAO.getChartDayData(stockName);
		
		return output;
	}
	
}
