package ABWC;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class multipleAddressBook {

    public void createMultipleAB() {
        int Count = 2;
        System.out.println("dictionary contains:"+" "+Count+" "+"addressbooks");
        Map<Integer,List<List>> MAB = new HashMap<Integer,List<List>>();
        addUserDetail_collection mult = new addUserDetail_collection();
        for(int i = 0;i<Count;i++) {
            System.out.println("u are in addressbook number :"+" "+i);
             MAB.put(i, new ArrayList<List>(mult.ret()));
        }
        System.out.println(MAB);
    }
    
}
