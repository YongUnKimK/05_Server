package edu.kh.todolist.model.dto;

import java.io.Serializable;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Todo implements Serializable{
	
	//Serialiaable : 직렬화~!
	
	private String title; // 제목
	private String detail; //상세내용
	// + 완료여부
	// + 등록날짜짜라짜라짜짠짠짠
	
	
}
