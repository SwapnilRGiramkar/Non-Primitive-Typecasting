//This is the example of combination of Upcasting and Downcasting 
//class Camera
package upcasting;

public class Camera extends Object
{
	String brand;
	int px;
	double price;
	int lens;
	String type;
	public Camera() 
	{
		super();
	}
	
	Camera(String brand,int px,double price,int lens,String type)
	{
		this.brand=brand;
		this.px=px;
		this.price=price;
		this.lens=lens;
		this.type=type;
	}
	
	public void displayCamera()
	{
		System.out.println("Brand : "+brand);
		System.out.println("Pixels : "+px);
		System.out.println("Price : "+price);
		System.out.println("Type : "+type);
		System.out.println("Lens : "+lens);
		System.out.println("--------------------------------------- ");
	}
}
//----------------------------------------------------------------------------------------
//class Mobile
package upcasting;

public class Mobile extends Camera
{
	String name;
	String brand;
	double price;
	int ram;
	int rom;
	
	public Mobile() 
	{
		super();
	}
	
	Mobile(String name,String mbrand,double mprice,int ram,int rom,String brand,int px,double price,int lens,String type)
	{
		super(brand,px,price,lens,type);
		price=mprice;
		brand=mbrand;
		this.name=name;
		this.ram=ram;
		this.rom=rom;
	}
	
	public void displayMobile()
	{
		System.out.println("Name : "+name);
		System.out.println("Brand : "+brand);
		System.out.println("Price : "+price);
		System.out.println("RAM : "+ram);
		System.out.println("ROM : "+rom);
		System.out.println("--------------------------------------- ");
	}
}
//---------------------------------------------------------------------------------
//class CameraDriver
package upcasting;

public class CameraDriver 
{
	public static void main(String[] args) 
	{
		Camera c1=new Mobile("iphone 17 air", "Apple", 23000.0, 4, 256, "SONY", 40, 200000.0, 5, "HandHeld");//upcasting 
		c1.displayCamera();
		System.out.println("Below are Downcasting ");
		Mobile c=(Mobile)c1;//downcasting 
		c.displayMobile();
		System.out.println("Features of camera");
		c.displayCamera();
	}
}

