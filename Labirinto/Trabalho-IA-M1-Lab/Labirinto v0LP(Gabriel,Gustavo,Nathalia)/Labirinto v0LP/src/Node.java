
public class Node {
	int x;
	int y;
	Node pai;
	int custo;
	double custoD;

	public Node(int x, int y, Node pai ,int mx, int my) {
		super();
		this.x = x;
		this.y = y;
		this.pai = pai;
		this.somaResultados(mx,my);
	}
	public double distanciaHeuristica(int mx, int my) { //distancia heuristica
		double dlat = this.x - mx;
		double dlon = this.y - my;
		return Math.sqrt(dlat * dlat + dlon * dlon);
	}

	public double distanciaMan(int mx, int my) { //distancia Man
		double dlat = this.x - mx;
		double dlon = this.y - my;
		return Math.abs(dlat) + Math.abs(dlon);
	}



	public void somaResultados(int mx, int my) {
		this.custoD =  this.distanciaHeuristica(mx, my) + this.distanciaMan(mx, my);
	}


	public boolean equals(Node obj) {	
		return obj.x==x&&obj.y==y;
	}
}
