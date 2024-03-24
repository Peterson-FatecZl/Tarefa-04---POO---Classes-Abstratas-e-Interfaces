package model;

public abstract class Quadrilatero {

	private float base;
	private float altura;
	
	//Construtor
	public Quadrilatero() {
		super();
	}
	
	//Getters e Setters
	public float getBase() {
		return base;
	}
	public void setBase(float base) {
		this.base = base;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float calcPerimetro() {
		float perimetro = (base * 2) + (altura * 2);
		return perimetro;
	}
	
	//Metodos
	public abstract float calcArea();
}
