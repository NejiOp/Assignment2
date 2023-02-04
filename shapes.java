package inheritance;

public class shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		square s=new square();
		s.getarea();
		s.getshape();
		circle c=new circle();
		c.getarea();
		c.getshape();
		}

}
class circle 
{
	public void getarea()
	{
		System.out.println("pi*(r*r)");
	}
	public void getshape()
	{
		System.out.println("circle have no shape it look like a egg");
	}
}
class square extends circle
{
	public void getarea()
	{
		System.out.println("side*side");
	}
	public void getshape()
	{
		System.out.println("square have four equal side ");
	}
}

