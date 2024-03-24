package view;

import model.Paralelogramo;
import model.Trapezio;

public class Main {

	public static void main(String[] args) {
		Paralelogramo paralelogramo = new Paralelogramo();
		Trapezio trapezio = new Trapezio();

		paralelogramo.setAltura(4);
		paralelogramo.setBase(3);

		System.out.println("Paralelogramo");
		System.out.println("Perímetro: " + paralelogramo.calcPerimetro());
		System.out.println("Area: " + paralelogramo.calcArea());

		System.out.println("*****************************");
		
		trapezio.setAltura(3);
		trapezio.setBase(4);
		trapezio.setBaseMenor(3);

		System.out.println("Trapézio");
		System.out.println("Perímetro: " + trapezio.calcPerimetro());
		System.out.println("Area: " + trapezio.calcArea());

	}

}
