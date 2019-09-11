

package com.duk.ballondor.regi.vo;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString
public class WorkListVo {

	private String user_id;  
	private String work;      
	private String content;   
	private String regiDate;  
	private List<WorkListVo> workList;	
}
