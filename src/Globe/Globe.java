package Globe;

public class Globe implements Solid
{
	private double r;
	public Globe(double r)
	{
		this.r = r;
	}
	public double area()
	{
		return 4*3.14*this.r*this.r;
	}
	public double volume()
	{
		return (4*3.14*this.r*this.r*this.r)/3;
	}
	public String toString()
	{
		String s;
		s = "球的表面积是： "+this.area() + "\n" + "球的体积是： " + this.volume();
		return s;
	}
}
