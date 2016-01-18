package Examples;

import Examples.EnumEx.MONTHS;

public class EnumTest {

	MONTHS months;
	
	public  EnumTest(MONTHS months){
		this.months = months;
	}
	
	public void enumMethodEX(){
		
		switch(months){
		case  JANUARY :
			
			System.out.println("1st month : JANUARY");
			break;
			
		case  FEBRUARY :
		System.out.println("2nd month : FEBRAUARY");
		break;
		
		case  MARCH :
			System.out.println("3rd month : MARCH");
			break;
		
		case  APRIL :
			System.out.println("4th month : APRIL");
			break;
			
		case  MAY :
			System.out.println("5th month : MAY");
			break;
			
		case  JUNE :
			System.out.println("6th month : JUNE");
			break;
			
		case  JULY :
			System.out.println("7th month : JULY");
			break;
			
		case  AUGUST :
			System.out.println("8th month : AUGUST");
			break;
			
		case  SEPTEMBER :
			System.out.println("9th month :  SEPTEMBER");
			break;
			
		case  OCTOBER :
			System.out.println("10th month :  OCTOBER");
			break;
			
		case  NOVEMBER :
			System.out.println("11th month : NOVEMBER");
			break;
			
		case  DECEMBER :
			System.out.println("12th month :  DECEMBER");
			break;	
			
		default :
			System.out.println("Please enter valid data : ");
			break;
		}
		
	}
	public static void main(String[] args){
		
	
		EnumTest firstMonth = new EnumTest(MONTHS.JANUARY);
		firstMonth.enumMethodEX();
		EnumTest secondMonth = new EnumTest(MONTHS.FEBRUARY);
		secondMonth.enumMethodEX();
		EnumTest thirdMonth = new EnumTest(MONTHS.MARCH);
		thirdMonth.enumMethodEX();
		EnumTest fourthMonth = new EnumTest(MONTHS.APRIL);
		fourthMonth.enumMethodEX();
		EnumTest fifthMonth = new EnumTest(MONTHS.MAY);
		fifthMonth.enumMethodEX();
		EnumTest sixthMonth = new EnumTest(MONTHS.JUNE);
		sixthMonth.enumMethodEX();
		EnumTest seventhMonth = new EnumTest(MONTHS.JULY);
		seventhMonth.enumMethodEX();
		EnumTest eighthMonth = new EnumTest(MONTHS.AUGUST);
		eighthMonth.enumMethodEX();
		EnumTest ninthMonth = new EnumTest(MONTHS.SEPTEMBER);
		ninthMonth.enumMethodEX();
		EnumTest tenthMonth = new EnumTest(MONTHS.OCTOBER);
		tenthMonth.enumMethodEX();
		EnumTest eleventhMonth = new EnumTest(MONTHS.NOVEMBER);
		eleventhMonth.enumMethodEX();
		EnumTest twelfthMonth = new EnumTest(MONTHS.DECEMBER);
		twelfthMonth.enumMethodEX();
		
		
		
	}
	

}
