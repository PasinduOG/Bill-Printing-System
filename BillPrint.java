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

		Declare variables and initialized to store each grocery unit price;
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
		System.out.println("+--------------------------------------------------------------+");
		System.out.println("|              _   _   __           _____ _______    	       |");
		System.out.println("|             (_) |  \\/  |    /\\   |  __ \\__   __|             |");
		System.out.println("|              _  | \\  / |   /  \\  | |__) | | |		       |");
		System.out.println("|             | | | |\\/| |  / /\\ \\ |  _  /  | |                |");
		System.out.println("|             | | | |  | | / ____ \\| | \\ \\  | |		       |");
		System.out.println("|             |_| |_|  |_|/_/    \\_\\ |  \\_\\ |_|	               |");
		System.out.println("|                  225,Galle Road,Panadura                     |");
		System.out.println("|                                                              |");
		System.out.println("+--------------------------------------------------------------+");
		System.out.printf("|                   # Tel  : %-34s|\n", customerPhoneNumber);
		System.out.printf("|                   # Name : %-34s|\n", customerName);
		System.out.println("+--------------------------------------------------------------+");
		System.out.println("|                |    Qty   |   unit price   |      Price      |");
		System.out.println("+----------------+---------------------------------------------+");
		System.out.printf("| # Basmathi     |    %3d   |     %10.1f |     %6.1f      |\n", b, basmathi, basmathiTotal);
		System.out.println("|                |          |                |                 |");
		System.out.printf("| # Dhal         |    %3d   |     %10.1f |     %6.1f      |\n", d, dhal, dhalTotal);
		System.out.println("|                |          |                |                 |");
		System.out.printf("| # Sugar        |    %3d   |     %10.1f |     %6.1f      |\n", s, sugar, sugarTotal);
		System.out.println("|                |          |                |                 |");
		System.out.printf("| # Highland     |    %3d   |     %10.1f |     %6.1f      |\n", h, highland, highlandTotal);
		System.out.println("|                |          |                |                 |");
		System.out.printf("| # Yoghurt      |    %3d   |     %10.1f |     %6.1f      |\n", y, yoghurt, yoghurtTotal);
		System.out.println("|                |          |                |                 |");
		System.out.printf("| # flour        |    %3d   |     %10.1f |     %6.1f      |\n", f, flour, flourTotal);
		System.out.println("|                |          |                |                 |");
		System.out.printf("| # Soap         |    %3d   |     %10.1f |     %6.1f      |\n", so, soap, soapTotal);
		System.out.println("|                |          |                |                 |");
		System.out.println("+--------------------------------------------------------------+");
		System.out.printf("|                           |  Total         |     %6.1f      |\n", total);
		System.out.println("|                           +----------------+-----------------+");
		System.out.printf("|                           |  discount(10%%) |     %6.1f      |\n", discount);
		System.out.println("|                           +----------------+-----------------+");
		System.out.printf("|                           |  Price         |     %6.1f      |\n", discountPrice);
		System.out.println("+---------------------------+----------------+-----------------+");

		System.out.println();
		System.out.println("=====================================================================================");
		System.out.println();
	}

}