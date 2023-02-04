package Electricity;

import java.util.Scanner;


public class Electricity {
	public static int calculateBill(int units)
    {
 
       
        if (units <= 100) {
            return units * 10;
        }
        else if (units <= 200) {
            return (100 * 10)
                + (units - 100)
                      * 15;
        }
        else if (units <= 300) {
            return (100 * 10)
                + (100 * 15)
                + (units - 200)
                      * 20;
        }
        else if (units > 300) {
            return (100 * 10)
                + (100 * 15)
                + (100 * 20)
                + (units - 300)
                      * 25;
        }
        return 0;
}

	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter the Bill Unit");
			int i=sc.nextInt();
	 
	        System.out.println(
	            calculateBill(i));
		}		    
		
				    



}