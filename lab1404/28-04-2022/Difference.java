package hello;

public class Difference {
	public static void main(String[] args)
	{
		 String s="abc deg gh";
	
	
		StringBuilder obj=new StringBuilder("xyz");
	            s.concat(" ijkl");
		   obj.append(" pqr");
		   System.out.println(s);
		   System.out.println(obj);
		
	}
}
// String is immutable;
//Stringbuilder is mutable;
