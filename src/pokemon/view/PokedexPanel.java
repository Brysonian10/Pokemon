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
	//buttons
	private JButton changeButton;
	private JComboBox pokedexDropdown;
	//text fields
	private JTextField attackField;
	private JTextField numberField;
	private JTextField evolveField;
	private JTextField nameField;
	private JTextField enhancementField;
	private JTextField healthField;
	//labels
	private JLabel numberLabel;
	private JLabel healthLabel;
	private JLabel nameLabel;
	private JLabel evolveLabel;
	private JLabel attackLabel;
	private JLabel enhanceLabel;
	private JLabel imageLabel;
	
	public PokedexPanel(PokedexController appController)
	{
		super();
		this.appController = appController;
		appLayout = new SpringLayout();
		
		changeButton = new JButton("click here to change the pokevalues");
		
		numberField = new JTextField("0");
		attackField = new JTextField("0");
		evolveField = new JTextField("false");
		nameField = new JTextField("My pokemon");
		enhancementField = new JTextField("0");
		healthField = new JTextField("0");
		
		healthLabel = new JLabel("Your Pokemon's health is: ");
		numberLabel = new JLabel("This Pokemon number is ");
		nameLabel = new JLabel("Your Pokemon's name is: ");
		evolveLabel = new JLabel("Your Pokemon can evolve too: ");
		attackLabel = new JLabel("Your Pokemon's attack is: ");
		enhanceLabel = new JLabel("Your Pokemon's enhancement level is: ");
		imageLabel = new JLabel("pokemon goes here");
		
		pokedexDropdown = new JComboBox(); //stub
		
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
