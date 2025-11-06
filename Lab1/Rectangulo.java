
public class Rectangulo{
	
	//atributos del rectángulo
	public float ladoUno;
	public float ladoDos;
	public float area;
	public float perimetro;
	
	public float calculaAreaR(float ladoUno, float ladoDos){
		area = ladoUno*ladoDos;
		
		return area;
	}
	
	public float calculaPerimetroR(float ladoUno, float ladoDos){
		perimetro = ladoUno*2 + ladoDos*2;
		
		return perimetro;
	}
}