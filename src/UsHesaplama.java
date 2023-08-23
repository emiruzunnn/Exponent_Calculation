import java.util.Iterator;
import java.util.Scanner;

public class UsHesaplama {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n,k;
		System.out.print("Ussu alinacak sayi: ");
		n = scanner.nextInt();
		System.out.print("Us olacak sayi: ");
		k = scanner.nextInt();
		int total = 1;
		
	    for (int i = 1; i <= k; i++) {
			total *= n;
		}
	    System.out.print("Cevap: " + total);

	}

}
