package kr.ac.itschool.practice;
import java.util.ArrayList;
import kr.ac.itschool.entities.Member;

public class MemberArrayListDemo {


ArrayList<Member> memberListGet(){
	ArrayList<Member> list = new ArrayList<Member>();
	Member member = new Member();
	member.setId("korea");
	member.setName("���ѱ�");
	member.setAddr1("������ ���� �빮��");
	member.setAddr2("594-1����");
	member.setJob("������");
	list.add(member);
	
	member = new Member();
	member.setId("usa");
	member.setName("�ڹ̱�");
	member.setAddr1("�̱� �̸����Ͼ��� La��");
	member.setAddr2("����750");
	member.setJob("Ceo");
	list.add(member);
	
	member = new Member();
	member.setId("china");
	member.setName("���߱�");
	member.setAddr1("�߱� �渲��");
	member.setAddr2("240");
	member.setJob("����");
	list.add(member);
	
	return list;
}
}
