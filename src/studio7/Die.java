package studio7;

public class Die {

	
private int sides;

public Die (int n)
{
	sides = n;	
}
	
public static void main(String args[])
{
	Die DieA = new Die (20);
	System.out.println((int)(Math.random()*DieA.sides+1));
}	
}
