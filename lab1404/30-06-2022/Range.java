package element;

public class Range extends Exception {
	Range(int i)
	{
		super("Element at index"+i+"is out of Range:");
	}

}
