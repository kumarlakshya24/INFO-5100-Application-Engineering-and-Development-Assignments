package Assignment6;
import java.util.*;
/**
 * @author Lakshya
 *
 */
public class Mreview implements Comparable<Mreview>{
	private String title;
	private ArrayList <Integer> ratings;
	
	public Mreview() 
	{
	this.title = "";
	this.ratings = new ArrayList<Integer>();
	}

	public Mreview(String ttl) 
	{
	this.title = ttl;
	this.ratings = new ArrayList<Integer>();
	}

	public Mreview (String ttl, int firstRating)
	{
	this.title = ttl;
	this.ratings = new ArrayList<Integer>();
	this.ratings.add(firstRating);
	}

	/*
	 * public ArrayList <Integer> getRatings() { return ratings; }
	 * 
	 * public void setRatings(ArrayList <Integer> ratings) { this.ratings = ratings;
	 * }
	 */

	public String getTitle() 
	{
	return title;
	}

	public void addRating(int r) 
	{
	ratings.add(r);
	}

	public double aveRating() 
	{
		double aveRating = 0;
		double avR = 0;
		int size = ratings.size();
		for (int r = 0; r < size; r++) 
		{
			avR += ratings.get(r);
		}
		aveRating = avR/size;
		return aveRating;
	}

	public double numRating() 
	{
		double numRating = ratings.size();
		return numRating;	
	}

	@Override
	public int compareTo(Mreview obj) 
	{
		// TODO Auto-generated method stub
		return title.compareTo(obj.title);
	}

	@Override
	public boolean equals(Object o) 
	{
		//Casting into Mreview object
		Mreview m = (Mreview) o;  
		if(this.title!=m.title)
	{
		return false;
	}
	
	return true;
	}

	@Override
	public String toString() 
	{
	
		return getTitle() + " - " + "The average rating is : " + " " + String.format("%.2f", aveRating()) + " " + "based on " + (int)numRating() + " ratings";
	
	}
}
