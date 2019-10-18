import java.util.ArrayList;

public class Vertex {
	private double x;
	private double y;
	
	public Vertex(double x, double y)
	{	
		this.x = x;
		this.y = y;
	}
	
	public Vertex()
	{
		this(0., 0.);
	}
	
	public Vertex(Vertex v)
	{	
		this(v.getX(), v.getY());
	}
	
	public void setX(double x)
	{
		this.x = x;
	}
	
	public void setY(double y)
	{
		this.y = y;
	}
	
	public double getX()
	{
		return this.x;
	}
	
	public double getY()
	{
		return this.y;
	}
	
	// Regresa true si el v�rtice (this) est� a la izquierda del segmento s
	public boolean isLeft(Segment s){
		return ((s.getEndVertex().getY()-s.getBeginVertex().getY())*(this.x-s.getBeginVertex().getX())) - ((this.y-s.getBeginVertex().getY())*(s.getEndVertex().getX()-s.getBeginVertex().getX())) < 0;
	}
	
	public String toString()
	{
		return "(" + this.x + ", " + this.y + ")";
	}
	
	public static void main(String[] args) {
		Vertex v = new Vertex(5, 5);
        System.out.println(v);
        if (v.isLeft(new Segment(1, 0, 5, 6))) System.out.println("Vertice a la izquierda");
        else System.out.println("Vertice a la derecha");
	}
}
