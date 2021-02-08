package com.yl.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Accessors
public class Video implements Serializable {
	private int videoId;
	private String videoName;
	private String videoTime;
	private String videoSrc;
	private int videoTypeId;
	
}
