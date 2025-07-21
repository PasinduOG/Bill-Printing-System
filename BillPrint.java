import java.util.Scanner;

class BillPrint {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		// Welcome Page
		System.out.println();
		System.out.println();
		System.out.println("=====================================================================================");
		System.out.println();
		System.out.println("__            __  _                            _           _ __  __            _");
		System.out.println("\\ \\    /\\    / / | |                          | |         (_)  \\/  |          | |");
		System.out.println(" \\ \\  /  \\  / /__| | ___ ___  _ ___ __   ___  | |_ ___     _| \\  / | __ _ _ __| |_");
		System.out.println("  \\ \\/ /\\ \\/ / _ \\ |/ __/ _ \\| '_  `  \\ / _ \\ | __/ _ \\   | | |\\/| |/ _` | '__| __|");
		System.out.println("   \\  /  \\  /  __/ | (_| (_) | | | | | |  __/ | || (_) |  | | |  | | (_| | |  | |_");
		System.out.println("    \\/    \\/ \\___|_|\\___\\___/|_| |_| |_|\\___|  \\__\\___/   |_|_|  |_|\\__,_|_|   \\__|");
                System.out.println();
		System.out.println();
		System.out.println("=====================================================================================");
		System.out.println();
		System.out.println();
		
		System.out.print("Enter Customer Phone Number - ");
		String customerPhoneNumber = scanner.next();
		scanner.nextLine();

		System.out.println();

		System.out.print("Customer Name - ");
		String customerName = scanner.nextLine();

		System.out.println();
		System.out.println();
		System.out.println("=====================================================================================");
		System.out.println();

		// Declare variables and initialized to store each grocery unit price
		double basmathi=250.0, dhal=180.0, sugar=150.0, highland=1200.0, yoghurt=50.0, flour=120.0, soap=160.0;
		int b,d,s,h,y,f,so;

		// Get the quantity from every grocery item
		System.out.print("Basmathi Qty(Kg) - ");
		b = scanner.nextInt();
		System.out.println();

		System.out.print("Dhal Qty(Kg) - ");
		d = scanner.nextInt();
		System.out.println();

		System.out.print("Sugar Qty(Kg) - ");
		s = scanner.nextInt();
		System.out.println();

		System.out.print("Highland Qty - ");
		h = scanner.nextInt();
		System.out.println();

		System.out.print("Yoghurt Qty - ");
		y = scanner.nextInt();
		System.out.println();

		System.out.print("Flour Qty(Kg) - ");
		f = scanner.nextInt();
		System.out.println();

		System.out.print("Soap Qty - ");
		so = scanner.nextInt();
		System.out.println();
		System.out.println("=====================================================================================");
		System.out.println();

		// Store the total price of each grocery item
		double basmathiTotal, dhalTotal, sugarTotal, highlandTotal, yoghurtTotal, flourTotal, soapTotal; 
		
		basmathiTotal = b*basmathi;
		dhalTotal = d*dhal;
		sugarTotal = s*sugar;
		highlandTotal = h*highland;
		yoghurtTotal = y*yoghurt;
		flourTotal = f*flour;
		soapTotal = so*soap;

		// Getting the price of all grocery items
		double total = basmathiTotal + dhalTotal + sugarTotal + highlandTotal + yoghurtTotal + flourTotal + soapTotal;
		
		// Discount logic
		double discount, discountPrice;
		discount = (total*10)/100;
		discountPrice = total - discount;

		// Bill Table
		System.out.println("+----------------------------------------------------------------+");
		System.out.println("|               _   _   __           _____ _______    	         |");
		System.out.println("|              (_) |  \\/  |    /\\   |  __ \\__   __|              |");
		System.out.println("|               _  | \\  / |   /  \\  | |__) | | |		 |");
		System.out.println("|              | | | |\\/| |  / /\\ \\ |  _  /  | |                 |");
		System.out.println("|              | | | |  | | / ____ \\| | \\ \\  | |	 	 |");
		System.out.println("|              |_| |_|  |_|/_/    \\_\\ |  \\_\\ |_|	         |");
		System.out.println("|                   225,Galle Road,Panadura                      |");
		System.out.println("|                                                                |");
		System.out.println("+----------------------------------------------------------------+");
		System.out.printf("|                   # Tel  : %-36s|\n", customerPhoneNumber);
		System.out.printf("|                   # Name : %-36s|\n", customerName);
		System.out.println("+----------------------------------------------------------------+");
		System.out.println("|                |    Qty   |   unit price   |       Price       |");
		System.out.println("+----------------+-----------------------------------------------+");
		System.out.printf("| # Basmathi     |    %3d   |     %10.1f |     %8.1f      |\n", b, basmathi, basmathiTotal);
		System.out.println("|                |          |                |                   |");
		System.out.printf("| # Dhal         |    %3d   |     %10.1f |     %8.1f      |\n", d, dhal, dhalTotal);
		System.out.println("|                |          |                |                   |");
		System.out.printf("| # Sugar        |    %3d   |     %10.1f |     %8.1f      |\n", s, sugar, sugarTotal);
		System.out.println("|                |          |                |                   |");
		System.out.printf("| # Highland     |    %3d   |     %10.1f |     %8.1f      |\n", h, highland, highlandTotal);
		System.out.println("|                |          |                |                   |");
		System.out.printf("| # Yoghurt      |    %3d   |     %10.1f |     %8.1f      |\n", y, yoghurt, yoghurtTotal);
		System.out.println("|                |          |                |                   |");
		System.out.printf("| # flour        |    %3d   |     %10.1f |     %8.1f      |\n", f, flour, flourTotal);
		System.out.println("|                |          |                |                   |");
		System.out.printf("| # Soap         |    %3d   |     %10.1f |     %8.1f      |\n", so, soap, soapTotal);
		System.out.println("|                |          |                |                   |");
		System.out.println("+----------------------------------------------------------------+");
		System.out.printf("|                           |  Total         |     %8.1f      |\n", total);
		System.out.println("|                           +----------------+-------------------+");
		System.out.printf("|                           |  discount(10%%) |     %8.1f      |\n", discount);
		System.out.println("|                           +----------------+-------------------+");
		System.out.printf("|                           |  Price         |     %8.1f      |\n", discountPrice);
		System.out.println("+---------------------------+----------------+-------------------+");

		// Customer given amount
		System.out.println();
		System.out.print("Enter customer given amount - ");
		double customerAmount = scanner.nextDouble();
		System.out.println();

		double amountChange = customerAmount-discountPrice;
		int customerChange = (int)amountChange;
		

		System.out.println("+----------------+--------------------+");
		System.out.printf("|   Net Amount   |   %-17.1f|\n", discountPrice);
		System.out.println("+----------------+--------------------+");
		System.out.printf("|   Cash         |   %-17.1f|\n", customerAmount);
		System.out.println("+----------------+--------------------+");
		System.out.printf("|   Change       |   %-17d|\n", customerChange);
		System.out.println("+----------------+--------------------+");

		System.out.println();

		int value=5000, value1=2000, value2=1000, value3=500, value4=100, value5=50, value6=20, value7=10, value8=5, value9=2, value10=1;
		
		int note = customerChange/value;
		int customerChange1 = customerChange%value;

		int note1 = customerChange1/value1;
		int customerChange2 = customerChange1%value1;

		int note2 = customerChange2/value2;
		int customerChange3 = customerChange2%value2;

		int note3 = customerChange3/value3;
		int customerChange4 = customerChange3%value3;

		int note4 = customerChange4/value4;
		int customerChange5 = customerChange4%value4;

		int note5 = customerChange5/value5;
		int customerChange6 = customerChange5%value5;

		int note6 = customerChange6/value6;
		int customerChange7 = customerChange6%value6;

		int coin = customerChange7/value7;
		int customerChange8 = customerChange7%value7;

		int coin1 = customerChange8/value8;
		int customerChange9 = customerChange8%value8;

		int coin2 = customerChange9/value9;
		int customerChange10 = customerChange9%value9;

		int coin3 = customerChange10/value10;

		int noteCount = note+note1+note2+note3+note4+note5+note6;
		int coinCount = coin+coin1+coin2+coin3;		

		System.out.println("+-----------------+-------------+");
		System.out.println("|      Value      |     No      |");
		System.out.println("+-----------------+-------------+");
		System.out.printf("|     Rs.5000     |      %-7d|\n", note);
		System.out.println("+-----------------+-------------+");
		System.out.printf("|     Rs.2000     |      %-7d|\n", note1);
		System.out.println("+-----------------+-------------+");
		System.out.printf("|     Rs.1000     |      %-7d|\n", note2);
		System.out.println("+-----------------+-------------+");
		System.out.printf("|     Rs.500      |      %-7d|\n", note3);
		System.out.println("+-----------------+-------------+");
		System.out.printf("|     Rs.100      |      %-7d|\n", note4);
		System.out.println("+-----------------+-------------+");
		System.out.printf("|     Rs.50       |      %-7d|\n", note5);
		System.out.println("+-----------------+-------------+");
		System.out.printf("|     Rs.20       |      %-7d|\n", note6);
		System.out.println("+-----------------+-------------+");
		System.out.printf("|     Rs.10       |      %-7d|\n", coin);
		System.out.println("+-----------------+-------------+");
		System.out.printf("|     Rs.5        |      %-7d|\n", coin1);
		System.out.println("+-----------------+-------------+");
		System.out.printf("|     Rs.2        |      %-7d|\n", coin2);
		System.out.println("+-----------------+-------------+");
		System.out.printf("|     Rs.1        |      %-7d|\n", coin3);
		System.out.println("+-----------------+-------------+");
		System.out.printf("|   No of Notes   |      %-7d|\n", noteCount);
		System.out.println("+-----------------+-------------+");
		System.out.printf("|   No of Coins   |      %-7d|\n", coinCount);
		System.out.println("+-----------------+-------------+");

		System.out.println();
		System.out.println("=====================================================================================");
		System.out.println();
	}

}