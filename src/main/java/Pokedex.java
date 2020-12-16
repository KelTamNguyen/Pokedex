import javax.swing.*;
import java.util.ArrayList;

public class Pokedex 
{
    // This is based on StackExchange user braindead's StarterPokedex project.
    // The implementation is specifically inspired by graviton's answer to
    // braindead's question.
    // it can be found here:
    // https://stackoverflow.com/questions/20550651/beginners-java-project-basic-pokedex-using-if-else-statements-suggestions
    private static ArrayList<Pokemon> dex = new ArrayList<Pokemon>();
    private static String choice, pokemon = "", searchBy, region, type, list = "", str = "";
    
    public static void main(String[] args)
    {
        //ArrayList<Pokemon> p = new ArrayList<Pokemon>();
        //String choice, pokemon = "", searchBy, region, type, list = "", str = "";
        
        String[] grassPoisonType = {"Grass", "Poison"};
        String[] fireType = {"Fire"};
        String[] waterType = {"Water"};
        String[] grassType = {"Grass"};
        
        Pokemon bulbasaur = new Pokemon("Bulbasaur", "Kanto", 1, "Seed", 
                                        grassPoisonType, "Grassland", 
                                        "A strange seed was planted on its back at birth");
        dex.add(bulbasaur);
        
        Pokemon charmander = new Pokemon("Charmander", "Kanto", 4, "Lizard", 
                                        fireType, "Mountain", 
                                        "Obviously prefers hot places. When it rains, steam is said to spout from the tip of its tail.");
        dex.add(charmander);
        
        Pokemon squirtle = new Pokemon("Squirtle", "Kanto", 7, "Tiny turtle", 
                                        waterType, "Water's-edge", 
                                        "After birth, its back swells and hardens into a shell. Powerfully sprays foam from its mouth.");
        dex.add(squirtle);
        
        Pokemon chikorita = new Pokemon("Chikorita", "Johto", 152, "Leaf",
                                        grassType, "Grassland",
                                        "A sweet aroma gently wafts from the leaf on its head. It is docile and loves to soak up the sun's rays");
        dex.add(chikorita);
        
        choice = JOptionPane.showInputDialog(null,
            "Do you know the name of the Starter Pokemon you are looking for?"
            + "(Yes/No)", "Welcome to the Pokedex!", 3); 
        
        if (choice.equalsIgnoreCase("yes"))
        {
            pokemon = JOptionPane.showInputDialog(null, 
                    "Enter the name of the Start Pokemon: ",
                    "Welcome to the Pokedex!", JOptionPane.PLAIN_MESSAGE);
        }
        else if (choice.equalsIgnoreCase("no"))
        {
            searchBy = JOptionPane.showInputDialog(null, 
                    "Search by: 'type' or 'region'?",
                    "Welcome to the Pokedex!", 3);
            
            if (searchBy.equalsIgnoreCase("type"))
            {
                type = JOptionPane.showInputDialog(null, 
                        "Enter Pokemon type: (Grass/Fire/Water)", 
                        "Welcome to the Pokedex!",
                        JOptionPane.PLAIN_MESSAGE);
                
                for (int i = 0; i < dex.size(); i++)
                {
                    String[] thisType = dex.get(i).getType();
                    for (String thisType1 : thisType) {
                        if (thisType1.equals(type)) {
                            list = list + dex.get(i).getName() + "\n";
                        }
                    }
                    /*if (dex.get(i).getType().equals(type))
                    {
                    list = list + dex.get(i).getName() + "\n";
                    }*/
                }
                
                pokemon = JOptionPane.showInputDialog(null, list,
                        JOptionPane.PLAIN_MESSAGE);
            }
            
            else if (searchBy.equalsIgnoreCase("region"))
            {
                region = JOptionPane.showInputDialog(null,
                    "Enter region: (Kanto/Johto/Hoenn/Sinnoh/Unova/Kalos/Alola/Galar)",
                    "Welcome to the Starter Pokedex!",
                    JOptionPane.PLAIN_MESSAGE); 
                
                for (int i = 0; i < dex.size(); i++)
                {
                    if (dex.get(i).getRegion().equals(region))
                    {
                        list = list + dex.get(i).getName() + "\n";
                    }
                }
                
                pokemon = JOptionPane.showInputDialog(null, list,
                        JOptionPane.PLAIN_MESSAGE);
            }
        }
        for (int i = 0; i < dex.size(); i++)
        {
            if (dex.get(i).getName().equals(pokemon))
            {
                str = dex.get(i).toString();
            }
        }
        
        //JOptionPane.showMessageDialog(null, str, "Pokedex Results", 1);
    }
}
