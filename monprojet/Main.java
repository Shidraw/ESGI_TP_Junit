package monprojet;

public class Main {
	
	public static void main(String[] args) {
		SommeArgent somme1 = new SommeArgent(100, "$");
		SommeArgent somme2 = new SommeArgent(45, "€");
		SommeArgent somme3 = new SommeArgent(150, "CHF");
		SommeArgent somme4 = new SommeArgent(100, "$");
		System.out.println(somme1.equals(somme4));
		System.out.println(somme2.equals(somme3));
		System.out.println(somme1.equals(somme2));
	}
}
