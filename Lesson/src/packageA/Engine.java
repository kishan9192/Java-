package packageA;

public class Engine {
	public String Enginepower;
	public String Enginename;
	
	public void setenginename(String Enginename) {
		this.Enginename = Enginename;
	}
	
	public void setenginepower(String Enginepower) {
		this.Enginepower = Enginepower;
	}
	
	public void getenginepower() {
		System.out.println(this.Enginepower);
	}
	
	public void getenginename() {
		System.out.println(this.Enginename);
	}
	
}
