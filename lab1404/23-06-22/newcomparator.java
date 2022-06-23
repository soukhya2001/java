package calculate;
import java.util.Comparator;

public class newcomparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.name.compareToIgnoreCase(o2.name);
	}

}
