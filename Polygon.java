import java.util.ArrayList;

public class Polygon {
	private ArrayList<Vertex> vertexList;
	
	public Polygon(ArrayList<Vertex> vertexList)
	{
		this.vertexList = vertexList;	// aggregation
	}
	
	public String toString()
	{
		String str = "";
		for(int i = 0; i < this.vertexList.size(); i++)
		{
			str = str + this.vertexList.get(i) + ", ";
		}
		return str;
	}
}
