package pokemon.model;

public class Piplup extends Pokemon implements Water
{
	public Piplup (int number, String name)
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
