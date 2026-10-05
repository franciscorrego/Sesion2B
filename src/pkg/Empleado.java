package pkg;

public class Empleado {

	public static float calculoNominaBruta(TipoEmpleado tipo, float ventasMes, float horasExtra) {
		
		float nomina = 0; 
		
		if (tipo == TipoEmpleado.VENDEDOR) {
			nomina = 2000;
		} else if (tipo == TipoEmpleado.ENCARGADO) {
			nomina = 2500;
		} else {
			throw new IllegalArgumentException("Otro tipo de empleado");
		}
		
		if (ventasMes >= 1500) {
			nomina += 200;
		} else if (ventasMes >= 1000) {
			nomina += 100;
		}
		
		nomina += (horasExtra * 30);
		
		return nomina;
	}
	
	public static float calculoNominaNeta(float nominaBruta) {
		if (nominaBruta < 2100) {
			return nominaBruta;
		} else if (nominaBruta < 2500) {
			return nominaBruta * (1 - 0.15f);
		} else {
			return nominaBruta * (1 - 0.18f); 
		}
	}
}