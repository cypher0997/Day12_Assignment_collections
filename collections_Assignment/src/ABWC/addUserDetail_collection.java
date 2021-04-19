package ABWC;

import java.util.*;

public class addUserDetail_collection {
    public String FirstName;
    public String LastName;
    public String Address;
    public String City;
    public String State;
    public String Zip;
    public String PhoneNumber;

     /*following method is used ask number of user to be stored*/
    public int numberOfUser() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        return num;
    }

   /*following method is used to take user details*/
   public String[] userInput() {   
    
        String arr[] = new String[7];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter FirstName  : ");
        String firstName = sc.nextLine();
        arr[0] = firstName;
        System.out.print("Enter LastName  : ");
        String lastName = sc.nextLine();
        arr[1] = lastName;
        System.out.print("Enter Address  : ");
        String address = sc.nextLine();
        arr[2] = address;
        System.out.print("Enter City  : ");
        String city = sc.nextLine();
        arr[3] = city;
        System.out.print("Enter State : ");
        String state = sc.nextLine();
        arr[4] = state;
        System.out.print("Enter PhoneNUmber : ");
        String phoneNumber = sc.nextLine();
        arr[5] = phoneNumber;
        System.out.print("Enter Zip : ");
        String zip = sc.nextLine();
        arr[6] = zip;
        return arr;
    }   

   /*following method will set the user details to proper filed*/
   public void setName() {
        String res[] = userInput();
        this.FirstName = res[0];
        this.LastName = res[1];
        this.Address = res[2];
        this.City = res[3];
        this.State = res[4];
        this.Zip = res[5];
        this.PhoneNumber = res[6];
   }

   /*this method is main execution sequence */
    public List<List> ret() {
        int count = 0;
        List<List> det = new ArrayList<List>();
        int numberOfUser = numberOfUser();
        for(int i = 0;i<numberOfUser;i++) {

        System.out.println("enter th detail of user:"+i);
        setName();
        List<String> take = new ArrayList<String>();
        while(true) {
           take.add(count,FirstName);
           take.add(count++,LastName);
           take.add(count++,Address);
           take.add(count++,City);
           take.add(count++,State);
           take.add(count++,PhoneNumber);
           take.add(count++,Zip);
           count = 0;
           break;
       }
       det.add(i,take);
    }
     return (det);
  }
  

}