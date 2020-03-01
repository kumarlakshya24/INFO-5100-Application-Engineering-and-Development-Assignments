package Assignment6;
import java.util.*;
/**
 * @author Lakshya
 *
 */
public class Cat extends Pet implements Boardable {
	
	private String hairLength; 	
	private Date boardStart;
	private Date boardEnd;
	
	public Cat(String name, String ownername, String color, String hairLength) 
	{
		super(name, ownername, color);
		this.hairLength = hairLength;
	}
	
	public String gethairLength() 
	{
		return hairLength;
	} 
	
	@Override
	public String toString() 
	{
		String className = this.getClass().getSimpleName().toUpperCase();
		return className + "\n" + getPetName() + " " + "Owned By " + getOwnerName() + "\n" + "Color: " + getColor() + "\n" + "Sex: " + getSex() + "\n" + 		"Hair Length: " + gethairLength();
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public void setBoardStart(int month, int day, int year) 
	{
		boardStart = new Date(year, month, day);
	}

	@SuppressWarnings("deprecation")
	@Override
	public void setBoardEnd(int month, int day, int year) 
	{
		boardEnd = new Date(year, month, day);
	}

	@Override
	public boolean boarding(int month, int day, int year)
	{
		@SuppressWarnings("deprecation")
		Date date = new Date(year, month, day);
		if (date.compareTo(boardStart) > 0 && date.compareTo(boardEnd) < 0) 
		{
			return true;
		}
		else return false;
	}
}


