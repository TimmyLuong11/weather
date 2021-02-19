package weather1;

import java.util.Arrays;

public class snowReport
{
	private String[] skiLodge;
	private int[][] snowReport;
	
	public snowReport(int resorts, int years) 
	{
		skiLodge = new String[resorts +1];
		skiLodge[0] = "Resort";
		snowReport = new int[resorts + 1][years];
		
	}

	public double resortAverage(String report1resort) 
	{
		int count = 0;
		int counter = 0;
		double sum = 0;
		if (skiLodge.equals(report1resort)) 
		{
			for(int i = 0; i<snowReport.length;++i)
			{
				for (int j = 0; j<snowReport[i].length;++j)
				{
					sum = sum+snowReport[i][j];
					++counter;
				}
			}
		}
		else 
		{	
			count = -1;
		}
		return count;
	}

	public double yearAverage(int report2year) 
	{
		int counter = 0;
		double sum = 0;
		if (skiLodge.equals(report2year)) 
		{
			for(int i = 0; i<snowReport.length;++i)
			{
				for (int j = 0; j<snowReport[i].length;++j)
				{
					sum = sum+snowReport[i][j];
					++counter;
				}
			}
		}
		else 
		{	
			return -1;
		}
		return -1;
	}

	public double yearResort(int reportyear, String reportresort) 
	{
		if (skiLodge.equals(reportyear))
		{
			if (skiLodge.equals(reportresort))
			{
				for(int i = 0; i<snowReport.length;++i)
				{
					for (int j = 0; j<snowReport[i].length;++j)
					{
						return snowReport[i][j];
					}
				}
			}
			else
			{
				return -1;
			}
		}
		else 
		{
			return -1;
		}
		return -1;
	}
	
	@Override
	public String toString() 
	{
		return snowReport.toString();
	}


}
