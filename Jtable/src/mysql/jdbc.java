package mysql;
import javax.swing.*; //GUI 관련 클래스와 컴포넌트 제공
import javax.swing.table.DefaultTableModel; // 테이블의 데이터를 관리
import java.awt.*; //GUI 만들기 위한 도구와 클래스들을 제공. 창,버튼,텍스트 필드,레이아웃 매니저 등
import java.sql.Connection;
import java.sql.Statement;

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
		
        Connection conn = null; // 데이터베이스 연결을 위한 Connection 객체
        Statement stmt = null; // SQL 문을 실행하기 위한 Statement 객체
        ResultSet rs = null; // SQL 쿼리 결과를 저장하기 위한 ResultSet 객체
        
        // try : 예외가 발생할 가능이 있는 코드를 작성. 발생시 catch 블록으로 전달.
        try {
        	//Class.forName:문자열로 지정된 클래스 또는 인터페이스를 로드, class 객체를 반환.
        	Class.forName("com.mysql.cj.j.dbc.Driver");
        	
        	//데이터베이스 연결 설정
        	//DriverMangaer :  JDBC 드라이버 관리,데이터베이스 연결 설정.
        	//getConnection : 데이터베이스 연결 설정. 매개변수로 받아 연결을 반환.
        	conn = DriverManager.getConnection(url, user, password);
        	System.out.println("데이버테이스에 연결되었습니다.");
        	
        	//SQL 쿼리 작성 및 실행
        	String query = "SELECT*FROM plan"; //plan 테이블에서 모든 데이터 조회
        	stmt = conn.createStatement();
        	rs = stmt.executeQuery(query);
        	
        	//Jtable 데이터 모델 설정
        	//초기 행의 개수를 0으로 설정. 즉, 처음에는 데이터가 없는 테이블로 시작.
        	DefaultTableModel model = new DefaultTableModel(new String[] {"Pjname", "StartDate","EndDate",
        			"State"},0);
        	
        	}
        }
	}
	

}
