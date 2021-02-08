package com.yl.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@Accessors
public class User implements Serializable {
	private int userId;
	private String userName;
	private String userPassword;
	private int power;
	private String db;
	private List<Code> code;

	
}
