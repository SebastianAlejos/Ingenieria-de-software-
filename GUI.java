import java.util.ArrayList;

// Checa si v es un punto v�lido para agregar al poligono formado por la lista de v�rrices vertexList
// Checa si el ultimo segemnto intersecta alguno de los segmentos del pol�gono

public class GUI {
	
	private static boolean checkFullIntersect(ArrayList<Vertex> vertexList, Vertex v)
	{
		int n = vertexList.size();
		Segment s1 = new Segment(v, vertexList.get(n-1));
		for(int i = 0; i < n-1; i++)
		{
			Segment s2 = new Segment(vertexList.get(i), vertexList.get(i+1));
			if(s1.intersect(s2))
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		ArrayList<Vertex> vertexList = new ArrayList<Vertex>();	// Lista de vertices del pol�gono
		Vertex v0 = new Vertex(0, 0);	// El usuario da un click en (0, 0)
		vertexList.add(v0);		// Se agrega v0 a la lista de v�rtices
		Vertex v1 = new Vertex(3, 0);	// El usuario da un click en (3, 0)
		vertexList.add(v1);		// Se agrega v1 a la lista de v�rtices
		Vertex v2 = new Vertex(3, 4);	// El usuario da un click en (3, 4)
		vertexList.add(v2);		// Se agrega v2 a la lista de vertices
		Vertex v3 = new Vertex(2, 1);	// El usuario da un click en (2, -1)
		// Valida el invariante de que dos segmentos no se intersecten
		// Verifica si v3 intersecta alg�n segmento guardado en la lista de v�rtices
		if(!GUI.checkFullIntersect(vertexList, v3))
		{
			vertexList.add(v3);		// Si no intersecta, se agrega v3 a la lista de v�rtices
		}
		// Se crea un pol�gono con la lista de v�rtices que cumple el invariante
		Polygon pol = new Polygon(vertexList);
		System.out.println(pol);
	}
}
