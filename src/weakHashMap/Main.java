package weakHashMap;

import java.util.*;

public class Main {
	public static void main(String[] args) throws InterruptedException {
        // -- Fill a weak hash map with one entry
        //WeakHashMap<Data, String> map = new WeakHashMap<Data, String>();
		WeakHashMap<String, Data> map = new WeakHashMap<String, Data>();
		//HashMap<Data, String> map = new HashMap<Data, String>();
        Data someDataObject = new Data("foo");
        //map.put(someDataObject, someDataObject.value);
        map.put("data", someDataObject);
        map.clear();
        //System.out.println("map contains someDataObject ? " + map.containsKey(someDataObject));

        // -- now make someDataObject elligible for garbage collection...
        //someDataObject = null;
        
        while (true) {
	        for (int i = 0; i < 10000; i++) {
	            if (map.size() != 0) {
	                System.out.println("At iteration " + i + " the map still holds the reference on someDataObject");
	            } else {
	                System.out.println("somDataObject has finally been garbage collected at iteration " + i + ", hence the map is now empty");
	                break;
	            }
	        }
	        	Thread.sleep(10000);
	        }
    }

    static class Data {
        String value;
        Data(String value) {
            this.value = value;
        }
    }
}
