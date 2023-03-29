package Bill;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;


class BillDesign
{
	public void BillDesignFormat()
	{
	System.out.println("\t\t ******************************** MY PROJECT **************************************");

	
	
	for (int i = 1; i <= 53; i++) {
		System.out.print(" \u259E");

	}
	System.out.println("");

	
	System.out.println("\n\t\t*************************  WECOME TO UNIQUE  SUPER MARKET *************************\n");
	for (int i = 1; i <= 83; i++) {
		System.out.print("\u259E");

	}
	System.out.println("");
	
	System.out.println("\n\t\t\t\t\t " + "    " + "UNIQUE  Super Market");

	System.out.println("\t\t\t\t\t Near Jaishatmah Chowk  Gondia");
	System.out.println("\t\t\t\t\t\t" + "   " + "Amagon Road \n");

	for (int i = 1; i <= 83; i++) {
		System.out.print("\u259E");

	}
	System.out.println("");

	System.out.println("\nGSTIN: 03KTENY25468764T" + "\t\t\t\t\t\t\t\t\t\tContact: (+91) 9988776655");
	// format of date and time
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Date date = new Date();
	Calendar calendar = Calendar.getInstance();
	String[] days = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
	// prints current date and time
	System.out.println("Date: " + formatter.format(date) + "  " + days[calendar.get(Calendar.DAY_OF_WEEK) - 1]
			+ "\t\t\t\t\t\t\t\t\t (+91) 9998887770\n");
	for (int i = 1; i <= 83; i++) {
		System.out.print("\u259E");

	}
	System.out.println("");
	System.out.println("\n\t\t\t\t\t\t********** Customer  Bill **********");
	for (int i = 1; i <= 139; i++) {
		System.out.print("=");

	}
	System.out.println("");
}
}


class PaymentOption
{
	public void paymentOption()
	{
		
		System.out.println("********** PAYMENT OPTIONS **********"); // payment option
		for (int i = 1; i <= 139; i++) {
			System.out.print("-");

		}
		System.out.println("");

		System.out.println("\t\t 1) Offline");
		System.out.println("\t\t 2) Online");
		System.out.println("\t\t 3) Card Shapping");
		for (int i = 1; i <= 139; i++) {
			System.out.print("-");

		}
		System.out.println("");
	}
	public void paymentOptionChoice(double subtotal,double cgst,double sgst) throws InterruptedException
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("choice payment option:");
		for (int i = 1; i <= 139; i++) {
			System.out.print("-");

		}
		System.out.println("");

		int choice1 = scan.nextInt();
		for (int i = 1; i <= 139; i++) {
			System.out.print("-");

		}
		System.out.println("");

		switch (choice1) {
		case 1: {
			System.out.println("\t\tYour Bill offline pay  " + (float) (subtotal + cgst + sgst));
			System.out.println("\t\tThanks  offline  pay ");

			break;

		}
		case 2: {
			System.out.println("\t\t1)UPI Scanner");
			System.out.println("\t\t2)PAYTM");
			System.out.println("\t\t3)PHOHEPE");
			System.out.println("\t\t4)Gpay");
			for (int i = 1; i <= 139; i++) {
				System.out.print("-");

			}
			System.out.println("");

			System.out.println("choice payment option:");
			int choice2 = scan.nextInt();
			for (int i = 1; i <= 139; i++) {
				System.out.print("-");

			}
			System.out.println("");
			

			switch (choice2) {
			case 1: {
				System.out.println("\tPay using "); // Using unicode Charater and print QR Code
				System.out.println("\t\tBHIM>>UPI>>\n\n");

				System.out.println("Scan QRCODE");
				for (int i = 1; i <= 5; i++) {
					System.out.print("\t\u258D");
					for (int j = 1; j <= 5; j++) {
						System.out.print("\u259A");
					}
					System.out.println("\u258D");

				}
				System.out.println("\n\tPAY WHIT ANY APP\n\n");
				Thread.sleep(3000);
				System.out.println("\t\tYour Payment Successful");

			}

				for (int i = 1; i <= 139; i++) {
					System.out.print("-");

				}
				System.out.println("");

				break;

			case 2: {
				System.out.print("Enter Paytm Number :");

				Long num = scan.nextLong();
				int count = 0;
				while (num != 0) {
					// num = num/10
					num /= 10;
					++count;
				}

				if (count == 10) {
					System.out.print("Enter the OTP(4 Digit) :");
					int otp=scan.nextInt();
					int countotp=0;
					while(otp!=0)
					{
						otp/=10;
						++countotp;
					}
					if(countotp==4) {
					
					for (int i = 0; i <= 1; i++) {
						System.out.println("\n\t\t\tProcessing...Payment ");
						Thread.sleep(2000);// therad method
						
						System.out.println("\t\tPayment Successful");
						for (int j = 1; j <= 139; j++) {
							System.out.print("-");

						}
						System.out.println("");

						break;
					}
					}else
					{
						int counotp=0;
						System.out.println("\tInvailed OTP");
						System.out.print("\tEnter OPT Again:");
						int otp1=scan.nextInt();
						while(otp1!=0)
						{
							otp1/=10;
							++counotp;
						}
						if(counotp==4) {
						
						for (int i = 0; i <= 1; i++) {
							System.out.println("\n\t\t\tProcessing...Payment ");
							Thread.sleep(2000);// therad method
							
							System.out.println("\t\tPayment Successful");
							for (int j = 1; j <= 139; j++) {
								System.out.print("-");

							}
							System.out.println("");

							break;
						}
						}
						else
						{
							int count1=0;
							System.out.println("\tInvailed OTP");
							System.out.print("\tEnter OPT Again:");
							int otp2=scan.nextInt();
							while(otp2!=0)
							{
								otp2/=10;
								++count1;
							}
							if(count1==4) {
							
							for (int i = 0; i <= 1; i++) {
								System.out.println("\n\t\t\tProcessing...Payment ");
								Thread.sleep(2000);// therad method
								
								System.out.println("\t\tPayment Successful");
								for (int j = 1; j <= 139; j++) {
									System.out.print("-");

								}
								System.out.println("");

								break;
							}
							}
							else
							{
								System.out.println("\tInvailed OTP");
								System.out.print("\tEnter OPT Again:");
								int otp3=scan.nextInt();
								while(otp3!=0)
								{
									otp1/=10;
									++count;
								}
								if(count==4) {
								
								for (int i = 0; i <= 1; i++) {
									System.out.println("\n\t\t\tProcessing...Payment ");
									Thread.sleep(2000);// therad method
									
									System.out.println("\t\tPayment Successful");
									for (int j = 1; j <= 139; j++) {
										System.out.print("-");

									}
									System.out.println("");

									break;
								}
								}
								else
								{
									
								}

								
							}

							
						}
					}
						
				}
				/*
				 * Invailed Paytem Number
				 * Try again
				 * Invailed OTP
				 * try again
				 */
				else {
					System.out.println("\tInvailed Paytm Number");
					Thread.sleep(2000);
					System.out.println("\tTry again");
					Thread.sleep(2000);
					System.out.println("Enter the Paytm Number");
					Long num1 = scan.nextLong();
					int count1 = 0;
					while (num1 != 0) {
						// num = num/10
						num1 /= 10;
						++count1;
					}

					if (count1 == 10) {
						for (int i = 0; i <= 1; i++) {
							System.out.println("\n\t\t\tProcessing...Payment ");
							Thread.sleep(2000);// therad method
							System.out.println("\t\tPayment Successful");
							for (int j = 1; j <= 139; j++) {
								System.out.print("-");

							}
							System.out.println("");
							break;
						}

					} else {
						System.out.println("\tInvailed Paytem Number");
						Thread.sleep(2000);

						System.out.println("\tTry again");
						Thread.sleep(2000);
						System.out.println("Enter the Paytem Number");
						Long num2 = scan.nextLong();
						int count2 = 0;
						while (num2 != 0) {
							// num = num/10
							num2 /= 10;
							++count1;
						}

						if (count1 == 10) {
							for (int i = 0; i <= 1; i++) {
								System.out.println("\n\t\t\tProcessing...Payment ");
								Thread.sleep(2000);// therad method
								System.out.println("\t\tPayment Successful");
								for (int j = 1; j <= 139; j++) {
									System.out.print("-");

								}
								System.out.println("");
								break;
							}

						} else {
							System.out.println("\tInvailed Paytm Number");
							Thread.sleep(2000);
							System.out.println("\tTry again");

							break;
						}
					}

				}

				break;
			}
			case 3: {
				System.out.println("Enter Phonepe Number :");

				Long num = scan.nextLong();
				int count = 0;
				while (num != 0) {
					// num = num/10
					num /= 10;
					++count;
				}

				if (count == 10) {
					for (int i = 0; i <= 1; i++) {
						System.out.println("\n\t\t\tProcessing...Payment ");
						Thread.sleep(2000);// therad method
						System.out.println("\t\tPayment Successful");
						for (int j = 1; j <= 139; j++) {
							System.out.print("-");

						}
						System.out.println("");
						break;
					}
				}
				/*
				 * Invailed Paytem Number
				 * 
				 * Try again
				 */
				else {
					System.out.println("\tInvailed Phonepe Number");
					Thread.sleep(2000);
					System.out.println("\tTry again");
					Thread.sleep(2000);
					System.out.println("Enter the Phonepe Number");
					Long num1 = scan.nextLong();
					int count1 = 0;
					while (num1 != 0) {
						// num = num/10
						num1 /= 10;
						++count1;
					}

					if (count1 == 10) {
						for (int i = 0; i <= 1; i++) {
							System.out.println("\n\t\t\tProcessing...Payment ");
							Thread.sleep(2000);// therad method
							System.out.println("\t\tPayment Successful");
							for (int j = 1; j <= 139; j++) {
								System.out.print("-");

							}
							System.out.println("");
							break;
						}

					} else {
						System.out.println("\tInvailed Phonepe Number");
						Thread.sleep(2000);

						System.out.println("\tTry again");
						Thread.sleep(2000);
						System.out.println("Enter the Phonepe Number");
						Long num2 = scan.nextLong();
						int count2 = 0;
						while (num2 != 0) {
							// num = num/10
							num2 /= 10;
							++count1;
						}

						if (count1 == 10) {
							for (int i = 0; i <= 1; i++) {
								System.out.println("\n\t\t\tProcessing...Payment ");
								Thread.sleep(2000);// therad method
								System.out.println("\t\tPayment Successful");
								for (int j = 1; j <= 139; j++) {
									System.out.print("-");

								}
								System.out.println("");
								break;
							}

						} else {
							System.out.println("\tInvailed Phonepe Number");
							Thread.sleep(2000);
							System.out.println("\tTry again");

							break;
						}
					}

				}

				break;

			}
			case 4: {
				System.out.println("Enter Gpay Number :");

				Long num = scan.nextLong();
				int count = 0;
				while (num != 0) {
					// num = num/10
					num /= 10;
					++count;
				}

				if (count == 10) {
					for (int i = 0; i <= 1; i++) {
						System.out.println("\n\t\t\tProcessing...Payment ");
						Thread.sleep(2000);// therad method
						System.out.println("\t\tPayment Successful");
						for (int j = 1; j <= 139; j++) {
							System.out.print("-");

						}
						System.out.println("");
						break;
					}
				}
				/*
				 * Invailed Paytem Number
				 * 
				 * Try again
				 */
				else {
					System.out.println("\tInvailed Gpay Number");
					Thread.sleep(2000);
					System.out.println("\tTry again");
					Thread.sleep(2000);
					System.out.println("Enter the Gpay Number");
					Long num1 = scan.nextLong();
					int count1 = 0;
					while (num1 != 0) {
						// num = num/10
						num1 /= 10;
						++count1;
					}

					if (count1 == 10) {
						for (int i = 0; i <= 1; i++) {
							System.out.println("\n\t\t\tProcessing...Payment ");
							Thread.sleep(2000);// therad method
							System.out.println("\t\tPayment Successful");
							for (int j = 1; j <= 139; j++) {
								System.out.print("-");

							}
							System.out.println("");
							break;
						}

					} else {
						System.out.println("\tInvailed Gpay Number");
						Thread.sleep(2000);

						System.out.println("\tTry again");
						Thread.sleep(2000);
						System.out.println("Enter the Gpay Number");
						Long num2 = scan.nextLong();
						int count2 = 0;
						while (num2 != 0) {
							// num = num/10
							num2 /= 10;
							++count1;
						}

						if (count1 == 10) {
							for (int i = 0; i <= 1; i++) {
								System.out.println("\n\t\t\tProcessing...Payment ");
								Thread.sleep(2000);// therad method
								System.out.println("\t\tPayment Successful");
								for (int j = 1; j <= 139; j++) {
									System.out.print("-");

								}
								System.out.println("");
								break;
							}

						} else {
							System.out.println("\tInvailed Gpay Number");
							Thread.sleep(2000);
							System.out.println("\tTry again");

							break;
						}
					}

				}

				break;

			}

			}
			break;
		}
		case 3: {
			System.out.println("Put An The Card Shapping Machine ");
			Thread.sleep(4000);
			System.out.println("Enter the 4th digit pin:");
			Thread.sleep(1000);

			int num = scan.nextInt();
			int count = 0;
			while (num != 0) {
				// num = num/10
				num /= 10;
				++count;
			}
			if (count == 4) {
				for (int i = 0; i <= 1; i++) {
					System.out.println("\n\t\t\tProcessing...Payment ");
					Thread.sleep(2000);// therad method
					System.out.println("\t\tPayment Successful");
					for (int j = 1; j <= 139; j++) {
						System.out.print("-");

					}
					System.out.println("");
					break;
				}
			}

			else {
				System.out.println("\t Pin is incorrect ");
				Thread.sleep(2000);
				System.out.println("\tTry again");
				Thread.sleep(2000);
				System.out.println("Enter the 4th digit pin");
				Long num1 = scan.nextLong();
				int count1 = 0;
				while (num1 != 0) {
					// num = num/10
					num1 /= 10;
					++count1;
				}

				if (count1 == 4) {
					for (int i = 0; i <= 1; i++) {
						System.out.println("\n\t\t\tProcessing...Payment ");
						Thread.sleep(2000);// therad method
						System.out.println("\t\tPayment Successful");
						for (int j = 1; j <= 139; j++) {
							System.out.print("-");

						}
						System.out.println("");
						break;
					}

				} else {
					System.out.println("\tPin is incorrectr");
					Thread.sleep(2000);

					System.out.println("\tTry again");
					Thread.sleep(2000);
					System.out.println("Enter the 4th digit pinr");
					Long num2 = scan.nextLong();
					int count2 = 0;
					while (num2 != 0) {
						// num = num/10
						num2 /= 10;
						++count1;
					}

					if (count1 == 4) {
						for (int i = 0; i <= 1; i++) {
							System.out.println("\n\t\t\tProcessing...Payment ");
							Thread.sleep(2000);// therad method
							System.out.println("\t\tPayment Successful");
							for (int j = 1; j <= 139; j++) {
								System.out.print("-");

							}
							System.out.println("");
							break;
						}

					} else {
						System.out.println("\tPin is incorrectr");
						Thread.sleep(2000);
						System.out.println("\tTry again");

						break;
					}
				}

			}

			System.out.println("\t\tYour Payment Successful");

			for (int j = 1; j <= 139; j++) {
				System.out.print("-");

			}
			System.out.println("");
			break;

		}
		
		default:
		{
			System.out.println("Invaild option choice");
			Thread.sleep(2000);
			
		}

		}
		
		
	}
	
	
}


class ProductDatailes {
	// properties
	 String id;
	 String pname;
	 int qty;
	 double price;
	 double totalPrice;
	 int choice;

	// constructor
	ProductDatailes(String id, String pname, int qty, double price, double totalPrice, int choice) {
		this.id = id;
		this.pname = pname;
		this.qty = qty;
		this.price = price;
		this.totalPrice = totalPrice;
		this.choice = choice;
	}


	
	// displayFormat
	public static void displayFormat() {
		System.out.format(
				"-----------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("\nProduct ID \t\tName\t\tQuantity\t\tRate \t\t\t\tTotal Price\n");
		System.out.format(
				"-----------------------------------------------------------------------------------------------------------------------------------\n");
	}

	// display
	public void display() {
		System.out.format("   %-9s             %-9s      %5d               %9.2f                       %14.2f\n", id,
				pname, qty, price, totalPrice);
	}
	
}





class Bill
{
	public void Bill1() throws InterruptedException
	{
		// variables
				String id = null;
				String productName = null;
				int quantity = 0;
				double price = 0.0;
				double totalPrice = 0.0;
				double overAllPrice = 0.0;
				double cgst, sgst, subtotal = 0.0, discount = 0.0;
				char choice = '\0';
				
		         new BillDesign().BillDesignFormat();//calling BillDesign class
		         
		         
				
				Scanner scan = new Scanner(System.in);
				System.out.print("Enter Customer Name: ");
				String customername = scan.nextLine();
				for (int i = 1; i <= 139; i++) {
					System.out.print("-");

				}
				System.out.println("");
				// create Scanner class object
				// creating an ArrayList to store the product
				List<ProductDatailes> product = new ArrayList<ProductDatailes>();
				do {
					// read input values
					System.out.println("Enter the product details:\n ");
					System.out.print("Product ID: ");
					id = scan.nextLine();
					System.out.print("Product Name: ");
					productName = scan.nextLine();

					System.out.print("Quantity: ");
					quantity = scan.nextInt();
					System.out.print("Price (per unit(RS)): ");
					price = scan.nextDouble();
					// calculate total price for a particular product
					totalPrice = price * quantity;
					// calculates overall price
					overAllPrice = overAllPrice + totalPrice;
					// creates Product class object and add it to the List
					product.add(new ProductDatailes(id, productName, quantity, price, totalPrice, choice));
					// ask for continue shopping?
					System.out.print("Want to add more items? (Y (y) or n): ");
					// reads a character Y or N
					
					choice = scan.next().charAt(0);
					// read remaining characters, don't store (no use)
					scan.nextLine();
				} while (choice == 'y' || choice == 'Y');
				// display all product with its properties
				ProductDatailes.displayFormat();
				for (ProductDatailes p : product) {
					p.display();
				}
				// price calculation
				System.out.println("\n\t\t\t\t\t\t\t\t\t\tTotal Amount (Rs.) " + overAllPrice);
				// calculating discount
				discount = overAllPrice * 10 / 100;
				System.out.println("\n\t\t\t\t\t\t\t\t\t\tDiscount 10% (Rs.) " + discount);
				// total amount after discount
				subtotal = overAllPrice - discount;
				System.out.println("\n\t\t\t\t\t\t\t\t\t\t          Subtotal " + subtotal);
				// calculating tax
				sgst = overAllPrice * 12 / 100;
				System.out.println("\n\t\t\t\t\t\t\t\t\t\t          SGST (%) " + sgst);
				cgst = overAllPrice * 12 / 100;
				System.out.println("\n\t\t\t\t\t\t\t\t\t\t          CGST (%) " + cgst);
				for (int i = 1; i <= 139; i++) {
					System.out.print("-");

				}
				System.out.println("");
				// calculating amount to be paid by buyer
				System.out.println("\n\t\t\t\t\t\t\t\t\t\t     Invoice Total " + (float) (subtotal + cgst + sgst));
				for (int i = 1; i <= 139; i++) {
					System.out.print("*");

				}
				System.out.println("");

				for (int i = 1; i <= 139; i++) {
					System.out.print("*");

				}
				System.out.println("");

				new PaymentOption().paymentOption();
				new PaymentOption().paymentOptionChoice(subtotal, cgst, sgst);

				for (int j = 1; j <= 139; j++) {
					System.out.print("*");

				}
				
				System.out.println("");
				System.out.println("\t\t\t\t                     " + customername);
				System.out.println("\t\t\t\t----------------Thank You for Shopping!!-----------------");
				System.out.println("\t\t\t\t                     Visit Again");

				System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tKrushna Turkar");
				// close Scanner
				for (int j = 1; j <= 139; j++) {
					System.out.print("*");

				}
				System.out.println("");

				for (int i = 1; i <= 10; i++) {

					System.out.print("$$ Java Is Awesome $$ ");
					Thread.sleep(1000);
				}
				scan.close();
		
	}
	
	
}

public class SuperMarketShoppingBill {
	public static void main(String args[]) throws InterruptedException  {
		
		new Bill().Bill1();
		
	}

}
