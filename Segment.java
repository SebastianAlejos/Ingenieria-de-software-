public class Segment {
	private Vertex v0;
	private Vertex v1;
	
	public Segment(double x0, double y0, double x1, double y1)
	{
		this.v0 = new Vertex(x0, y0);
		this.v1 = new Vertex(x1, y1);
	}
	
	public Segment(Vertex v0, Vertex v1)
	{
		this(v0.getX(), v0.getY(), v1.getX(), v1.getY());
	}
	
	public Segment(Segment s)
	{
		this(s.getBeginVertex(), s.getEndVertex());
	}
	
	public void setBeginVertex(double x, double y)
	{
		this.v0.setX(x);
		this.v0.setY(y);
	}
	
	public void setBeginVertex(Vertex v)
	{
		this.v0 = v;
	}
	
	public void setEndVertex(double x, double y)
	{
		this.v1.setX(x);
		this.v1.setY(y);
	}
	
	public void setEndVertex(Vertex v)
	{
		this.v1 = v;
	}
	
	public Vertex getBeginVertex()
	{
		return this.v0;
	}
	
	public Vertex getEndVertex()
	{
		return this.v1;
	}
	
	// Regresa true si el segmento (this) intersecta el segmento s
	public boolean intersect(Segment s){
		return (this.v0.isLeft(s) ^ this.v1.isLeft(s)) && (s.getBeginVertex().isLeft(this) ^ s.getEndVertex().isLeft(this));
	}
	
	public String toString()
	{
		return this.v0.toString() + this.v1.toString();
	}
	
	public static void main(String[] args) {
		Vertex v1 = new Vertex(0, 0);
		Vertex v2 = new Vertex(3, 0);
		Vertex v3 = new Vertex(2, 2);
		Vertex v4 = new Vertex(2, 1);
		Segment s1 = new Segment(v1, v2);
		Segment s2 = new Segment(v3, v4);		
		if(s1.intersect(s2))
			System.out.println("si intersectan");
		else
			System.out.println("no intersectan");
	}
}
