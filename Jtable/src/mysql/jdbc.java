package mysql;
import javax.swing.*; //GUI 관련 클래스와 컴포넌트 제공
import javax.swing.table.DefaultTableModel; // 테이블의 데이터를 관리
import java.awt.*; //GUI 만들기 위한 도구와 클래스들을 제공. 창,버튼,텍스트 필드,레이아웃 매니저 등

// public class jdbc : jdbc 라는 공개 클래스를 선언. 다른 클래스에서도 접근 가능.
// extends JFame : jdbc 클래스가 JFrame 클래스를 상속. 이를 통해 jdbc 클래스는 JFrame 클래스의 모든 메소드와 변수 사용.
public class jdbc extends JFrame{
	public jdbc() {
		setTitle("Project Plan"); // 윈도우 창 상단 제목 정의. //JFrame 창의 제목 설정.
		setSize(600, 400);	// JFrame 창의 크기를 정의. 너비 600,높이 400 픽셀로 정의.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// 사용자가 창을 닫을때 프로그램이 종료.
		setLayout(new BorderLayout()); // 창 안의 컴포넌트 배치를 관리 하는 방식 정의.
									   // 상,하,좌,우,중앙 다섯 영억으로 구성되어 각 영역 컴포넌트 배치.
		// 데이터베이스 연결 정보 설정
		String url ="Jdbc:mysql://localhost3306/project"l // 데이터베이스 URL
		String user= "root"; // MySQL 사용자 이름
		String password = "1234"; //MySQL 비밀번호
	
	}
	

}
