
public class Triangulo{

	public float base;
	public float altura;
	public float area;
	public float perimetro;
	
	public float calculaAreaT(float base, float altura){
		area = base*altura/2;
		
		return area;
	}
	
	public float calculaPerimetroT(float base){
		perimetro = base*3;
		
		return perimetro;
	}
}