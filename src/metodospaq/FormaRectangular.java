package metodospaq;



public class FormaRectangular {

	// Atributos = caracteristicas
		
		private int altura;
		private int base;
		private String nombre;
		
		public int getBase() {
			return base;
		}
		public void setBase(int base) {
			this.base = base;
		}
		public int getAltura() {
			return altura;
		}
		public void setAltura(int altura) {
			this.altura = altura;
		}
		
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		public int calcularArea() {
			int area;
	
			area = this.base * this.altura;	
			return area;
		}
		
		public String nombreFigura() {
			String nombre;
	
			nombre = this.nombre;	
			return nombre;
		}
		
		

		public int calcularPerimetro() {
			int per;
	
			per = (this.base + this.altura) * 2;	
			return per;
	
		}
		public boolean calcularCuadrado() {
		
		 return base == altura;
		
		}		
		
	 
}
