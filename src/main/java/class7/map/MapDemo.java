package class7.map;

import javax.lang.model.element.Name;
import java.util.HashMap;
import java.util.Objects;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<String, Object> capitalCities= new HashMap();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.print(capitalCities);
        System.out.println(" ");
        System.out.println("::::::");
        //using for each loop

        for(String c: capitalCities.keySet()){
            System.out.println(c);
        }

        System.out.println(capitalCities.get("USA"));
        //remove
        capitalCities.remove("Norway");
        System.out.println(capitalCities);
    }
}
