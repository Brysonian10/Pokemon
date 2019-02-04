package pokemon.view;
import javax.swing.*;
import pokemon.controller.PokedexController;
import java.awt.*;


public class PokedexPanel
{
	private PokedexController appController;
	private SpringLayout appLayout;
	private JTextField description;
	private JTextField attacks;
	private JLabel type;
	private JLabel name;
	
	public PokedexPanel(PokedexController appController)
	{
		super();
		this.appController = appController;
		appLayout = new SpringLayout();
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
	
	private void setupPanel()
	{
		
	}
}
