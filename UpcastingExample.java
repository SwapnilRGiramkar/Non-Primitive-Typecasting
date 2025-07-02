//Class Father
//Upcasting is process of converting or Storing the Subclass reference into super class type is known as Upcasting 
package upcasting;

public class Father 
{
	public void drinking()
	{
		System.out.println("Old Monk");
	}

}
//-------------------------------------------------------
package upcasting;

public class Son extends Father
{
	public void smoking()
	{
		System.out.println("Cigarrates");
	}
}
//------------------------------------------------------
package upcasting;

public class FatherSonDriver
{
	public static void main(String[] args) 
	{
		Father f1= new Son();
		f1.drinking();
		//f1.smoking(); //Compile Time Error
		
		Son s1=new Son();
		s1.drinking();
		s1.smoking();
		
		Father f=new Father();
		f.drinking();
		//f.smoking();//CTE
	}
}
//-------------------------------------------------------
