package com.yl.entities;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Accessors
public class TestPaper implements Serializable {
	private int paperId;
	private String paperName;
	private int testCount;
	private int userCount;
	
}
