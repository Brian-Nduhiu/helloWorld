package arrayLists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    public static void arrayLists(){
        List<Integer> myArrayList = new ArrayList<>(4);
        for (int i = 1; i <= 4; i++){
            myArrayList.add(i+(i*3));
        }
        System.out.print(myArrayList);
        System.out.println();
    }
}
