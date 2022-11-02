package array;

import java.util.ArrayList;

public class Student {
	
	private int studentID;
	private String studentName;
	private ArrayList<Subject> subjectList;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		
		subjectList = new ArrayList<Subject>();
		
	}
	
	//학생의 정보를 추가할 수 있는 메소드
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		
		subjectList.add(subject);
	}
	
	//정보 출력
	public void showStudentInfo() {
		for(Subject subject : subjectList) {
			
			System.out.println("학생" + studentName + "님의"+ subject.getName() + "과목의 성적은" +
			subject.getScorePoint() + "입니다.");
		}
	}
}
