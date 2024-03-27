package studio7;

public class Fraction {

private int numerator;
private int denominator;

public Fraction(int x, int y)
{
	numerator = x;
	denominator = y;
}

public static void main(String args[])
{
	Fraction f1 = new Fraction(25,50);
	Fraction f2 = new Fraction(2,3);
	Fraction f1expanded = new Fraction(f1.numerator*f2.denominator,f1.denominator*f2.denominator);
	Fraction f2expanded = new Fraction(f2.numerator*f1.denominator,f1.denominator*f2.denominator);
	Fraction sum = new Fraction(f1expanded.numerator+f2expanded.numerator,f1expanded.denominator);
	Fraction product = new Fraction(f1.numerator*f2.numerator,f1.denominator*f2.denominator);
	Fraction reciprocal = new Fraction(f1.denominator,f1.numerator);
	int gcd=1;
	for(int n = 2;n<=product.numerator;n++)
	{
		if(product.numerator%n==0 && product.denominator%n==0)
		{
			gcd=n;
		}
		
	}
	
	Fraction simplified = new Fraction(product.numerator/gcd,product.denominator/gcd);
	System.out.println(simplified.numerator+"/"+simplified.denominator);
}
}

