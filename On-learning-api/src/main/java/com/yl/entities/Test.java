package com.yl.entities;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Accessors
public class Test implements Serializable {
	private int testId;
	private String testTxt;
	private String a;
	private String b;
	private String c;
	private String d;
	private String answer;
	private int paperId;
	private int a_choose;
	private int b_choose;
	private int c_choose;
	private int d_choose;
	private int isTrue;
	

	
}
