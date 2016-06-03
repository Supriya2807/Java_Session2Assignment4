package acadgild.assignments;

public class session2assign4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int month=9;
		
		switch(month){
		
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:System.out.println("The month of "+month+" has 31 days!");
                break;
                
		case 2: System.out.println("The month of "+month+" has 28 days!");
		        break;
		        
		case 4:
		case 6:
		case 9:
		case 11:System.out.println("The month of "+month+" has 30 days!");
				break;
		}
	}

}
