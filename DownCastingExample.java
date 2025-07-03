//We cannot do downcasting without upcasting 
//Class Father
package downcasting;

public class Father 
{
	String add="Pune";
	String fname;
	int fage;
	public Father() 
	{
		super();
	}
	public Father(String fname,int fage)
	{
		super();
		this.fname=fname;
		this.fage=fage;
	}
	public void displayFather()
	{
		System.out.println("Father Name : "+fname);
		System.out.println("Father age : "+fage);
	}
	
	public void displayAdd()
	{
		System.out.println(add);
	}
}
//-----------------------------------------------------------
//class Son 
package downcasting;

public class Son extends Father
{
	String sname;
	int sage;
	String add="Bombay";
	
	public Son(String fname,int fage,String sname,int sage)
	{
		super(fname,fage);
		this.sname=sname;
		this.sage=sage;
	}
	public void displaySon()
	{
		displayFather();
		System.out.println("Child name : "+sname);
		System.out.println("Child age : "+sage);
	}
}
//---------------------------------------------------------------
//class FatherDriver
package downcasting;

public class FatherDriver 
{
	public static void main(String[] args) {
		Father s1=new Son("Rajendra",50,"Swapnil",24);
		s1.displayFather();//up casting
		
		//below are down casting 
		Son s2=(Son) s1 ;
		s2.displayFather();
		s2.displaySon();
	}

}

