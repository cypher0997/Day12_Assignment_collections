import java.util.*;
public class city_state_Person {
    Map<String,List<List>> MAB = new HashMap<String,List<List>>();
    addUserDetail_collection mult = new addUserDetail_collection();
    public void view() {
        System.out.println("you are in Jaipur city colom, please enter the details of all the persons belongs to Jaipur");
       MAB.put("Jaipur", new ArrayList<List>(mult.ret())); 
       System.out.println("you are in Jaisalmer city colom, please enter the details of all the persons belongs to Jaialmer");
       MAB.put("Jaisalmer", new ArrayList<List>(mult.ret()));
       System.out.println("you are in Amer city colom, please enter the details of all the persons belongs to Amer");
       MAB.put("Amer", new ArrayList<List>(mult.ret()));
       System.out.println("you are in Udaiput city colom, please enter the details of all the persons belongs to Udair");
       MAB.put("Udaipur", new ArrayList<List>(mult.ret()));
       System.out.println("enter the city u want to search for");
      Scanner sc = new Scanner(System.in);
      String val = sc.nextLine(); 
       if(MAB.get(val) != null) {
            System.out.println(MAB.get(val));
       }
       else {
        System.out.println("give valid input , there not exist "+ val +"city in storage");
       }
    }    
}
