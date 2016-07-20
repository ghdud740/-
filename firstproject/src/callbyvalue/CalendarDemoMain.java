package callbyvalue;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarDemoMain {

	public static void main(String[] args) {
		Calendar calendar = new GregorianCalendar();
/*		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH)+1;
		String smonth = String.format("%02d",month);
		int day = calendar.get(Calendar.DATE);
		String sday = String.format("%02d", day);
		int ampm = calendar.get(Calendar.AM_PM);                    //오전이면 0 오후면 1을 출력
		String sampm = ampm == Calendar.AM ? "오전" : "오후";	
		int hour = calendar.get(Calendar.HOUR);
		int min = calendar.get(Calendar.MINUTE);
		int sec = calendar.get(Calendar.SECOND);
		String today = year+"/"+smonth+"/"+sday+" "+sampm+" ";
				   today  += hour + ":"+min+":"+sec;
		System.out.println(today); */
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd aa hh:mm");
		String today = dateFormat.format(calendar.getTime() );
		System.out.println(today);
	}

}
