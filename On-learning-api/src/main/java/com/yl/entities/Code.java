package com.yl.entities;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Accessors
public class Code implements Serializable {
	private int codeId;
	private String codeName;
	private String codeTxt;
	private String codeDate;
	private int userId;
	private String db;
	public Code(String name){
		this.codeName=name;
	}
}
