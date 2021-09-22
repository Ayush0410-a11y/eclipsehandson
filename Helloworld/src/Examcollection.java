import java.util.ArrayList;
import java.util.Iterator;
public class Examcollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		//non grngric
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(null);
		//generic collection--> type of objects need to be collected by the collection
		// <wrapper calss /userdefined class>
		System.out.println(al);
//	  	for(int i=0;i<al.size();i++) {
//			// if u want to acess a value in a specific location of a collection then we use get()
//			if(al.get(i)==200) {
//				System.out.println("found 200 at "+i);
//				
//			}
//		}

		//******************************//Iterator//*******************************************
		Iterator i =al.iterator();// we get the base address of the array list stored in the iterator
		//331245--->0th index(adress)
		i.hasNext();//hasNext does checks whether u have the value in the location
		while(i.hasNext()) {
			System.out.println(i.next());// next does getting/printing the value present in the location and the iterator to next location 
		}
	}

}
