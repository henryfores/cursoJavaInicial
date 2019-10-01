package metodospaq;

public class CalculadorFormas {

	public static void main(String[] args) {
		
		FormaRectangular forma1 = new FormaRectangular();
		FormaRectangular forma2 = new FormaRectangular();
		
		forma1.setNombre("Primero");
		forma1.setAltura(10);
		forma1.setBase(10);
		
		forma1.setNombre("Segundo");
		forma2.setAltura(15);
		forma2.setBase(15);

		System.out.println("Area "+ forma1.calcularArea());
		System.out.println("Perimetro "+ forma1.calcularPerimetro());
		System.out.println("Cuadrado "+ forma1.calcularCuadrado());
		
		System.out.println("Area "+ forma2.calcularArea());
		System.out.println("Perimetro "+ forma2.calcularPerimetro());
		System.out.println("Cuadrado "+ forma2.calcularCuadrado());
		
		
		if (forma1.calcularArea() >= forma2.calcularArea()) {
			
			System.out.println("La figura más grandes es " + forma1.nombreFigura());
			
		}else if (forma1.calcularArea() <= forma2.calcularArea()) {
			System.out.println("La figura más grande es " + forma2.nombreFigura());
			
		}else {
			System.out.println("Son iguales");
		}
	
	}

}
