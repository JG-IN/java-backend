package com.myStock.terminal.dao;

import java.util.List;

import com.myStock.terminal.dto.GetNewsFilterDTO;

public interface NewsDAO {

	List<GetNewsFilterDTO> getNewsFilterList(String selectedDay);
	
}
