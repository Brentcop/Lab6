import java.util.Scanner;

public class lab6 {
static String ans ="";
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the Grand Circus Casino!");		
		diceRoll();
		}
	
	public static void diceRoll (){
		Scanner scan = new Scanner(System.in);
		do {
		System.out.println("How man sides should each die have?");
		int dice = scan.nextInt();
		int diceRoll = (int) (Math.random() * dice + 1);
		int diceRoll2 = (int) (Math.random() * dice + 1);

		System.out.println("Role 1: " + diceRoll);
		System.out.println("Role 2: " + diceRoll2);
		int sum = diceRoll + diceRoll2;

		if(diceRoll == 1 && diceRoll2 == 1) {
			System.out.println("Snake eyes!!!");}
		if(diceRoll ==4 && diceRoll2 == 4) {
			System.out.println("Box cars!!");}
		if(sum == 7 || sum == 11) {
			System.out.println("Craps!!");}
		scan.nextLine();
		System.out.println("Roll again? (y/n)");
		ans = scan.next();
		}while (ans.equals("y"));
		scan.close();
		System.out.println("Goodbye");
		}
}
