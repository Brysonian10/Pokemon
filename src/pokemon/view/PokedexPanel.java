package pokemon.view;
import javax.swing.*;
import pokemon.controller.PokedexController;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PokedexPanel extends JPanel
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
		
		setupLayout();
		setupListeners();
		setupPanel();
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{

	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.setPreferredSize(new Dimension(800, 600));
		this.setBackground(Color.GREEN);
		this.add(description);
		this.add(type);
		this.add(name);
		this.add(attacks);
	}
}
