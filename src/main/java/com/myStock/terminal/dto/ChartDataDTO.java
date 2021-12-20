package com.myStock.terminal.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChartDataDTO {

	private int open;
	private	int close;
	private int high;
	private int low;
	private long vol;
	private String date;
	
}
