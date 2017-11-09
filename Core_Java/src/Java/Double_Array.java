package Java;

public class Double_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String flights [][]=new String [4][4];
		//first row
		
		flights [0][0]="Dallas";
		flights [0][1]="NYC";
		flights [0][2]="Miami";
		flights [0][3]="Chicago";
		
		//second row
		
		flights [1][0]="Los Angeles";
		flights [1][1]="seatle";
		flights [1][2]="Washington DC";
		flights [1][3]="Newark";
		
		//Third Row
		
		flights [2][0]="NewOrleans";
		flights [2][1]="Baton rouge";
		flights [2][2]="Kansas";
		flights [2][3]="Toronto";
		
		//Fourth row
		
		flights [3][0]="Denvor";
		flights [3][1]="honolulu";
		flights [3][2]="Anchorage";
		flights [3][3]="Houston";
		
		//System.out.println(flights[3][1]);
		//System.out.println(flights [0][2]);
		//System.out.println(flights [2][2]);
		//System.out.println(flights [3][3]);
		
		
		
	
		//String flowers [][]=new String [2][2];
		
		//flowers [0][0]="lily";
		
		//System.out.println(flowers[0][0]);
		
		int rows=flights.length;
		int cols=flights[0].length;
		
		// argument for row
		
		for (int rownum=0; rownum<rows; rownum++) {
		
		// argument for column
			
		for (int colnum=0;colnum<cols;colnum++) {
			
		// argument for printing rows and column 
			
		System.out.println(flights[rownum][colnum]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		}
			
			
			
			
			
		}
		
			
		
		
		
		
		
		
		
		
	}

}
