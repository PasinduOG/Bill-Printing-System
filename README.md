# Bill Printing System

A comprehensive Java-based bill printing system for grocery stores and retail businesses. This application generates detailed customer bills with automatic discount calculations and change breakdown.

## 🚀 Features

- **Customer Management**: Store customer phone numbers and names
- **Product Catalog**: Pre-configured grocery items with unit prices:
  - Basmathi Rice (Rs. 250/kg)
  - Dhal (Rs. 180/kg)
  - Sugar (Rs. 150/kg)
  - Highland Milk Powder (Rs. 1,200/unit)
  - Yoghurt (Rs. 50/unit)
  - Flour (Rs. 120/kg)
  - Soap (Rs. 160/unit)
- **Automatic Calculations**: 
  - Subtotal calculation
  - 10% discount application
  - Final bill amount
- **Payment Processing**: 
  - Customer payment tracking
  - Change calculation
  - Currency breakdown (notes and coins)
- **Professional Bill Format**: ASCII art branding and structured receipt layout

## 🏪 Business Information

**iMART**  
225, Galle Road, Panadura  
Complete grocery and household items store

## 📋 Prerequisites

- Java Development Kit (JDK) 8 or higher
- Java Runtime Environment (JRE)

## 🔧 Installation & Setup

1. **Clone the repository**:
   ```bash
   git clone https://github.com/PasinduOG/Bill-Printing-System.git
   cd Bill-Printing-System
   ```

2. **Compile the Java program**:
   ```bash
   javac BillPrint.java
   ```

3. **Run the application**:
   ```bash
   java BillPrint
   ```

## 💻 Usage

1. **Start the application**: Run the compiled Java program
2. **Enter customer details**: 
   - Customer phone number
   - Customer name
3. **Input quantities** for each product:
   - Basmathi (kg)
   - Dhal (kg)
   - Sugar (kg)
   - Highland (units)
   - Yoghurt (units)
   - Flour (kg)
   - Soap (units)
4. **Payment processing**: Enter the amount given by customer
5. **Receive detailed bill** with:
   - Itemized list with quantities and prices
   - Subtotal and discount calculation
   - Final amount and change breakdown

## 📊 Sample Output

```
=====================================================================================

__            __  _                            _           _ __  __            _
\ \    /\    / / | |                          | |         (_)  \/  |          | |
 \ \  /  \  / /__| | ___ ___  _ ___ __   ___  | |_ ___     _| \  / | __ _ _ __| |_
  \ \/ /\ \/ / _ \ |/ __/ _ \| '_  `  \ / _ \ | __/ _ \   | | |\/| |/ _` | '__| __|
   \  /  \  /  __/ | (_| (_) | | | | | |  __/ | || (_) |  | | |  | | (_| | |  | |_
    \/    \/ \___|_|\___\___/|_| |_| |_|\___|  \__\___/   |_|_|  |_|\__,_|_|   \__|

=====================================================================================

+----------------------------------------------------------------+
|               _   _   __           _____ _______               |
|              (_) |  \/  |    /\   |  __ \__   __|              |
|               _  | \  / |   /  \  | |__) | | |                |
|              | | | |\/| |  / /\ \ |  _  /  | |                 |
|              | | | |  | | / ____ \| | \ \  | |                 |
|              |_| |_|  |_|/_/    \_\ |  \_\ |_|                 |
|                   225,Galle Road,Panadura                      |
+----------------------------------------------------------------+
```

## 🏗️ Project Structure

```
Bill-Printing-System/
├── BillPrint.java      # Main application source code
├── BillPrint.class     # Compiled Java bytecode
└── README.md          # Project documentation
```

## 🔍 Code Structure

- **Customer Input Section**: Handles customer information collection
- **Product Management**: Manages grocery items and pricing
- **Calculation Engine**: Performs price calculations and discount applications
- **Bill Generation**: Creates formatted receipts with ASCII art branding
- **Payment Processing**: Handles payment and change calculations
- **Currency Breakdown**: Provides detailed note and coin breakdown

## 🎯 Business Logic

1. **Pricing**: Fixed unit prices for all grocery items
2. **Discount**: Automatic 10% discount on total purchase
3. **Payment**: Supports cash payments with change calculation
4. **Currency**: Sri Lankan Rupees (LKR) with standard denominations:
   - Notes: Rs. 5000, 2000, 1000, 500, 100, 50, 20
   - Coins: Rs. 10, 5, 2, 1

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📝 License

This project is available for educational and commercial use. Please credit the original author when using this code.

## 👨‍💻 Author

**PasinduOG**  
- GitHub: [@PasinduOG](https://github.com/PasinduOG)

## 🆘 Support

For support, issues, or feature requests, please open an issue on GitHub or contact the development team.

---

*Built with ❤️ for efficient retail management*