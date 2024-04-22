import java.util.*;

public class Main
{
    Scanner sc = new scanner(System.in);
    
    public static void booking(Passenger p){
        
    Details d = new Details();
    if(p.VehicleName == "car" && d.low>0){
        
        
    }
    else if(p.VehicleName == "bike" && d.midle>0){
        
    }
    else if(p.VehicleName == "bus" && upper>0){
        
        
    }
    else{
        System.out.println("No slot is available");
    }
        
    }
	public static void main(String[] args) {
	
	while(true){
	    System.out.println("Enter the choice 1. book  2. return 3. print");
	    
	    int choice = sc.nextInt();
	    
	    switch(choice){
	        case 1:{
	            System.out.println("Enter the name");
	            String name = sc.next();
	            
	            System.out.println("Enter the number plate");
	            String No_plate = sc.next();
	            
	            System.out.println("Enter the vehicle name");
	            String V_name = sc.next();
	            
	            Passenger p =  new Passenger(name, No_plate, V_name);
	            booking(p);
	            
	            break;
	        }
	        case 2:{
	            break;
	        }
	        case 3:{
	            break;
	        }
	    }
	}
		
	}
}

import java.util.*;

public class Passenger{
    static int id=1;
    int c_Id=;
    String name;
    String VehicleName;
    String NumberPlate;
    //String slotPrefer;
    
    public Passenger(String name, String VehicleName, String NumberPlate){
        c_Id = id++;
        this.name = name;
        this.VehicleName = VehicleName;
        this. NumberPlate = NumberPlate;
    }
}

import java.util.*;

public class Details{
    
    static int low =5;
    static int middle =5;
    static int upper = 5;
    
    ArrayList<String> name_list = new ArrayList<>();
    ArrayList<Integer> id_list = new ArrayList<>();
    
    public static addDetails(){
        
    }
}





