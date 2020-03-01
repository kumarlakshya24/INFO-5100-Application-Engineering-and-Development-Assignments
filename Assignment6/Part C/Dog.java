package Assignment6;
import java.util.*;
/**
 * @author Lakshya
 *
 */
public class Dog extends Pet implements Boardable {

	private String size; 	
	private Date boardStart;
	private Date boardEnd;
	
	Dog (String name, String ownerName, String color, String size) 
	{
		super(name, ownerName, color);
		this.size = size;
	} 
	
	public String getSize() 
	{
		return size;
	} 
	
	public String toString() 
	{
		String className = this.getClass().getSimpleName().toUpperCase();
		return className + "\n" + getPetName() + " " + "Owned By " + getOwnerName() + "\n" + "Color: " + getColor() + "\n" + "Sex: " + getSex() + "\n" + 		
				"Size: " +getSize();
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public void setBoardStart(int month, int day, int year) {
		boardStart = new Date(year, month, day);
		
	}

	@SuppressWarnings("deprecation")
	@Override
	public void setBoardEnd(int month, int day, int year) {
		boardEnd = new Date(year, month, day);
	}

	@Override
	public boolean boarding(int month, int day, int year) {
		@SuppressWarnings("deprecation")
		Date date = new Date(year, month, day);
		if (date.compareTo(boardStart) > 0 && date.compareTo(boardEnd) < 0) 
		{
			return true;
		}
		else return false;
	}
}
