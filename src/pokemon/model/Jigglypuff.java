package pokemon.model;

public class Jigglypuff extends Pokemon implements Fairy
{
	public Jigglypuff(int number, String name)
	{
		super(number, name);
	}
	
	public boolean isCute()
	{
		return true;
	}
	
	public String spell()
	{
		return "casted";
	}
}
