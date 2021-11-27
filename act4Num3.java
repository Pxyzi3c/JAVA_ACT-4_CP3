import java.util.Scanner;
public class act4Num3 {
    // Programmer: Harvy Jones Pontillas DICT 2-2
    public static void main (String[] args) {
        // Variables declaration
        int patientNum, roomCode;
        double doctorFee, miscFee, totalBill;
        String patientName;

        Scanner keyboard = new Scanner(System.in);

        // Get patient number from keyboard scanner
        System.out.print("\n\tPATIENT NO.\t : ");
        patientNum = keyboard.nextInt();
        // Get patient name from keyboard scanner
        System.out.print("\tPATIENT NAME\t : ");
        keyboard.nextLine();
        patientName = keyboard.nextLine();
        // Get doctor's fee from keyboard scanner
        System.out.print("\tDOCTOR'S FEE\t : $ ");
        doctorFee = keyboard.nextDouble();
        // Get miscellaneous fee from keyboard scanner
        System.out.print("\tMISCELLANEOUS FEE: $ ");
        miscFee = keyboard.nextDouble();
        // Get room code from keyboard scanner
        System.out.print("\tROOM CODE\t : ");
        roomCode = keyboard.nextInt();

        // Conditional if statement to test the corresponsing value room of room code
        if (roomCode == 1) {
            System.out.println("\tROOM\t\t : WARD"); // Output WARD if input is 1
        }
        else if (roomCode == 2) {
            System.out.println("\tROOM\t\t : SEMI-WARD"); // Ouput SEMI-WARD if input is 2
        }
        else if (roomCode == 3) {
            System.out.println("\tROOM\t\t : PRIVATE"); // Output PRIVATE if input is 3
        }
        else if (roomCode == 4) {
            System.out.println("\tROOM\t\t : OUT-PATIENT"); // Output OUT-PATIENT if input is 4
        }
        else {
            System.out.println("\t\t\t   INVALID INPUT"); // Output INVALID INPUT if input is out of the scope (1-4)
        }

        // Calculate and display the value of total bill
        totalBill = doctorFee + miscFee;
        System.out.printf("\tTOTAL BILL\t : $ %.2f", totalBill);
    }
}

/*Write a program based on the given output below
	
	PATIENT NO.:  
	PATIENT NAME:
	DOCTOR'S FEE
	MISCELLANEOUS FEE:
	ROOOM CODE:
	ROOM:
	TOTAL BILL:

	where:
		ROOM CODE	    ROOM
			1	        WARD
			2	        SEMI-WARD
			3	        PRIVATE
			4	        OUT-PATIENT
			OTHER	    INVALID INPUT

		TOTAL BILL = DOCTOR'S FEE + MISC FEE	
* */