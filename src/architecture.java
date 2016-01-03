import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * This class contains all architecture related information.
 * @author Mykayla Fernandes
 * @version 2016.01.02
 */
public class architecture extends mf {
	
	/**
	 * gets first year architecture project info by utilizing a hashmap
	 */
	public void firstYear() {
		System.out.println("2011");
		
		Map<Integer,architectureData> map = new HashMap<Integer, architectureData>();
	    architectureData project1= new architectureData(1,"Sweettrees", "Naef Competition - "
	    		+ "a competition given by a Swiss toy company called Naef. The prompt was to create a "
	    		+ "wooden toy for children");
	    
	  //adding values to map
	    map.put(project1.getKey(), project1);
	    
	  //retrieving values from map
	    Set<Integer> keySet= map.keySet();
	    for(int i:keySet){
	        System.out.println(map.get(i));
	    }
	    
	  //searching key on map
	    System.out.println(map.containsKey(project1.getKey()));
	    //searching value on map
	    System.out.println(map.containsValue(project1));
	}
	
	/**
	 * gets second year architecture project info
	 */
	public void secondYear() {
		System.out.println("2012");
		
	}
	
	/**
	 * gets third year architecture project info
	 */
	public void thirdYear() {
		System.out.println("2013");
	}
	
	/**
	 * gets fourth year architecture project info
	 */
	public void fourthYear() {
		System.out.println("2014");
	}
	
	/**
	 * gets fifth year architecture project info
	 */
	public void fifthYear() {
		System.out.println("2015");
	}

}
