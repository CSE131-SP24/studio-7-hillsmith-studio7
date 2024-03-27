package studio7;

public class Rectangle {
	
private int length;
private int width;
private int area;
private int perimeter;
private String type;

public Rectangle(int initwidth, int initlength)
{
	length = initlength;
	width=initwidth;
	area=length*width;
	perimeter = (2*length)+(2*width);
	if (length==width)
	{
		type="Square";
	}
	else
	{
		type="Rectangle";
	}
}

public int getLength() {
	return length;
}

public int getWidth() {
	return width;
}

public int getArea() {
	return area;
}

public int getPerimeter() {
	return perimeter;
}

public String getType() {
	return type;
}

public static void main(String args[]) {
Rectangle recA = new Rectangle(8,8);
Rectangle recB = new Rectangle (16,4);
System.out.println("A is a "+recA.type);
System.out.println("B is a "+recB.type);
if (recA.area>recB.area)
{
	System.out.println("A is bigger than B");
}
else if (recA.area<recB.area)
{
	System.out.println("B is bigger than A");
}
else
{
	System.out.println("They are of equal size.");
}
}
}
