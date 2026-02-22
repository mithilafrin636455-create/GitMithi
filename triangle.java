	public class triangle extends shape{
		private double y;
		public triangle(){
		System.out.println("Empty Parameter");
	}
		public triangle(double x){
			super(x);
			System.out.println("parameterized constructor");
			this.y=y;
			}

	public void setY(double y){this.y=y;}
	public double getY(){return y;}
	public double getArea(){return 0.5*x*y;}
	}
