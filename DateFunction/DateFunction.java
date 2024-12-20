package task;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class DateFunction {
	public static void addDateMonthYear(String date,int days,int months,int year)throws ParseException{
		SimpleDateFormat format=new SimpleDateFormat("dd/mm/yyyy");
		Date inputDate=format.parse(date);
		System.out.println("the given date is :"+format.format(inputDate));
		Calendar outputDate=Calendar.getInstance();
		outputDate.setTime(inputDate);
		outputDate.add(Calendar.DATE,days);
		outputDate.add(Calendar.MONTH, months);
		outputDate.add(Calendar.YEAR,year);
		
		
		
		int day=outputDate.get(days);
		int month=outputDate.get(months);
		int year1=outputDate.get(year);
		System.out.println("after adding given date/month/year:"+day+"/"+month+"/"+year1);
	}

	public static void main(String[] args)throws ParseException {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the date(dd/mm/yyyy):");
		String userinput=scan.nextLine();
		int defaultdays=4;
		int defaultmonths=4;
		int defaultyear=4;
		addDateMonthYear(userinput,defaultdays,defaultmonths,defaultyear);
		scan.close();
	

	}

}
