import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Collections {

    List<User> formNewListWithoutRepetitions(List<User> list1, List<User> list2) {

        List<User> resultArray = new ArrayList<User>();
        resultArray.addAll(list1);

        for (int i = 0; i < resultArray.size(); i++) {
            for (int j = i+1; j < resultArray.size(); i++) {
                if (resultArray.get(i).equals(resultArray.get(j))) {
                    resultArray.remove(resultArray.get(j));
                }
            }
        }
        resultArray.retainAll(list2);

        return resultArray;
    }

    Set<User> formSetFromLists(Set<User> set1, Set<User> set2) {

        Set<User> resultSet = new HashSet<User>(set1);

        resultSet.addAll(set1);
        resultSet.retainAll(set2);
        return resultSet;
    }

    //        // 1 //
//
//        List<String> array = new ArrayList<String>();
//        array.add("first");
//        array.add("first");
//        array.add("banana");
//        for (int i = 0; i <= array.size()-1; i++) {
//            System.out.println(i + " : " + array.get(i));
//        }
//
//        // 2 //
//
//        Set<String> set = new HashSet<>();
//        set.add("SetFirst");
//        set.add("SetFirst");
//        set.add("JOJO");
//        for (String value : set) {
//            System.out.println(value);
//        }
//
//        // 3 //
//
//        Map<String, ArrayList<String>> map = new HashMap<>();
//        ArrayList<String> mapValueArray = new ArrayList<>();
//        mapValueArray.addAll(array);
//
//        map.put("Dat's da key", mapValueArray);
//
//        for (ArrayList<String> value : map.values()) {
//            System.out.println(value);
//        }
//
//        for (String key : map.keySet()) {
//            System.out.println(key);
//        }
//
//        for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }

}
