import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
	        int response = 0;
	        int endResponse = 2;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Welcome!");
	        do{
	            System.out.println("1 : Enter denomination");
	            System.out.println("2 : Exit");
	            response = sc.nextInt();
	            if(response==1){
	                showDenomination(sc);
	            }
	        }
	        while(response!=endResponse);
	        sc.close();
	    }

	    private static void showDenomination(Scanner sc) {
	        System.out.println("enter the amount you want to pay");
	        int response = sc.nextInt();
	        Denominations denominations = new Denominations(response);
	       
	        int[] amountofCurrency = denominations.getDenominations();
	        int[] numberOfCurrency = denominations.getNumberOfCurrency();
	        System.out.println("Your payment approach in order to give min no of notes will be : ");
	        for(int i=0; i<9; i++){
	            if (numberOfCurrency[i]!=0) {
	                System.out.println(amountofCurrency[i] + " x " + numberOfCurrency[i]);
	            }
	        }
	        System.out.println("");
	    }
}
