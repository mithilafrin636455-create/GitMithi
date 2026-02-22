import java.lang.*;
public class rectangle extends shape
{
	private double y;
	public rectangle ()
	{
		System.out.println("Empty -Rectangle");
	}
	public rectangle(double x,double y)
	{
		super(x);
		System.out.println("Para-Rectangle");
		this.y=y;
	}
	public void setY(double y){this.y=y;}
	public double getY(){return y;}
	public double getArea(){return x*y;}
}