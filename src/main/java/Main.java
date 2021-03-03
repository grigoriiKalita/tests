import java.util.*;

public class Main {

    public static void main(String[] args) {

        Collections collections = new Collections();

        Set<User> user1 = new HashSet<>();
        Set<User> user2 = new HashSet<>();

        User bob = new User("Bob", 1);
        User bob2 = new User("Bob", 1);
        User mark = new User("Bob", 1);
        User mark2 = new User("Mark", 1);

        user1.add(bob);
        user1.add(bob2);

        user2.add(mark);
        user2.add(mark2);

        // 1 //

        List<User> array = new ArrayList<User>();
        array.add(bob);
        array.add(bob2);
        array.add(mark);
        array.add(mark2);
        for (int i = 0; i <= array.size()-1; i++) {
            System.out.println(i + " : " + array.get(i));
        }

        // 2 //

        Set<User> set = new HashSet<>();
        set.add(bob);
        set.add(bob2);
        set.add(mark);
        set.add(mark2);
        for (User value : set) {
            System.out.println(value);
        }

        // 3 //


        Map<String, ArrayList<User>> map = new HashMap<>();
        ArrayList<User> mapValueArray = new ArrayList<>();
        mapValueArray.addAll(array);

        map.put("Dat's da key", mapValueArray);
        map.put("Dat's da key", mapValueArray);
        map.put("Dat's da key2", mapValueArray);


        for (ArrayList<User> value : map.values()) {
            System.out.println(value);
        }

        for (String key : map.keySet()) {
            System.out.println(key);
        }

        for (Map.Entry<String, ArrayList<User>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}