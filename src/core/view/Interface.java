package core.view;

import java.util.*;

public class Interface {
	
	public static int choice()
	{
		int choix;
		Scanner scan = new Scanner(System.in);
			choix=scan.nextInt();

		return choix;
	}
	public static int menu()
	{
		System.out.println("==================================Menu============================");
		System.out.println("Faites un chois parmi les options suivantes:\n");
		System.out.println("1.-Calcul de perimetre(carre,triangle,rectangle)\n"
				          +"2.-Calcul de surface(carre,triangle,rectangle)\n"
				          +"3.-Calcul d'expressions mathematiques\n");
		System.out.println("==================================================================");
		return 1;
	}
	
	
	
	public static int menu2 ()
	{
		System.out.println("==================================Menu2============================");
		System.out.println("Faites un chois parmi les options suivantes:\n");
		System.out.println("1.-Carre\n"
				          +"2.-Triangle\n"
				          +"3.-Rectangle");
		System.out.println("==================================================================");
		return 1;
	}
	
	public static int valCar()
	{
		System.out.println("Entrez le cote du carre");
		return choice();
	}
	
	public static int valATri()
	{
		System.out.println("Entrez le cote a du triangle");
		return choice();
	}
	
	public static int valBTri()
	{
		System.out.println("Entrez le cote b du triangle");
		return choice();
	}
	public static int valCTri()
	{
		System.out.println("Entrez le cote c du triangle");
		return choice();
	}
	public static int valBaseTri()
	{
		System.out.println("Entrez la base du triangle");
		return choice();
	}
	public static int valHautTri()
	{
		System.out.println("Entrez la hauteur du triangle ");
		return choice();
	}
	public static int valLongRect()
	{
		System.out.println("Entrez la longeur du rectangle");
		return choice();
	}
	public static int valLargRect()
	{
		System.out.println("Entrez la largeur");
		return choice();
	}
	
	public static String exprs()
	{
		System.out.println("Entrez l'expression");
		try (Scanner scan = new Scanner(System.in)) {
			String exp=scan.next();
			return exp;
		}
	}
	
	public static int app(int n)
	{
		System.out.println(n);
		return choice();
	}

}
