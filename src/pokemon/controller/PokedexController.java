package pokemon.controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;

import pokemon.model.*;

public class PokedexController
{
	private ArrayList<Pokemon> pokemonList;
	private PokedexFrame appFrame;
	
	public PokedexController()
	{
		pokemonList = new ArrayList<Pokemon>();
		addPokemon();
		appFrame - new PokedexFrame(this);
	}
	
	private void adddPokemon()
	{
		pokemonList.add(new Eevee());
		pokemonList.add(new Snorlax());
		pokemonList.add(new Magikarp());
		pokemonList.add(new Piplup());
		pokemonList.add(new Jigglypuff());
	}
	
	public void start()
	{
		
	}
	
	public ArrayList<Pokemon> getPokemonList()
	{
		
	}
}
