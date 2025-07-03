//This Program shows us why ClassCastException occurs
package downcasting;

public class FatherDriver 
{
	public static void main(String[] args) {
		Father s1=new Father("Rajendra",50);
		s1.displayFather();
		
		//below are down casting 
		Son s2=(Son) s1 ;// java.lang.ClassCastException
		s2.displayFather();
		s2.displaySon();
	}

}
//Object of Son is not Upcasted to Father but we try downcasting of reference variable of Father to the son 
//Explicitelly thats why its throws the error i.e. ClassCastException.
