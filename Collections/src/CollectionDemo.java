import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class CollectionDemo {

	public CollectionDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Comparator<Integer> secondIntComparator = new Comparator<Integer>() {
		            public int compare(Integer I1, Integer I2) {
		            return I2.compareTo(I1);
		        }

					    
		    };
		 SortedMap<Integer,Integer> map =
			        new TreeMap<Integer,Integer>(secondIntComparator);
			    map.put(103, 3);
			    map.put(101, 90);
			    map.put(102, 388);
			    System.out.println(map);
	}

}
