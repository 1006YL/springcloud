package com.yl.entities;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Accessors
public class Exam implements Serializable {
	private int q_id;	//编程题编号
	private String q_name;	//编程题名字
	private String question;	//编程题内容
	private String answer;		//编程题答案

	
}
