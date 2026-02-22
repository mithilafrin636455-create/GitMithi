public class Circle extends shape{
	public Circle(){
		System.out.println("Empty constructor");
	}
	public Circle(double x){
		super(x);
		System.out.println("Para circle");
	}
	public double getArea(){return 3.1416*x*x;}
}