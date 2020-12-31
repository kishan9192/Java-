
import java.util.ArrayList;
import java.util.List;


public class Fruits {

	private List<String> fruitsList;

	public List<String> getFruitsList() {
		return fruitsList;
	}

	public void setFruitsList(List<String> fruitsList) {
		this.fruitsList = fruitsList;
	}

	public Fruits(List<String> fl) {
		this.fruitsList = fl;
	}
	
	public Fruits(Fruits fr) {
		List<String> fl = new ArrayList<>();
		for (String f : fr.getFruitsList()) {
			fl.add(f);
		}
		this.fruitsList = fl;
	}



	public static void main(String[] args) {
		List<String> fl = new ArrayList<>();
		fl.add("Mango");
		fl.add("Orange");

		Fruits fr = new Fruits(fl);

		System.out.println(fr.getFruitsList());

		// Here since the constructors are getting copied by equals to sign
		// therefore if we change the array in one object, it'll also change 
		// in the other object, because the changes are being performed on
		// the dynamically allocated memory, hence changes are done at the actual address.
		Fruits frCopy = fr;
		frCopy.getFruitsList().add("Apple");

		System.out.println(fr.getFruitsList());

		// Copying the constructor in this style
		// by making a copy constructor, involves creating of new list inside
		// the constructor, and that fresh list is allocated to the copied object.
		// Now the changes in one object will not be reflected in the other object.
		frCopy = new Fruits(fr);
		frCopy.getFruitsList().add("Banana");
		System.out.println(fr.getFruitsList());
		System.out.println(frCopy.getFruitsList());

	}

}