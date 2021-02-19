package weather1;

import java.util.Scanner;

public class resortWeather 
{
	public static void main(String[] args) throws Exception
	{
		Scanner scan = new Scanner(System.in);
		int resorts;
		int years;
		System.out.println("How many resort?");
		resorts = scan.nextInt();
		System.out.println("How many years?");
		years = scan.nextInt();
		snowReport weather = new snowReport(resorts, years);
		
		System.out.println("What report would you like?");
		
		System.out.println("1. RESORT REPORT \n2. YEAR REPORT \n"
                + "3. SPECIFIC REPORT(RESORT/YEAR) \n4. PRINT SKI REPORT \n"
                + "5. QUIT");
		int reportNum = scan.nextInt();
		
		while(reportNum !=5)
		{
			if (reportNum == 1)
			{
				System.out.println("What resort are you looking for?");
				String report1resort = scan.nextLine();
				double resortAvg = weather.resortAverage(report1resort);
				if (resortAvg == -1) 
				{
					System.out.println("Sorry, the resort was not found");
					break;
				}
				else 
				{
					System.out.println("The average snowfall for "+ report1resort + " is " + resortAvg + " inches.");
				}
			}
			else if (reportNum == 2)
			{
        		System.out.println("What year are you looking for?");
        		int report2year = scan.nextInt();
        		double yearAvg = weather.yearAverage(report2year);
        		if(yearAvg == -1)
        		{
        			System.out.println("Sorry, the given year was not found.");
        			break;
        		}
        		else
        		{
        			System.out.println("The average snowfall for " + report2year + " was " + yearAvg + " inches.");
        		}
			}
			else if (reportNum == 3) 
			{
				System.out.println("What year are you looking for?");
				int reportyear = scan.nextInt();
				System.out.println("What resort are you looking for?");
				String reportresort = scan.nextLine();
				double resort = weather.yearResort(reportyear, reportresort);
				if (resort == -1) 
				{
					System.out.println("Sorry, the year or resort was not found");
					break;
				}
				else 
				{
					System.out.println("The "+ reportyear + " snow report " + reportresort + " is" + resort);
				}

			}
			else
			{
				System.out.println(weather.toString());
			}

			
		}
		System.out.println("Thank you for using SkiResort.com!");
		scan.close();
	}
}
