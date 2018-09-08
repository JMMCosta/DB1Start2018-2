package br.com.db1;

public class ExerciciosDouble {
	
	public Double exercicioMenorDeDois(Double numero1, Double numero2) {
		if(numero1<numero2) {
			return numero1;
		}
	return numero2;
	}
	
	public Double exercicioMenorDeTres(Double numero1, Double numero2, Double numero3) {
		if(numero1<numero2 && numero1<numero3) {
			return numero1;
		}
		
		if(numero2<numero1 && numero2<numero3) {
			return numero2;
		}
		
	return numero3;
	}
	
	public Double exercicioMediaDeTres(Double numero1, Double numero2, Double numero3) {
	
		return (numero1+numero2+numero3)/3;
	}
	
	
	public Double exercicioAreaTriangulo (Double base, Double altura) {

	return (base*altura)/2;
	}

}