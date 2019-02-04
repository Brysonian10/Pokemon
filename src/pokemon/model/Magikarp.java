package pokemon.model;

public class Magikarp extends Pokemon implements Water
{
	public Magikarp(int number, String name)
	{
		super(number, name);
	}
	
	public void spray()
	{
		
	}
	
	public boolean isWet()
	{
		return true;
	}
}
