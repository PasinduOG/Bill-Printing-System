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

- **Java Development Kit (JDK) 11 or higher** (recommended JDK 17+)
- **Java Runtime Environment (JRE)** (included with JDK)
- **Command Line Interface** (Terminal/Command Prompt)
- **Git** (for cloning the repository)

### System Requirements
- **OS**: Windows 10+, macOS 10.14+, or Linux (Ubuntu 18.04+)
- **RAM**: Minimum 512MB available memory
- **Storage**: 50MB free disk space

## 🔧 Installation & Setup

### Option 1: Clone from GitHub (Recommended)
1. **Clone the repository**:
   ```bash
   git clone https://github.com/PasinduOG/Bill-Printing-System.git
   cd Bill-Printing-System
   ```

### Option 2: Download ZIP
1. Download the ZIP file from the repository
2. Extract to your desired location
3. Open terminal/command prompt in the extracted folder

### Compilation and Execution
1. **Compile the Java program**:
   ```bash
   javac BillPrint.java
   ```

2. **Run the application**:
   ```bash
   java BillPrint
   ```

### Quick Start (Windows)
```cmd
# Navigate to project directory
cd /d "C:\path\to\Bill-Printing-System"

# Compile and run
javac BillPrint.java && java BillPrint
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

## 🔧 Troubleshooting

### Common Issues

**Issue**: `javac: command not found` or `java: command not found`
- **Solution**: Ensure Java JDK is installed and added to your system PATH
- **Windows**: Add Java bin directory to Environment Variables
- **macOS/Linux**: Update your `.bashrc` or `.zshrc` with Java path

**Issue**: `Error: Could not find or load main class BillPrint`
- **Solution**: Ensure you're in the correct directory containing `BillPrint.class`
- Run `javac BillPrint.java` first to compile the program

**Issue**: Input validation errors
- **Solution**: Enter only numeric values for quantities and amounts
- Use integers for quantities and decimal numbers for payment amounts

**Issue**: Currency calculation inconsistencies
- **Solution**: Ensure payment amount is equal to or greater than the final bill amount
- The system only handles positive integer change amounts

### Performance Tips
- For better performance with large transactions, ensure sufficient heap memory
- The application is optimized for typical grocery store transaction volumes

## 📊 Sample Output

### Welcome Screen
```
=====================================================================================

__            __  _                            _           _ __  __            _
\ \    /\    / / | |                          | |         (_)  \/  |          | |
 \ \  /  \  / /__| | ___ ___  _ ___ __   ___  | |_ ___     _| \  / | __ _ _ __| |_
  \ \/ /\ \/ / _ \ |/ __/ _ \| '_  `  \ / _ \ | __/ _ \   | | |\/| |/ _` | '__| __|
   \  /  \  /  __/ | (_| (_) | | | | | |  __/ | || (_) |  | | |  | | (_| | |  | |_
    \/    \/ \___|_|\___\___/|_| |_| |_|\___|  \__\___/   |_|_|  |_|\__,_|_|   \__|

=====================================================================================
```

### Sample Bill Receipt
```
+----------------------------------------------------------------+
|               _   _   __           _____ _______               |
|              (_) |  \/  |    /\   |  __ \__   __|              |
|               _  | \  / |   /  \  | |__) | | |                |
|              | | | |\/| |  / /\ \ |  _  /  | |                 |
|              | | | |  | | / ____ \| | \ \  | |                 |
|              |_| |_|  |_|/_/    \_\ |  \_\ |_|                 |
|                   225,Galle Road,Panadura                      |
+----------------------------------------------------------------+
|                   # Tel  : 0771234567                         |
|                   # Name : John Doe                           |
+----------------------------------------------------------------+
|                |    Qty   |   unit price   |       Price       |
+----------------+-----------------------------------------------+
| # Basmathi     |      2   |        250.0 |       500.0      |
| # Dhal         |      1   |        180.0 |       180.0      |
| # Highland     |      1   |       1200.0 |      1200.0      |
+----------------------------------------------------------------+
|                           |  Total         |      1880.0      |
|                           +----------------+-------------------+
|                           |  discount(10%) |       188.0      |
|                           +----------------+-------------------+
|                           |  Price         |      1692.0      |
+---------------------------+----------------+-------------------+

+----------------+--------------------+
|   Net Amount   |   1692.0           |
+----------------+--------------------+
|   Cash         |   2000.0           |
+----------------+--------------------+
|   Change       |   308              |
+----------------+--------------------+

+-----------------+-------------+
|      Value      |     No      |
+-----------------+-------------+
|     Rs.100      |      3      |
|     Rs.5        |      1      |
|     Rs.2        |      1      |
|     Rs.1        |      1      |
+-----------------+-------------+
|   No of Notes   |      3      |
|   No of Coins   |      3      |
+-----------------+-------------+
```

## 🏗️ Project Structure

```
Bill-Printing-System/
├── .gitignore          # Git ignore rules for Java projects
├── BillPrint.java      # Main application source code
└── README.md          # Project documentation
```

> **Note**: Compiled `.class` files are automatically ignored and not tracked in version control.

## 🔍 Code Structure

### Main Components

- **Customer Input Section**: 
  - Scanner-based input collection
  - Phone number and name validation
  - User-friendly prompts and formatting

- **Product Management**: 
  - Hard-coded inventory with predefined prices
  - Support for both weight-based (kg) and unit-based items
  - Extensible design for adding new products

- **Calculation Engine**: 
  - Real-time price calculations per item
  - Automatic subtotal computation
  - Fixed 10% discount application
  - Final amount determination

- **Bill Generation**: 
  - ASCII art company branding
  - Formatted receipt layout with borders
  - Professional table structure
  - Customer information display

- **Payment Processing**: 
  - Cash payment acceptance
  - Change calculation with precision
  - Input validation for payment amounts

- **Currency Breakdown**: 
  - Sri Lankan Rupee denomination breakdown
  - Optimized note and coin distribution
  - Separate counting for notes vs coins
  - Mathematical algorithms for change optimization

### Technical Implementation
- **Language**: Java (Console Application)
- **Architecture**: Procedural programming with main method execution
- **Input/Output**: Scanner class for user input, System.out for formatted output
- **Data Types**: Appropriate use of int, double, and String for different data requirements

## 🎯 Business Logic

1. **Pricing**: Fixed unit prices for all grocery items
2. **Discount**: Automatic 10% discount on total purchase
3. **Payment**: Supports cash payments with change calculation
4. **Currency**: Sri Lankan Rupees (LKR) with standard denominations:
   - Notes: Rs. 5000, 2000, 1000, 500, 100, 50, 20
   - Coins: Rs. 10, 5, 2, 1

## 🤝 Contributing

We welcome contributions to improve the Bill Printing System! Here's how you can contribute:

### Development Setup
1. Fork the repository on GitHub
2. Clone your fork locally:
   ```bash
   git clone https://github.com/yourusername/Bill-Printing-System.git
   ```
3. Create a new feature branch:
   ```bash
   git checkout -b feature/AmazingFeature
   ```

### Making Changes
1. **Code Style**: Follow Java naming conventions and best practices
2. **Testing**: Test your changes thoroughly with various input scenarios
3. **Documentation**: Update README.md if you add new features
4. **Comments**: Add meaningful comments for complex logic

### Submitting Changes
1. Commit your changes with a descriptive message:
   ```bash
   git commit -m 'Add: New feature for inventory management'
   ```
2. Push to your branch:
   ```bash
   git push origin feature/AmazingFeature
   ```
3. Open a Pull Request with:
   - Clear description of changes
   - Screenshots if UI changes are involved
   - Test cases covered

### Contribution Ideas
- Add input validation and error handling
- Implement database connectivity for product management
- Create a GUI version using JavaFX or Swing
- Add support for multiple currencies
- Implement receipt printing functionality
- Add inventory management features

## 📝 License

This project is available for educational and commercial use. Please credit the original author when using this code.

## 📈 Changelog

### Version 1.1.0 (Current)
- ✅ Enhanced `.gitignore` with comprehensive Java exclusions
- ✅ Updated README with detailed documentation
- ✅ Added troubleshooting section
- ✅ Improved installation instructions
- ✅ Added sample output examples

### Version 1.0.0 (Initial Release)
- ✅ Basic bill printing functionality
- ✅ Customer information management
- ✅ Product catalog with fixed pricing
- ✅ Automatic discount calculation (10%)
- ✅ Currency breakdown for change
- ✅ ASCII art branding and professional bill format

## 🎯 Future Enhancements

- [ ] **Database Integration**: MySQL/PostgreSQL support for dynamic inventory
- [ ] **GUI Interface**: JavaFX-based graphical user interface
- [ ] **Receipt Printing**: Direct printer integration
- [ ] **Multi-language Support**: Sinhala and Tamil language options
- [ ] **Barcode Scanning**: Product identification via barcode
- [ ] **Tax Calculations**: VAT and other tax computations
- [ ] **Customer Database**: Loyalty program and customer history
- [ ] **Inventory Management**: Stock tracking and low-stock alerts
- [ ] **Sales Reports**: Daily, weekly, and monthly sales analytics
- [ ] **Mobile App**: Android/iOS companion application

## 👨‍💻 Author

**PasinduOG**  
- GitHub: [@PasinduOG](https://github.com/PasinduOG)

## 🆘 Support

For support, issues, or feature requests, please open an issue on GitHub or contact the development team.

---

*Built with ❤️ for efficient retail management*