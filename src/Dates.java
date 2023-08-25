import java.util.Scanner;

public class Dates {
	
	//method, which checks whether the year is a leap year or not 
	public static boolean leapYear (int year)
	{
		if (year % 4 == 0) return true;
		else return false;
	}
	
	//method, which uses switch to find out whether the month has 30, 31 or 28(29) days 
	public static int daysInMonth(int month)
	{
		int index = 0;
		switch(month)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8: 
		case 10:
		case 12:
			index = 1;
			break;
		case 2:
			index = 2;
			break;
		case 4:
		case 6:
		case 11:
			index = 3;
			break;
			
		}
		return index;
	}
	
	//method, which calculates which day of the week is the entered date
	public static void weekDay(int day)
	{
		char dayOfWeek = 'x';
		
		if ((day % 7 == 0) ||(day % 6 == 0)) dayOfWeek = 'S';
		else if (day % 5 == 0) dayOfWeek = 'F';
		else if (day % 4 == 0) dayOfWeek = 'T';
		else if (day % 3 == 0) dayOfWeek = 'W';
		else if (day % 2 == 0 ) dayOfWeek = 't';
		else dayOfWeek = 'M';
		
		switch (dayOfWeek)
		{
		case 'S': 
			System.out.println("It's a weekend. Take a rest!");
			break;
		case 'F': 
			System.out.println("It's Friday");
			break;
		case 'T':
			System.out.println("It's Thursday");
			break;
		case 'W':
			System.out.println("It's Wednesday");
			break;
		case 't':
			System.out.println("It's Tuesday");
			break;
		case 'M': 
			System.out.println("It's Monday");
			break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year, month, day;
		int days = 0;
		
		//initializing the keyboard to read the user's input 
		Scanner keyboard = new Scanner(System.in);
		
		//asking the user to enter year and reading the input 
		System.out.println("Enter year: ");
		year = keyboard.nextInt();
		
		//checking if the entered year is a leap year or not 
		//displaying the corresponding message 
		if(leapYear(year)) 
			System.out.println("This is a leap year.");
		else 
			System.out.println("This is not a leap year.");
		
		//asking the user to enter month and reading the input 
		System.out.println("Enter month: ");
		month = keyboard.nextInt();
		
		//checking if the entered month is valid or not 
		while(month > 12 || month < 0)
		{
			System.out.println("Invalid month.\nEnter month: ");
			month = keyboard.nextInt();
		}
		
		//calculating days in month using different method
		if(daysInMonth(month) == 1) days = 31;
		else if (daysInMonth(month) == 2)
		{
			if (leapYear(year)) days = 29;
			else days = 28;
		}
		else if (daysInMonth(month) == 3) days = 30;
		
		//asking the user to enter day and reading the input 
		System.out.println("Enter day: ");
		day = keyboard.nextInt();
		
		//checking if the entered value for day is valid or not 
		while (day < 1 || day > days)
		{
			System.out.println("Invalid day.\nEnter day: ");
			day = keyboard.nextInt();
		}
		
		//calling method to find and display the day of the week
		weekDay(day);
	}

}
