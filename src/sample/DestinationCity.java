//1436. Destination City

package sample;

import java.util.HashMap;
import java.util.Map;

import java.util.List;

public class DestinationCity {
	public String destCity(String[][] paths) {
		Map<String, String> map = new HashMap<>();
        for (int i = 0; i < paths.length; i++) {
            map.put(paths[i][0], paths[i][1]);
        }
        String destination = paths[0][1];
        while (map.containsKey(destination)) {
            destination = map.get(destination);
        }
        return destination;
    }

	public static void main(String[] args) {
		
		DestinationCity obj = new DestinationCity();
		String[][] paths = {{"B","A"},{"D","E"}};
		String result = obj.destCity(paths);
		System.out.println("Destination city :"+ result);
	}
}




