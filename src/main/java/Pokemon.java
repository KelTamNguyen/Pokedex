public class Pokemon 
{
    // this is based on graviton's answer to braindead's question
    // on StackExchange
    // it can be found here at:
    // https://stackoverflow.com/questions/20550651/beginners-java-project-basic-pokedex-using-if-else-statements-suggestions
    
    private String pokeName;
    // String region will likely become a class of its own in the future
    private String region;
    private int dexNumber;
    private String species;
    private String[] type;
    // Habitat will likely be part of the Region object in the future
    private String habitat;
    private String description;
    
    public Pokemon(String pokeName, String region, int dexNumber, String species, 
                    String[] type, String habitat, String description)
    {
        this.pokeName = pokeName;
        this. region = region;
        this.dexNumber = dexNumber;
        this.species = species;
        this.type = type;
        this.habitat = habitat;
        this.description = description;
    }
    
    public String getName()
    {
        return pokeName;
    }
    
    public String getRegion()
    {
        return region;
    }
    
    public int getDexNumber()
    {
        return dexNumber;
    }
    
    public String getSpecies()
    {
        return species;
    }
    
    public String[] getType()
    {
        return type;
    }
    
    public String getHabitat()
    {
        return habitat;
    }
    
    public String getDescription()
    {
        return description;
    }
}
