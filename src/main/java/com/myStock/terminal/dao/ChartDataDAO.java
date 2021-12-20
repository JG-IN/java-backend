package com.myStock.terminal.dao;

import java.util.List;

import com.myStock.terminal.dto.ChartDataDTO;

public interface ChartDataDAO {

	List<ChartDataDTO> getChartDayData(String stockName);
	
}
