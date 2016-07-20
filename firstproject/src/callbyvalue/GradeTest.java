package callbyvalue;

public class GradeTest {

	public static void main(String[] args) {
		
		String sql = "select * from member";
				sql += "where no="+111+" ";
				System.out.println(sql);
		
		StringBuffer sb = new StringBuffer();
		sb.append("select * from member");
		sb.append("where no="+111+" ");
		
		System.out.println(sb);
	}

}
