package lambraexpression;


import java.util.Arrays;
import java.util.List;

public class demoforeach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> values=Arrays.asList(4,5,6,7,8);
		/*for(int i=0;i<values.size();i++)
		{
			System.out.println(values.get(i));
		}*/
		
		/*for(int i : values)
		{
			System.out.println(i);
		}*/
		
		values.forEach(i -> System.out.println(i));  //Lambda

	}

}
