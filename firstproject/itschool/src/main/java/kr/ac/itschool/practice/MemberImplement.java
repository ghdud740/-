package kr.ac.itschool.practice;

public class MemberImplement implements MemberInterface {


	public int update() {
		return 0;
	}

	
	public String select() {
		String sql ="select * from student where name is not null";
		return sql;
	}

	@Override
	public int delete() {
		return 0;
	}

	public void insert() {
	
		
	}


	

}
