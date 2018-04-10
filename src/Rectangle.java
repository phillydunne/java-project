public class Rectangle {
	public int length;
	public int width;
	
	public Rectangle(int length, int width) { 
	//This is known as a contructor, it defines what an object looks like
		this.length = length;
		this.width = width;
				
	}
	
	public int getArea() {
		return length * width;
	 	
	}
	
	public int getPerimeter() {
		return 2 * (length + width);
		
		}
	
	
}