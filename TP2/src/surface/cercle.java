package surface;

public class cercle {
	final double PI=3.14 ;
	double r ;
	
	public cercle(double a) {
		this.r=a;
	}
	public cercle() {}
	
	public double calculersurface() {
		return PI*r*r;
		}
			

}
