package org.vote;
import java.util.*;
public class VoteDetails {
	public static void main(String[] args) {
		System.out.println("Enter The Age Of Voter: ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if( a<18) {
		System.out.println("voter age ="+a);
			System.out.println("Not eligible");
		}
		else {
			System.out.println(" eligible");
		}
		
	
	}

}
