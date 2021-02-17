import java.util.*;

public class Main {

    public static void main(String[] args) {

        // 1 //

        ArrayList<String> array = new ArrayList<String>();
        array.add("first");
        array.add("first");
        array.add("banana");
        for (int i = 0; i <= array.size()-1; i++) {
            System.out.println(i + " : " + array.get(i));
        }

        // 2 //

        Set<String> set = new HashSet<>();
        set.add("SetFirst");
        set.add("SetFirst");
        set.add("JOJO");
        for (String value : set) {
            System.out.println(value);
        }

        // 3 //

        Map<String, ArrayList<String>> map = new HashMap<>();
        ArrayList<String> mapValueArray = new ArrayList<>();
        mapValueArray.addAll(array);

        map.put("Dat's da key", mapValueArray);

        for (ArrayList<String> value : map.values()) {
            System.out.println(value);
        }

        for (String key : map.keySet()) {
            System.out.println(key);
        }

        for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}