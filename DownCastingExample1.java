//This is example of Downcasting using Mobile,Camera and Camera-Driver 
//Camera Class
package downcasting;

public class Camera 
{
	String brand;
	String compony;
	double price;
	int lens;
	char grade;
	
	
	public Camera() 
	{
		super();
	}
	
	Camera(String brand,String compony,double price,int lens,char grade)
	{
		this.brand=brand;
		this.compony=compony;
		this.price=price;
		this.lens=lens;
		this.grade=grade;
	}
	
	public void displayCamera()
	{
		System.out.println("Brand : "+brand);
		System.out.println("Compony : "+compony);
		System.out.println("Price : "+price);
		System.out.println("Lens : "+lens);
		System.out.println("Grade : "+grade);
		System.out.println("---------------------------------------");
	}
}
//-------------------------------------------------------------------
//Mobile class
package downcasting;

public class Mobile extends Camera
{
	String mname;
	String mbrand ;
	String color;
	double mprice;
	int ram;
	int rom;

	
	public Mobile() 
	{
		super();
	}
	
	Mobile(String brand,String compony,double price,int lens,char grade,String mname,String mbrand,String color,double mprice,int ram,int rom)
	{
		super(brand,compony,price,lens,grade);
		this.mname=mname;
		this.mbrand=mbrand;
		this.color=color;
		this.mprice=mprice;
		this.ram=ram;
		this.rom=rom;
	}
	
	public void displayMobile()
	{
		System.out.println("MName : "+mname);
		System.out.println("MBrand : "+mbrand);
		System.out.println("MColor : "+color);
		System.out.println("MPrice : "+mprice);
		System.out.println("RAM : "+ram);
		System.out.println("ROM : "+rom);
		System.out.println("------------------------------------");
	}
}
//--------------------------------------
//class Camera Driver
package downcasting;

public class CameraDriver 
{
	public static void main(String[] args) 
	{
		//Mobile m =new Mobile("Apple", "SONY", 45000.0, 4, 'B', "Nord ", "One Plus", "Black", 35000.0, 8, 64);
		
		//m.displayMobile();
		
		Camera m1 = new Mobile("Apple", "SONY", 45000.0, 4, 'B', "Nord ", "One Plus", "Black", 35000.0, 8, 64);
		 m1.displayCamera();//UpCasting
		//m1.displayMobile();//CTE
		
		Mobile m =(Mobile) m1;
		m.displayCamera();//DownCasting 
		m.displayMobile();
	}
}

