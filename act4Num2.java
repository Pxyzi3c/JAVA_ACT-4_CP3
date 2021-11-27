import java.util.Scanner;
public class act4Num2 {
    // Programmer: Harvy Jones Pontillas DICT 2-2
    public static void main(String[] args){
        // Variables declaration
        int empNum, maritalStatCode;
        double basicPay, allowance, overtimePay, sss, pagIbig, wTax, grossPay, totalDeduc, netPay;
        String empName;

        Scanner keyboard = new Scanner(System.in);

        // Get employee number from the keyboard scanner
        System.out.print("\nEMPLOYEE NUMBER\t\t: ");
        empNum = keyboard.nextInt();
        // Get employee name from the keyboard scanner
        System.out.print("EMPLOYEE NAME\t\t: ");
        keyboard.nextLine();
        empName = keyboard.nextLine();
        // Get merital status code from the keyboard scanner
        System.out.print("MARITAL STATUS CODE\t: ");
        maritalStatCode = keyboard.nextInt();

        // Conditional if statement to test the typed marital status code
        if(maritalStatCode == 1) {
            System.out.println("MARITAL STATUS\t\t: SINGLE"); // Output if input is 1
        }
        else if(maritalStatCode == 2) {
            System.out.println("MARITAL STATUS\t\t: MARRIED"); // Output if input is 2
        }
        else if(maritalStatCode == 3) {
            System.out.println("MARITAL STATUS\t\t: WIDOWED"); // Output if input is 3
        }
        else {
            System.out.println("\t\tINVALID INPUT"); // Output if typed a character/ number out of scope (1-3)
        }

        // Get basic pay value from the keyboard scanner
        System.out.print("BASIC PAY\t\t: $ ");
        basicPay = keyboard.nextDouble();
        // Get allowance value from the keyboard scanner
        System.out.print("ALLOWANCE\t\t: $ ");
        allowance = keyboard.nextDouble();
        // Get overtime value from the keyboard scanner
        System.out.print("OVERTIME PAY\t\t: $ ");
        overtimePay = keyboard.nextDouble();

        // Calculate and display the value of sss
        sss = basicPay * .03;
        System.out.printf("SSS\t\t\t: $ %.2f", sss);
        // Calculate and display the value of pag-ibig
        pagIbig = basicPay * .02;
        System.out.printf("\nPAG-IBIG\t\t: $ %.2f", pagIbig);
        // Calculate and display the value of withholding tax
        wTax = basicPay * .10;
        System.out.printf("\nWITHHOLDING TAX\t\t: $ %.2f", wTax);
        // Calculate and display the value of gross pay
        grossPay = basicPay + overtimePay + allowance;
        System.out.printf("\nGROSS PAY\t\t: $ %.2f", grossPay);
        // Calculate and display the value of total deduction
        totalDeduc = sss + pagIbig + wTax;
        System.out.printf("\nTOTAL DEDUCTION\t\t: $ %.2f", totalDeduc);
        // Calculate and display the value of net pay
        netPay = grossPay - totalDeduc;
        System.out.printf("\nNET PAY\t\t\t: $ %.2f", netPay);
    }
}

/*2.  Write a  program that will input, process and output the following:

	EMPLOYEE NUMBER:
	EMPLOYEE NAME:
	MARITAL STATUS CODE:
	MARITAL STATUS: 
	BASIC PAY:
	ALLOWANCE:
	OVERTIME PAY:
	SSS:
	PAG-IBIG:
	WITHHOLDING TAX: 
	GROSS PAY:
	TOTAL DEDUCTION:
	NET PAY:

		where:

MARITAL  STATUS CODE			MARITAL STATUS
        1	                        SINGLE
        2	                        MARRIED
        3	                        WIDOW
        OTHERS				        INVALID INPUT


		SSS is 3% of BASIC PAY
		PAG-IBIG is 2% of the BASIC PAY
		WTAX is 10% of BASIC PAY

		GROSS PAY is equal to BASIC PAY + OVERTIME PAY + ALLOWANCE
		TOTAL DEDUCTION = SSS+ PAG-IBIG + WTAX
		NET PAY = GROSS PAY - TOTAL DEDUCTION
* */