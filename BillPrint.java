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
		System.out.println("=====================================================================================");
		System.out.println();
		System.out.println();
		
		System.out.print("Enter Customer Phone Number - ");
		String customerPhoneNumber = scanner.next();

		System.out.println();

		System.out.print("Customer Name - ");
		String customerName = scanner.next();

		System.out.println();
		System.out.println();
		System.out.println("=====================================================================================");
		System.out.println();

		System.out.print("Dhal Qty(Kg) - ");
		int basmathi = scanner.nextInt();
		System.out.println();

		System.out.print("Dhal Qty(Kg) - ");
		int dhal = scanner.nextInt();
		System.out.println();

		System.out.print("Sugar Qty(Kg) - ");
		int sugar = scanner.nextInt();
		System.out.println();

		System.out.print("Highland Qty(Kg) - ");
		int highland = scanner.nextInt();
		System.out.println();

		System.out.print("Flour Qty(Kg) - ");
		int flour = scanner.nextInt();
		System.out.println();

		System.out.print("Soap Qty(Kg) - ");
		int soup = scanner.nextInt();
		System.out.println();
		System.out.println("=====================================================================================");
		System.out.println();

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
		System.out.println("|                   # Tel  : "+customerPhoneNumber+"                        |");
		System.out.println("|                   # Name : "+customerName+"                             |");
		System.out.println("+--------------------------------------------------------------+");

	}

}