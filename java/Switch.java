package com.ust;

public class Switch {
	public static void main(String[]args)
	{
		int day=2;
		String dayType;
		String dayString;
		
		switch(day) {
		case 1:
			dayString="Monday";
			break;
		case 2:
			dayString="Tuesday";
		case 3:
			dayString="wednesday";
		case 4:
			dayString="Thursday";
		case 5:
			dayString="Friday";
		case 6:
			dayString="Saturday";
		case 7:
			dayString="Sunday";
			break;
			default:
				dayString="Invalid day";
		}
		switch(day) {
		
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			dayType="Weekday";
			break;
		case 6:
		case 7:
			dayType="Weekend";
			break;
			
			default:
				dayType="Invalid dayType";
		}
		System.out.println(dayString+"is a"+dayType);
			
		}
	}

	

