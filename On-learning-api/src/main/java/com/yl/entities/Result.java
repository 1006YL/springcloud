package com.yl.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Accessors
public class Result implements Serializable {
	private String userName;
	private String paperName;
	private int result;
	private String useTime;

	
	
}
