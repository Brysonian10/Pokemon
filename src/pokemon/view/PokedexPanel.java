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
	
	private ImageIcon pokemonIcon;
	
	public PokedexPanel(PokedexController appController)
	{
		super();
		this.appController = appController;
		this.appLayout = new SpringLayout();
		
		this.pokemonIcon = new ImageIcon(getClass().getResource("/pokemon/view/images/eveee.png"));
		
		changeButton = new JButton("click here to change the pokevalues");
		appLayout.putConstraint(SpringLayout.WEST, changeButton, 0, SpringLayout.WEST, this);
		numberField = new JTextField("0");
		appLayout.putConstraint(SpringLayout.NORTH, numberField, 71, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, numberField, -76, SpringLayout.EAST, this);
		attackField = new JTextField("0");
		appLayout.putConstraint(SpringLayout.EAST, attackField, -76, SpringLayout.EAST, this);
		evolveField = new JTextField("false");
		appLayout.putConstraint(SpringLayout.EAST, evolveField, -76, SpringLayout.EAST, this);
		nameField = new JTextField("My pokemon");
		enhancementField = new JTextField("0");
		appLayout.putConstraint(SpringLayout.NORTH, attackField, 12, SpringLayout.SOUTH, enhancementField);
		appLayout.putConstraint(SpringLayout.EAST, enhancementField, -76, SpringLayout.EAST, this);
		healthField = new JTextField("0");
		appLayout.putConstraint(SpringLayout.WEST, attackField, 0, SpringLayout.WEST, healthField);
		appLayout.putConstraint(SpringLayout.WEST, enhancementField, 0, SpringLayout.WEST, healthField);
		appLayout.putConstraint(SpringLayout.SOUTH, healthField, -16, SpringLayout.NORTH, numberField);
		appLayout.putConstraint(SpringLayout.WEST, numberField, 0, SpringLayout.WEST, healthField);
		appLayout.putConstraint(SpringLayout.WEST, healthField, 0, SpringLayout.WEST, evolveField);
		healthLabel = new JLabel("Your Pokemon's health is: ");
		appLayout.putConstraint(SpringLayout.EAST, healthLabel, -81, SpringLayout.WEST, healthField);
		appLayout.putConstraint(SpringLayout.NORTH, changeButton, -5, SpringLayout.NORTH, healthLabel);
		numberLabel = new JLabel("This Pokemon number is ");
		appLayout.putConstraint(SpringLayout.NORTH, numberLabel, 76, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, healthLabel, -26, SpringLayout.NORTH, numberLabel);
		nameLabel = new JLabel("Your Pokemon's name is: ");
		evolveLabel = new JLabel("Your Pokemon can evolve too: ");
		attackLabel = new JLabel("Your Pokemon's attack is: ");
		appLayout.putConstraint(SpringLayout.EAST, attackLabel, -64, SpringLayout.WEST, attackField);
		enhanceLabel = new JLabel("Your Pokemon's enhancement level is: ");
		appLayout.putConstraint(SpringLayout.NORTH, attackLabel, 22, SpringLayout.SOUTH, enhanceLabel);
		appLayout.putConstraint(SpringLayout.NORTH, enhanceLabel, 17, SpringLayout.SOUTH, evolveLabel);
		appLayout.putConstraint(SpringLayout.EAST, enhanceLabel, -61, SpringLayout.WEST, enhancementField);
		imageLabel = new JLabel("pokemon goes here", pokemonIcon, JLabel.CENTER);
		appLayout.putConstraint(SpringLayout.SOUTH, imageLabel, -59, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, imageLabel, -105, SpringLayout.WEST, nameLabel);
		pokedexDropdown = new JComboBox<String>();
		appLayout.putConstraint(SpringLayout.NORTH, pokedexDropdown, 99, SpringLayout.SOUTH, changeButton);
		appLayout.putConstraint(SpringLayout.WEST, pokedexDropdown, 42, SpringLayout.WEST, this);
		
		setupLayout();
		setupListeners();
		setupPanel();
		setupDropdown();
		
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.NORTH, evolveLabel, 22, SpringLayout.SOUTH, numberLabel);
		appLayout.putConstraint(SpringLayout.EAST, numberLabel, 0, SpringLayout.EAST, evolveLabel);
		appLayout.putConstraint(SpringLayout.NORTH, evolveField, -5, SpringLayout.NORTH, evolveLabel);
		appLayout.putConstraint(SpringLayout.EAST, evolveLabel, -183, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, nameLabel, 6, SpringLayout.NORTH, nameField);
		appLayout.putConstraint(SpringLayout.EAST, nameLabel, 0, SpringLayout.EAST, healthLabel);
		appLayout.putConstraint(SpringLayout.EAST, healthField, -76, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, enhancementField, 7, SpringLayout.SOUTH, evolveField);
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
				sendDataToController();
			}
		});
		
		pokedexDropdown.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				String name = pokedexDropdown.getSelectedItem().toString();
				changeImageDisplay(name);
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
		this.add(numberField);
		this.add(attackField);
		this.add(evolveField);
		this.add(nameField);
		this.add(enhancementField);
		this.add(pokedexDropdown);
		this.add(imageLabel);
		imageLabel.setVerticalTextPosition(JLabel.BOTTOM);
		imageLabel.setHorizontalTextPosition(JLabel.CENTER);
		
	}
	
	private void setupDropdown()
	{
		DefaultComboBoxModel<String> temp = new DefaultComboBoxModel<String>(appController.buildPokedexText());
		pokedexDropdown.setModel(temp);
	}
	
	private void sendDataToController()
	{
		int index = pokedexDropdown.getSelectedIndex();
		
		if(appController.isInt(attackField.getText()) && appController.isDouble(enhancementField.getText()) && appController.isInt(healthField.getText()))
		{
			String [] data = new String[5];
			
			//insert code here
			data[0] = attackField.getText();
			data[1] = enhancementField.getText();
			data[2] = healthField.getText();
			data[3] = evolveField.getText();
			data[4] = nameField.getText();
			appController.updatePokemon(index, data);
		}
		
	}
	
	public void changeImageDisplay(String name)
	{
		String path = "/pokemon/view/images/";
		String defaultName = "eveee";
		String extension = ".png";
		try
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + name.toLowerCase() + extension));
		}
		catch (NullPointerException missingFile)
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + defaultName + extension));
		}
		imageLabel.setIcon(pokemonIcon);
		repaint();
	}
	
	
	
}
