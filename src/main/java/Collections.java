import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Collections {

    List<String> formNewListWithoutRepetitions(List<String> list1, List<String> list2) {
        List<String> resultArray = new ArrayList<String>();

        for (String valueOfList1 : list1) {
            boolean isDuplicate = false;
            for (String valueOfList2 : list2) {
                if (valueOfList1.equals(valueOfList2)) {
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate) {
                resultArray.add(valueOfList1);
            }
        }
        return resultArray;
    }

    Set<String> formSetFromLists(List<String> list1, List<String> list2) {
        Set<String> resultSet = new HashSet<>(list1);
        resultSet.retainAll(list2);
        return resultSet;
    }

}
