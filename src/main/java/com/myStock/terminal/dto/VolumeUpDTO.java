package com.myStock.terminal.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VolumeUpDTO {

	private String stockName;
	private double times;
	private long vol;
	
}
