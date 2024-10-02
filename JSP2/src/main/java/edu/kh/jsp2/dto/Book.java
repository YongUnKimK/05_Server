package edu.kh.jsp2.dto;

import jakarta.servlet.http.HttpServlet;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// lombok.jar 라이브러리 이용 방법
// 1) lombok 기능을 이용하고자 하는 프로젝트의 lib폴더에 lombok.jar 추가
// 2) lombok 이용하는 IDE에 설치해주기


@Data // Getter + Setter + toString
//@Getter 개별 가능
//@Setter
//@ToString
@NoArgsConstructor // 매개변수가 없는 기본 생성자
@AllArgsConstructor // 모든필드 초기화용 매개변수 생성자
public class Book extends HttpServlet {
	
	
	// 필드
	private String title;
	private String writer;
	private int price;
	
	// 메서드 ( 생성자, getter / setter / toString 등등 )
}