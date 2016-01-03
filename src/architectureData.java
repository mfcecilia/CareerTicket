/**
 * Manages hashmap data
 * @author Mykayla Fernandes
 * @version 2016.01.02
 */

public class architectureData extends architecture {
	
	private int key;
    private String title;
    private String description;
    
    public architectureData(int key, String title, String description){
        this.key = key;
        this.title = title;
        this.description = description;
    }
    
    public int getKey() {
        return key;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getDescription() {
        return description;
    }
    
    @Override
    public String toString() {
        return "TITLE: " + title + " DESCRIPTION: " + description + "";
    }

}
