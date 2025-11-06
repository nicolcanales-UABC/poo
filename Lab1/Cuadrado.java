

public class Cuadrado{
	//atributos del cuadrado
	public float lado;
	public float area;
	public float perimetro;
	
	public float calculaArea(float lado){
		area = lado*lado;
		
		return area;
	}
	
	public float calculaPerimetro(float lado){
		perimetro = lado*4;
		
		return perimetro;
	}
	
	
}