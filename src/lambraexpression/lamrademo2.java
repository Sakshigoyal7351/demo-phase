package lambraexpression;
interface A
{
	public void show(int i);
}
/*class xyz implements A
{
	public void show()
	{
		System.out.println("hello");
	}
}*/
public class lamrademo2 {
	public static void main(String[] args)
	{
		A obj;// reference of interface because we can not create the object of an interface. 
		
		obj=i ->System.out.println("hello"+i);// lamra expression
		obj.show(6);
	}

}
