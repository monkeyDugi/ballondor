package com.duk.ballondor.search.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString
public class SearchWorkListDto {

	private int idx;
	private String work; 		
	private String regi_date;
	private int ranking;			
}
