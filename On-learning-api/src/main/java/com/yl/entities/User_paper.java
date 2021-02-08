package com.yl.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Accessors
public class User_paper implements Serializable {
	private int userId;
	private int paperId;
	
}
