package com.myStock.terminal.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetInfoListDTO {
	
	private String stockName;
	private String issue;
	private String stock_type;
	private double reg_compare_ratio;
	private String is_highlight;
	private String reg_date;
}
