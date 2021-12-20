package com.myStock.terminal.dao;

import java.util.List;

import com.myStock.terminal.dto.BoxPatternDTO;
import com.myStock.terminal.dto.VolumeUpDTO;


public interface IndigatorDAO {
	
	public List<VolumeUpDTO> volumeUp();
	
	public List<BoxPatternDTO> boxPattern(String reg_date, int nesting_order);
	
}
