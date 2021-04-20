// package ABC;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class multipleAddressBook {

    Map<Integer,List<List>> MAB = new HashMap<Integer,List<List>>();
    public void createMultipleAB() {
        int Count = 2;
        System.out.println("dictionary contains:"+" "+Count+" "+"addressbooks");
        addUserDetail_collection mult = new addUserDetail_collection();
        for(int i = 0;i<Count;i++) {
            System.out.println("u are in addressbook number :"+" "+i);
             MAB.put(i, new ArrayList<List>(mult.ret()));
        }
    }
    public void display(){ 
        for(int i = 0;i<MAB.size();i++) {
            for(int j = 0;j<MAB.get(i).size();j++) {
                //here we use get(3) because the index of city is 3
                if(((MAB.get(i)).get(j)).get(3).equals("jaipur")) {
                    System.out.println((MAB.get(i)).get(j));
                }
            }
    }

    }
}