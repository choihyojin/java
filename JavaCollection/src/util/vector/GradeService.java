package util.vector;

import java.util.Vector;

public interface GradeService {
	// 인터페이스는 추상메소드만 존재한다.
	// 따라서 abstract을 생략해도 디폴트로 존재한다.
	/*
	 * 성적표를 컬렉션에 입력
	 */
	public void input(Grade grade);

	/*
	 * 학생들 전체 성적표 출력
	 */
	public void printlist();

	/*
	 * 학번으로 성적 결과 조회(검색)
	 */
	public String searchGradeByHakbun(String hakbun);
	
	
	/*
	 * 이름으로 성적 결과 조회(검색)
	 * */
	public Vector<Grade> searchGradeByName(String name);

	/*
	 * 성적순으로 정렬
	 */
	public void descByTotal();
	/*
	 * 이름 오름차순 정렬
	 * */
	public void ascByName();

}
