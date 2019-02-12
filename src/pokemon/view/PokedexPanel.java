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
	private JComboBox<String> pokedexDropdown;
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
		this.appLayout = new SpringLayout();
		
		changeButton = new JButton("click here to change the pokevalues");
		appLayout.putConstraint(SpringLayout.WEST, changeButton, 0, SpringLayout.WEST, this);
		numberField = new JTextField("0");
		appLayout.putConstraint(SpringLayout.NORTH, numberField, 71, SpringLayout.NORTH, this);
		attackField = new JTextField("0");
		evolveField = new JTextField("false");
		nameField = new JTextField("My pokemon");
		enhancementField = new JTextField("0");
		healthField = new JTextField("0");
		healthLabel = new JLabel("Your Pokemon's health is: ");
		appLayout.putConstraint(SpringLayout.NORTH, changeButton, -5, SpringLayout.NORTH, healthLabel);
		numberLabel = new JLabel("This Pokemon number is ");
		appLayout.putConstraint(SpringLayout.NORTH, numberLabel, 26, SpringLayout.SOUTH, healthLabel);
		nameLabel = new JLabel("Your Pokemon's name is: ");
		evolveLabel = new JLabel("Your Pokemon can evolve too: ");
		attackLabel = new JLabel("Your Pokemon's attack is: ");
		enhanceLabel = new JLabel("Your Pokemon's enhancement level is: ");
		imageLabel = new JLabel("pokemon goes here");
		pokedexDropdown = new JComboBox<String>();
		appLayout.putConstraint(SpringLayout.NORTH, pokedexDropdown, -4, SpringLayout.NORTH, attackLabel);
		
		setupLayout();
		setupListeners();
		setupPanel();
		setupDropdown();
		
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.NORTH, enhanceLabel, 5, SpringLayout.NORTH, enhancementField);
		appLayout.putConstraint(SpringLayout.EAST, enhanceLabel, -83, SpringLayout.WEST, enhancementField);
		appLayout.putConstraint(SpringLayout.NORTH, attackLabel, 5, SpringLayout.NORTH, attackField);
		appLayout.putConstraint(SpringLayout.EAST, attackLabel, -86, SpringLayout.WEST, attackField);
		appLayout.putConstraint(SpringLayout.NORTH, evolveLabel, 22, SpringLayout.SOUTH, numberLabel);
		appLayout.putConstraint(SpringLayout.EAST, numberLabel, 0, SpringLayout.EAST, evolveLabel);
		appLayout.putConstraint(SpringLayout.NORTH, evolveField, -5, SpringLayout.NORTH, evolveLabel);
		appLayout.putConstraint(SpringLayout.EAST, evolveLabel, -183, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, nameLabel, 6, SpringLayout.NORTH, nameField);
		appLayout.putConstraint(SpringLayout.EAST, nameLabel, 0, SpringLayout.EAST, healthLabel);
		appLayout.putConstraint(SpringLayout.NORTH, healthLabel, 5, SpringLayout.NORTH, healthField);
		appLayout.putConstraint(SpringLayout.EAST, healthLabel, -103, SpringLayout.WEST, healthField);
		appLayout.putConstraint(SpringLayout.SOUTH, healthField, -16, SpringLayout.NORTH, numberField);
		appLayout.putConstraint(SpringLayout.EAST, attackField, 0, SpringLayout.EAST, healthField);
		appLayout.putConstraint(SpringLayout.EAST, enhancementField, 0, SpringLayout.EAST, healthField);
		appLayout.putConstraint(SpringLayout.EAST, healthField, -76, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.EAST, evolveField, 0, SpringLayout.EAST, healthField);
		appLayout.putConstraint(SpringLayout.EAST, numberField, 0, SpringLayout.EAST, healthField);
		appLayout.putConstraint(SpringLayout.NORTH, enhancementField, 7, SpringLayout.SOUTH, evolveField);
		appLayout.putConstraint(SpringLayout.NORTH, attackField, 12, SpringLayout.SOUTH, enhancementField);
		appLayout.putConstraint(SpringLayout.NORTH, nameField, -128, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.WEST, nameField, -174, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, nameField, -99, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, nameField, -71, SpringLayout.EAST, this);
		
	}
	
	private void setupListeners()
	{
		changeButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				//stuff goes here when pressed
			}
		});
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.add(changeButton);
		this.add(healthLabel);
		this.add(numberLabel);
		this.add(evolveLabel);
		this.add(attackLabel);
		this.add(enhanceLabel);
		this.add(nameLabel);
		this.add(healthField);
		imageLabel = new JLabel("pokemon goes here");
		appLayout.putConstraint(SpringLayout.WEST, pokedexDropdown, 0, SpringLayout.WEST, imageLabel);
		appLayout.putConstraint(SpringLayout.NORTH, imageLabel, 0, SpringLayout.NORTH, evolveLabel);
		appLayout.putConstraint(SpringLayout.WEST, imageLabel, 10, SpringLayout.WEST, this);
		this.add(imageLabel);
		this.add(numberField);
		this.add(attackField);
		this.add(evolveField);
		this.add(nameField);
		this.add(enhancementField);
		this.add(pokedexDropdown);
		
	}
	
	private void setupDropdown()
	{
		DefaultComboBoxModel<String> temp = new DefaultComboBoxModel<String>(app.buldPokedexText());
		pokedexDropdown.setModel(temp);
	}
	
}
