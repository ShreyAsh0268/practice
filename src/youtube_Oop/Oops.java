package youtube_Oop;

class Pen{
	String type;
	String color;
	
	public void write() {
		System.out.println("Writing Somthing");
	}
	public void penColor() {
		System.out.println(this.color);
	}
}
public class Oops {

	public static void main(String[] args) {
		
		Pen p1=new Pen();
		p1.write();
		p1.color="Red";
		p1.penColor();

	}

}
