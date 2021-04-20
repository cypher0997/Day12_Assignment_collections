import java.util.*;
public class city_state_Person {
    Map<String,List<List>> MAB = new HashMap<String,List<List>>();
    addUserDetail_collection mult = new addUserDetail_collection();
    public void view() {
       MAB.put("Jaipur", new ArrayList<List>(mult.ret())); 
       MAB.put("jaisalmer", new ArrayList<List>(mult.ret()));
       MAB.put("Amer", new ArrayList<List>(mult.ret()));
       MAB.put("Udaipur", new ArrayList<List>(mult.ret()));
       System.out.println("enter the city u want to search for");
      Scanner sc = new Scanner(System.in);
      String val = sc.nextLine(); 
       if(MAB.get(val) != null) {
            System.out.println(MAB.get(val));
       }
       else {
        System.out.println("give valid input");
       }
    }    
}
