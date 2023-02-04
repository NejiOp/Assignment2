package arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class arrayQuestion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of the array");
		int i1=sc.nextInt();
	
		List<Integer> arr=new ArrayList();
		arr.add(sc.nextInt());
		arr.add(sc.nextInt());
		arr.add(sc.nextInt());
		arr.add(sc.nextInt());
		arr.forEach(s1->{if(s1%2!=0) System.out.println("this is all odd number  "+s1);});
		// TODO Auto-generated method stub

	}

}
