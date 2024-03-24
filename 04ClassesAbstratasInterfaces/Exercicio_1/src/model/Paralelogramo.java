package model;

public class Paralelogramo extends Quadrilatero{

	@Override
	public float calcArea() {
		float areaDoParalelogramo = (getBase() * getAltura());
		return areaDoParalelogramo;
	}

}
