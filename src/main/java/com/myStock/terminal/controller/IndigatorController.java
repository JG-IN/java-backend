package com.myStock.terminal.controller;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myStock.terminal.dao.IndigatorDAO;
import com.myStock.terminal.dto.BoxPatternDTO;
import com.myStock.terminal.dto.VolumeUpDTO;

@CrossOrigin("*")
@RestController
public class IndigatorController {

	@Autowired
	private IndigatorDAO indigatorDAO;
	
	@GetMapping("/volumeup")
	public List<VolumeUpDTO> volumnIndigator() {	
		
		return indigatorDAO.volumeUp();
	}
	
	@GetMapping("/boxpattern")
	public List<BoxPatternDTO> getBoxPattern(String reg_date, int nesting_order) {
		
		return indigatorDAO.boxPattern(reg_date, nesting_order);
	}
}
