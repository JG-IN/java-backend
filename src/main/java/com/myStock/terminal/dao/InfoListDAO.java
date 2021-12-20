package com.myStock.terminal.dao;

import java.util.List;

import com.myStock.terminal.dto.GetInfoListDTO;

public interface InfoListDAO {

	List<GetInfoListDTO> getInfoList();
	
	int insertInfoList(String stockName, String today);
	
}
