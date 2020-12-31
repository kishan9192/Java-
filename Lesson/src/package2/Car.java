package package2;
import packageA.Engine;

// Composition in Java
// https://youtu.be/VfTiLE3RZds
public class Car {
	public String name;
	public String color;
	
	private Engine engine;
	public void setcolor(String color) {
		this.color = color;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	public void getcolor() {
		System.out.println(this.color);
	}
	
	public void getname() {
		System.out.println(this.name);
		
	}
	
	Car(String name, String color, String enginename, String enginepower) {
		this.engine = new Engine();
		this.engine.Enginename = enginename;
		this.engine.Enginepower = enginepower;
		this.name = name;
		this.color = color;
	}
	
	public void getenginepower() {
		System.out.println(this.engine.Enginepower);
	}
	
	public void getenginename() {
		System.out.println(this.engine.Enginename);
	}
	
	public static void main(String args[]) {
		Car newcar = new Car("Maruti", "White", "AC800", "320BHP");
		newcar.getname();
		newcar.getcolor();
		newcar.getenginepower();
		newcar.getenginename();
	}
	
}
