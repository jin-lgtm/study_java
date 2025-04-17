package student;

import java.util.Arrays;

public class StudentService {
	Student[] students = new Student[2]; // Student[10] {null, null, null......null} : null 10개 들어간 상태
	int count;  // (학생수)초기값이 0 이므로 int count = 0 이라고 안함

	// 초기화 블럭
	{
		students[count++] = new Student(1, "개똥이", 90, 80, 90);
		students[count++] = new Student(2, "새똥이", 80, 90, 90);
	}
	
	
	
	
	// 2. 수정 및 삭제 구현
	// 3. 배열의 길이를 넘는 추가 학생 등록시 배열 길이 늘리기
	
	// 등록
	void register() {
		System.out.println("등록 기능");
		// 학생 생성
		// 학번, 이름, 국어, 영어, 수학
		int no = StudentUtils.nextInt("학번 > ");
		String name = StudentUtils.nextLine("이름 > ");
		int kor = StudentUtils.nextInt("국어 > ");
		int eng = StudentUtils.nextInt("영어 > ");
		int mat = StudentUtils.nextInt("수학 > ");
		if(students.length == count) {
			students = Arrays.copyOf(students, students.length *2);
		}
		students[count++] = new Student(no, name, kor, eng, mat);				
	}
	
	// 조회
	void read() {
		System.out.println("조회 기능");
		for(int i = 0 ; i < count ; i++) {
			System.out.println(students[i].no + ", "+ students[i].name +"," + students[i].total() + ", " + students[i].avg());
		}
	}
	
	// 수정
	void modify() {
		System.out.println("수정 기능");
		// 학생들 배열에서 입력받은 학번과 일치하는 학생
		int no = StudentUtils.nextInt("수정할 학생의 학번 >");
		Student s = null; // 초기값 지정
		for(int i = 0 ; i < count ; i++) {
			if(students[i].no == no) {
				s = students[i];
				break;
			}
		}
		s.name = StudentUtils.nextLine("이름 > ");
		s.kor = StudentUtils.nextInt("국어 > ");
		s.eng = StudentUtils.nextInt("영어 > ");
		s.mat = StudentUtils.nextInt("수학 > ");
		
	}
	
	// 삭제
	void remove() {
		System.out.println("삭제 기능"); // 배열의 이동으로 덮어써서 삭제
		int no = StudentUtils.nextInt("삭제할 학생의 학번 > ");
		for (int i = 0; i < count; i++) {
			if (students[i].no == no) {
				System.arraycopy(students, i + 1, students, i, count-- - 1 - i);
				break;
			}
		}
	}
	
	//  1. 중복학번 학생 등록 방지
	//  2. 과목별 평균값 출력 + @총 평균
	//  3. 석차 순 정렬 (고득점자 부터 출력) - 총 점 기준
	//  4. Student 클래스의 toString 재정의
	
	
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int idx = 0;
		System.arraycopy(arr, idx+1, arr , arr.length, arr.length-1-idx);
		System.out.println(Arrays.toString(arr));
	}
}
