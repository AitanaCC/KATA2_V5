package kata2_v5;

import java.util.Iterator;
import java.util.Map;

public class KATA2_V5 {

    public static void main(String[] args) {
        
        Integer [] data = {1, 2, 9, 8, 6, 3, 7, 1, 8, 1, 2, 7, 8, 6, 7};
        String [] data2 = {"Rosa", "Pepe", "Maria", "Pepe", "Pepe", "Rosa", "Carlos", "Carla", "Pepe", "Mario"};
        
        Histogram meta_histogram = new Histogram(data2);
        
        Map<Integer, Integer> histogram =  meta_histogram.getHistogram();
        
        Iterator<Map.Entry<Integer, Integer>> entries = histogram.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<Integer, Integer> entry = entries.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        } 
    }
}
