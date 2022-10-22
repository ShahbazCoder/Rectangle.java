class Rectangle{
	private double height;
	private double width;
	
	public Rectangle(){
		height=0.0;
		width=0.0;
	}
	
	public Rectangle(double h, double w){
		height=h;
		width=w;
	}
	
	public void setHeight(double h){
		height=h;
	}
	
	public void setWidth(double w){
		width=w;
	}
	
	public double getHeight(){
		return height;
	}
	
	public double getWidth(){
		return width;
	}
	
	public double getArea(){
		return width*height;
	}
	
	public String toString(){
		return "Height : " + height + "Width : " + width;
	} 
}