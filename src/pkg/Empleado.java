package pkg;

public class Empleado {

	private float salarioBase;
	
	float calculoNominaBruta(TipoEmpleado tipo, float ventasMes, float horasExtra) {
		if(tipo.toString().equals("VENDEDOR")) {
			salarioBase=2000;
		}
		if(tipo.toString().equals("ENCARGADO")) {
			salarioBase=2500;
		}
		
		if(tipo.toString().equals("VENDEDOR")||tipo.toString().equals("ENCARGADO")){

			if(ventasMes>=1000) {
				if(ventasMes>=1500) {
					salarioBase+=200;
				}else {
					salarioBase+=100;
				}
			}
			float sueldoHorasExtra = horasExtra*30;
			salarioBase+=sueldoHorasExtra;
			
			return salarioBase;
			
		}else {
			return -1;
		}
	}
	
	float calculoNominaNeta(float nominaBruta) {
		if(nominaBruta<2100) {
			return nominaBruta;
		}else if(nominaBruta<2500) {
			return (float)0.85*nominaBruta;
		}
		return 0;
	}
	
}
