package model;

public class Trapezio extends Quadrilatero {

	
	private float baseMenor;

	//Construtor
	public Trapezio(){
		super();
	}
	
	//Getters e Setters
	public float getBaseMenor() {
		return baseMenor;
	}

	public void setBaseMenor(float baseMenor) {
		this.baseMenor = baseMenor;
	}
	
	//Metodos
	@Override
	public float calcPerimetro() {
		float perimetro = getBase() + getBaseMenor() + (getAltura() * 2);
		return perimetro;
	}
	@Override
	public float calcArea() {
		float areaDoTrapezio = ((getBase() + baseMenor) * getAltura())/2;;
		return areaDoTrapezio;
	}
	
}
