package com.yl.entities;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Accessors
public class JiLu implements Serializable {
	private String testTxt;
	private String userChoose;
	private String userChooseTxt;
	private String answer;
	private String answerTxt;
	private String result;


    public void setDuicuo(String s) {
    }
}
