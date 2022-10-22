class Cuboid extends Rectangle{
	private double depth;
	
	public Cuboid(){
		depth=0.0;
	}
	
	public Cuboid(double h, double w, double d){
		super.setHeight(h);
		super.setWidth(w);
		depth=d;
		
	}
	
	public void setDepth(double d){
		depth=d;
	}
	
	public double getDepth(){
		return depth;
	}
	
	public double getArea(){
		return 2*((super.getHeight()*super.getWidth())+(super.getHeight()*depth)+(super.getWidth()*depth));
	}
	
	public String toString(){
		return super.toString() + "\nDepth : " + depth;
	} 
}

