
// DEFINICION DE LA CLASE
import javax.swing.JOptionPane;

public class Figuras{

	 public static void main(String[] args){
		 
		 Figuras fig= new Figuras();
		 fig.menu();
		 
	 }
	 
	 public void menu(){
		 
		 Cuadrado cuadrado = new Cuadrado();
		 Triangulo triangulo = new Triangulo();
		 Rectangulo rectangulo = new Rectangulo();
		 
		 
		 String dato= JOptionPane.showInputDialog("Ingresa lado del Cuadrado: ");
		 cuadrado.lado = Float.parseFloat(dato);
		 
		 triangulo.base = Float.parseFloat(JOptionPane.showInputDialog("Ingresa base del triangulo"));
		 triangulo.altura = Float.parseFloat(JOptionPane.showInputDialog("Ingresa altura del triangulo"));
		 
		 rectangulo.ladoUno = Float.parseFloat(JOptionPane.showInputDialog("Ingresa lado uno del rectangulo: "));
		 rectangulo.ladoDos = Float.parseFloat(JOptionPane.showInputDialog("Ingresa lado dos del rectangulo: "));
		 
		// cuadrado.lado=(Float.parseFloat(JOptionPane.showInputDialog("Ingresa lado del Cuadrado")));
		 
		 float a = cuadrado.calculaArea(cuadrado.lado);
		 JOptionPane.showMessageDialog(null,"El area del cuadrado con lado" +cuadrado.lado+"es"+a);
		 float p = cuadrado.calculaPerimetro(cuadrado.lado);
		 JOptionPane.showMessageDialog(null,"El perimetro del cuadrado con lado" +cuadrado.lado+"es"+p);
		 
		 float aT = triangulo.calculaAreaT(triangulo.base, triangulo.altura);
		 JOptionPane.showMessageDialog(null, "El area del triangulo con base "+triangulo.base+" y altura "+triangulo.altura+ "es de: "+aT);
		 float pT = triangulo.calculaPerimetroT(triangulo.base);
		 JOptionPane.showMessageDialog(null, "El perimetro del triangulo con base "+triangulo.base+" es de: "+pT);
		 
		 float aR = rectangulo.calculaAreaR(rectangulo.ladoUno, rectangulo.ladoDos);
		 JOptionPane.showMessageDialog(null,"El area del rectangulo con lado "+rectangulo.ladoUno+" y lado "+rectangulo.ladoDos+" es: "+aR);
		 float pR = rectangulo.calculaPerimetroR(rectangulo.ladoUno, rectangulo.ladoDos);
		 JOptionPane.showMessageDialog(null,"El perimetro del rectangulo con lado "+rectangulo.ladoUno+" y lado "+rectangulo.ladoDos+" es: "+pR);
		 
	 }
}