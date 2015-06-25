package openNow;

import java.util.*;
import java.io.*;
public class IsOpenNow {
	public static boolean isOpenNow(){
		Calendar calendar = Calendar.getInstance();
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		int hour = calendar.getMaximum(Calendar.HOUR_OF_DAY);
		return isOpenNow(dayOfWeek, hour);
	}
	public static boolean isOpenNow(int dayOfWeek, int hour){
		int start;
		int end;
		String[] sun = null;
		String[] mon = null;
		String[] tue = null;
		String[] wed = null;
		String[] thu = null;
		String[] fri = null;
		String[] sat = null;
		
		try{
			BufferedReader reader = new BufferedReader(new FileReader("/Users/takagimoeko/open.txt"));
			String line;

			line = reader.readLine();
			sun = line.split(" ", 0);
			line = reader.readLine();
			mon = line.split(" ", 0);
			line = reader.readLine();
			tue = line.split(" ", 0);
			line = reader.readLine();
			wed = line.split(" ", 0);
			line = reader.readLine();
			thu = line.split(" ", 0);
			line = reader.readLine();
			fri = line.split(" ", 0);
			line = reader.readLine();
			sat = line.split(" ", 0);

			reader.close();
		}catch(FileNotFoundException fe){
			System.out.println(fe);
		}catch(IOException e){
			System.out.println(e);
		}		

		if(dayOfWeek == 1 && !sun[1].equals("holiday")){
			start = Integer.parseInt(sun[1]);
			end = Integer.parseInt(sun[3]);
			if(start > end){
				return (hour >= start && hour <=24) || (hour <= end && hour >= 0); 
			}
			return hour >= start && hour <= end;
		}else if(dayOfWeek == 2 && !mon[1].equals("holiday")){
			start = Integer.parseInt(mon[1]);
			end = Integer.parseInt(mon[3]);
			if(start > end){
				return (hour >= start && hour <=24) || (hour <= end && hour >= 0); 
			}
			return hour >= start && hour <= end;
		}else if(dayOfWeek == 3 && !tue[1].equals("holiday")){
			start = Integer.parseInt(tue[1]);
			end = Integer.parseInt(tue[3]);
			if(start > end){
				return (hour >= start && hour <=24) || (hour <= end && hour >= 0); 
			}
			return hour >= start && hour <= end;
		}else if(dayOfWeek == 4 && !wed[1].equals("holiday")){
			start = Integer.parseInt(wed[1]);
			end = Integer.parseInt(wed[3]);
			if(start > end){
				return (hour >= start && hour <=24) || (hour <= end && hour >= 0); 
			}
			return hour >= start && hour <= end;
		}else if(dayOfWeek == 5 && !thu[1].equals("holiday")){
			start = Integer.parseInt(thu[1]);
			end = Integer.parseInt(thu[1]);
			if(start > end){
				return (hour >= start && hour <=24) || (hour <= end && hour >= 0); 
			}
			return hour >= start && hour <= end;
		}else if(dayOfWeek == 6 && !fri[1].equals("holiday")){
			start = Integer.parseInt(fri[1]);
			end = Integer.parseInt(fri[3]);
			if(start > end){
				return (hour >= start && hour <=24) || (hour <= end && hour >= 0); 
			}
			return hour >= start && hour <= end;
		}else if(dayOfWeek == 7 && !sat[1].equals("holiday")){
			start = Integer.parseInt(sat[1]);
			end = Integer.parseInt(sat[3]);
			if(start > end){
				return (hour >= start && hour <=24) || (hour <= end && hour >= 0); 
			}
			return hour >= start && hour <= end;
		}
		return false;

	}

}
