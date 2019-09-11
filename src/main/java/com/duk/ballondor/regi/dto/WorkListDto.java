package com.duk.ballondor.regi.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString
public class WorkListDto {

	private String user_id;
	private String work;
	private Date   regi_date;
}
