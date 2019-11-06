/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	    /**
     * prints the days of the week
     */
    public static void printWeek()
    {
        System.out.println("Su Mo Tu We Th Fr Sa");
    }
    /**
     * Prints the year and month formatted at the top of the calendar
     * @param year
     * @param month
     */
    public static void printHeader(int year, int month)
    {
        if (month == 1)
        {
            System.out.println("January  " + year);
            //return "January";
        }
        if (month == 2)
        {
            System.out.println("February  " + year);
            //return "February";
        }
        if (month == 3)
        {
            System.out.println("March  " + year);
            //return "March";
        }
        if (month == 4)
        {
            System.out.println("April  " + year);
            //return "April";
        }
        if (month == 5)
        {
            System.out.println("May  " + year);
            //return "May";
        }
        if (month == 6)
        {
            System.out.println("June  " + year);
            //return "June";
        }
        if (month == 7)
        {
            System.out.println("July  " + year);
            //return "July";
        }
        if (month == 8)
        {
            System.out.println("August  " + year);
            //return "August";
        }
        if (month == 9) 
        {
            System.out.println("September  " + year);
            //return "September";
        }
        if (month == 10)
        {
            System.out.println("October  " + year);
            //return "October";
        }
        if (month == 11)
        {
            System.out.println("November  " + year);
            //return "November";
        }
        if (month == 12)
        {
            System.out.println("December  " + year);
            //return "December";
        }
        //else return "ERROR month out of bounds";
    }
    /**
     * checks if it is a leap year
     * @param year
     * @return if leap year
     */
    public static boolean isLeapYear(int year)
    {
        if (year%4 == 0) { return true;}
        else return false;
    }
    
    /**
     * prints calendar
     * @param year
     * @param month
     * @param leap
     */
    public static void printCalendar(int year, int month, boolean leap)
    {
        int weekday = java.time.LocalDate.of(year, month, 1).getDayOfWeek().getValue();
        String singleSpace = " ";
        String doubleSpace = "  ";
        String tripleSpace = "   ";
        int lineBreak = 0; //incremented to determine where end of week occurs
        int numberOfDays = 31;
        if ((month==9)||(month==4)||(month==6)||(month==11)) { numberOfDays = 30;}
        
        else if (month==2)
        {
            numberOfDays = 28;
            if ((month == 2) && (leap))
            {
                numberOfDays = 29;
            }
        }
        
        //else numberOfDays = 30;
        printHeader(year, month);
        printWeek();
        if (weekday != 7)
        {
            for(int i=0;i<weekday;i++) // prints leading spaces up to first day of week
            {
                System.out.print(tripleSpace);
                lineBreak++;
            }
        }
        
        for(int i=1;i<=numberOfDays;i++)
        {
            if (i<10) {System.out.print(doubleSpace);}
            else {System.out.print(singleSpace);}
            System.out.print(i);
            lineBreak++;
            if(lineBreak%7==0) {System.out.print("\n");}
        }
    }
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String goOn = "";
        do
        {
            System.out.println("What month's calendar would you like? \nPlease enter the year: ");
            int year = in.nextInt();
            System.out.println("Please enter the month(1-12): ");
            int month = in.nextInt();
            boolean leap = isLeapYear(year);
            printCalendar(year, month, leap);
            System.out.println("\nWould you like to continue? y/n");
        }while(!in.next().contentEquals("n"))
            
        ;
    }
}
