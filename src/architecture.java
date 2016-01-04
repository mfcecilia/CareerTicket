import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * This class contains all architecture related information
 * Contains methods which allow the user to isolate specific years of study.
 * @author Mykayla Fernandes
 * @version 2016.01.02
 */
public class architecture extends mf {
	
	/**
	 * gets first year architecture project info by utilizing a hashmap
	 */
	public void firstYear() {
		System.out.println("2011-2012");
		
		Map<Integer,architectureData> archMap1 = new HashMap<Integer, architectureData>();
	    
		architectureData project1= new architectureData(1,"Sweettrees", "Naef Competition - "
	    		+ "a competition given by a Swiss toy company called Naef. The prompt was to create a "
	    		+ "wooden toy for children");
	    
	    architectureData project2= new architectureData(2,"Spatial Construct", 
	    		"Design a cube that is both open and closed");
	    
	  //adding values to map
	    archMap1.put(project1.getKey(), project1);
	    archMap1.put(project2.getKey(), project2);
	    
	  //retrieving values from map
	    Set<Integer> keySet = archMap1.keySet();
	    for(int i: keySet){
	        System.out.println(archMap1.get(i));
	    }
	    
	  //searching key on map
	    //System.out.println(archMap1.containsKey(project1.getKey()));
	  //searching value on map
	    //System.out.println(archMap1.containsValue(project1));
	}
	
	/**
	 * gets second year architecture project info
	 */
	public void secondYear() {
		System.out.println("2012-2013");
		
		Map<Integer,architectureData> archMap2 = new HashMap<Integer, architectureData>();
	    
		architectureData project1= new architectureData(1,"Oregon Building", 
				"Located in Oregon, this building houses"
				+ " a diving pool, a stillness pool, and a lap pool");
	    
	    architectureData project2= new architectureData(2,"Map Collection Archive", 
	    		"Located in downtown Roanoke, VA this building has an auditorium, "
	    		+ "a collection of maps, an office, and a room for a ping pong table");
	    
	    architectureData project3= new architectureData(3,"House for a LandCaring Family", 
	    		"Located in Blacksburg, VA this home is a live-work space for a family "
	    		+ "that owns a land caring business");
	    
	    architectureData project4= new architectureData(4,"Cherry Blossom Festival D.C. "
	    		+ "Smithsonian Interactive Lantern Installation", 
	    		"An Interactive light and sound installation in the courtyard of the "
	    		+ "Smithsonion, sensor allow for the colors and sounds to change as more "
	    		+ "people populate the space.");
	    
	    architectureData project5= new architectureData(5,"Mountain Shelter", 
	    		"This is for a second year competition challenging students to design a shelter "
	    		+ "at along the Appalation Trail.");
	    
	  //adding values to map
	    archMap2.put(project1.getKey(), project1);
	    archMap2.put(project2.getKey(), project2);
	    archMap2.put(project3.getKey(), project3);
	    archMap2.put(project4.getKey(), project4);
	    archMap2.put(project5.getKey(), project5);
	    
	  //retrieving values from map
	    Set<Integer> keySet = archMap2.keySet();
	    for(int i: keySet){
	        System.out.println(archMap2.get(i));
	    }
	    
	  //searching key on map
	    //System.out.println(archMap2.containsKey(project1.getKey()));
	  //searching value on map
	    //System.out.println(archMap2.containsValue(project1));
		
	}
	
	/**
	 * gets third year architecture project info
	 */
	public void thirdYear() {
		System.out.println("2013-2014");
	}
	
	/**
	 * gets fourth year architecture project info
	 */
	public void fourthYear() {
		System.out.println("2014-2015");
	}
	
	/**
	 * gets fifth year architecture project info
	 */
	public void fifthYear() {
		System.out.println("2015-2016");
	}

}
