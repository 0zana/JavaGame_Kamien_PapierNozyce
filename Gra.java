import java.util.Random;
import java.util.Scanner;

public class Gra {
	static int punkty;
	static int rundy;
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Witaj w grze kamień-papier-nożyce!");
		System.out.println("Gra toczy się aż do 3 punktów przewagi");
		rozpocznijGre();
		int punkty;
		int rundy;
	}
	public static void rozpocznijGre() {
		while (punkty<3) {
			ilePunktow();
			wygrany(wyborUzytkownika(),losowanie());		
		}
		System.out.println("Brawo! Wygrałeś/Wygrałaś!);
	}
	public static void ilePunktow() {
		System.out.println(" ");
		System.out.println("Twoje punkty: " + punkty);
		System.out.println("Liczba rund: " + rundy);
	}
	public static int wyborUzytkownika() {
		System.out.println("Wybierz 0 jeśli wybierasz kamień"
				+ "\n wybierz 1 jeśli wybierasz papier"
				+ "\n wybierz 2 jeśli wybierasz nożyce");
		int wybor = scanner.nextInt();
		switch(wybor) {
		case 0:
			wybor = 0;
			break;
		case 1:
			wybor = 1;
			break;
		case 2:
			wybor = 2;
			break;
		}
		return wybor;
		
	}
	public static int losowanie() {
		Random random = new Random();
		int wylosowane = random.nextInt(3);
		return wylosowane;
	}
	public static void wygrany(int wyborUzytkownika, int wyborLosowy) {
		klucz(wyborUzytkownika);
		if (wyborUzytkownika<3){
			klucz(wyborLosowy);
		}
		if (wyborUzytkownika<3) {
			if (wyborUzytkownika==wyborLosowy){
				System.out.println("To samo!");
			}
			else if((wyborUzytkownika==wyborLosowy-1)||(wyborUzytkownika==wyborLosowy-2)||(wyborUzytkownika==wyborLosowy+2)) {
				System.out.println("Niestety!");
			}
			else {
				System.out.println("Brawo!");
				punkty++;
			}
			rundy++;
		}
	}
	public static void klucz(int wybor) {
		if (wybor==0) {
			System.out.println("kamień");
		}
		else if(wybor == 1){
			System.out.println("papier");
		}
		else if (wybor == 2){
			System.out.println("nożyce");
		}
		else {
			System.out.println("Wybrano zły numer!");
		}
	}
	
}
