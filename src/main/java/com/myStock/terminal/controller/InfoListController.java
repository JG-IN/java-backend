package com.myStock.terminal.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myStock.terminal.dao.InfoListDAO;
import com.myStock.terminal.dto.GetInfoListDTO;

@CrossOrigin("*")
@RestController
public class InfoListController {

	@Autowired
	InfoListDAO infoListDAO;
	
	@GetMapping("/getinfolist")
	public List<GetInfoListDTO> getInfoList() {
		
		return infoListDAO.getInfoList();
		
	}
	
	@PostMapping("/insertinfolist")
	public int insertInfoList(String stockName) {
		
		SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd");
		Date time = new Date();
		
		return infoListDAO.insertInfoList(stockName, format.format(time));
		
	}
	
}
