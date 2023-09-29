package restaurent;
import java.util.Scanner;

public class MainRes1 {
	
	
	
	public static Scanner input=new Scanner(System.in);
	public static int choice,Quantity=1;
	public static String again;
	public static double total=0,pay;
	public static void menu() {
		System.out.println("_-_-_-_-_-_-_-_-_-_-_");
		System.out.println("\tWELCOME to our Restaurent");
		
		System.out.println("\tRestaurent Menu :");
		System.out.println("\t1Barger BDT $80.00");
		System.out.println("\t2Pizza BDT $100.00");

		System.out.println("\t3Coffee BDT $60.00");

		System.out.println("\t4 cancle");

		
	}
	
	
	
	public static void order() {
		System.out.println("1 to Barger || 2 to Pizza || 3 to coffee");
		
		System.out.println("press you want to order :");
		
		choice=input.nextInt();
		if(choice==1) {
			System.out.println("you choice Barger");
			System.out.println("How many burger you want");
			Quantity=input.nextInt();
			total=total+(Quantity*80);
			System.out.println("you want to buy Again :");
			
			System.out.println("press y for [yes] and Nfor [No]:");
			again=input.next();
			if(again.equalsIgnoreCase("y")) {
				order();
			}
				else {
					System.out.println("enter payment :");
					pay=input.nextDouble();
				}
					if(pay<total) {
						
					System.out.println("No need more");
					
				     }
					else {
						System.out.println("total+total");
						total=pay-total;
						System.out.println("customer's retun"+total+"tk");
					}
		            }
					else if(choice==2) {
						System.out.println("you choice Pizza");
						System.out.println("How many Pizza you want");
						Quantity=input.nextInt();
						total=total+(Quantity*100);
						System.out.println("you want to buy Again :");
						
						System.out.println("press y for [yes] and Nfor [No]:");
						again=input.next();
						if(again.equalsIgnoreCase("y")) {
							order();
						}
							else {
								System.out.println("enter payment :");
								pay=input.nextDouble();
							}
								if(pay<total) {
									
								System.out.println("No need more");
								
							}
								else {
									System.out.println("total+total");
									total=pay-total;
									System.out.println("customer's retun"+total+"tk");
								}

			         }
						else if(choice==3) {
							System.out.println("you choice Coffee");
							System.out.println("How many Coffee you want");
							Quantity=input.nextInt();
							total=total+(Quantity*80);
							System.out.println("you want to buy Again :");
							
							System.out.println("press y for [yes] and Nfor [No]:");
							again=input.next();
							if(again.equalsIgnoreCase("y")) {
								order();
							}
								else {
									System.out.println("enter payment :");
									pay=input.nextDouble();
								}
									if(pay<total) {
										
									System.out.println("No need more");
									
								}
									else {
										System.out.println("total+total");
										total=pay-total;
										System.out.println("customer's retun"+total+"tk");
									}
						}
						else if(choice==4) {
		                     	System.exit(0);
						}
						else {
							System.out.println("choose a food in this items :");
							order();
							

		}
	}
	public static void main(String[] args) {
		
		menu();
		order();
		
		
	}

}
