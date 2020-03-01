package Assignment6;
/**
 * @author Lakshya
 *
 */
public class Pet {

	private String PetName;
	private String OwnerName;
	private String color;
	protected Integer sex;
	public static final int MALE = 1;
	public static final int FEMALE = 2;
	public static final int SPAYED = 3;
	public static final int NEUTERED = 4;
			
	public Pet(String petname, String ownername, String color) 
	
	{
		this.PetName = petname;
		this.OwnerName = ownername;
		this.color = color;
	}

	public String getPetName()
	
	{
		return this.PetName;
	}

	public String getOwnerName() 

	{
		return this.OwnerName;
	}

	public String getColor() 
	
	{
		return this.color;	
	}

	public String getSex() 
	{	
		String sex = "";
		switch(this.sex) 
		{
			case 1:
				sex = "Male";
				break;
			case 2:
				sex = "Female";
				break;
			case 3:
				sex = "Spayed";
				break;
			case 4:
				sex = "Neutered";
				break;
		default:
				System.out.println("Enter the correct sex for the pet!");
				break;
		}
		return sex;
	}
	
	public void setSex(int id) 
	
	{
		this.sex = id;
	}
	
	@Override
	public String toString() 
	
	{
		return getPetName() + " " + "Owned By " + getOwnerName() + "\n" + "Color: " + getColor() + "\n" + "Sex: " + getSex();
		
	}
}



