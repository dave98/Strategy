package strategy;

import java.util.Scanner;

public class App 
{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator calc = new Calculator();
		calc.register("%", new Porcentaje());

		while(true){
			int a = sc.nextInt();
			String op = sc.next();
			int b = sc.nextInt();
			int c = calc.execute(op, a, b);
			System.out.println(c);

		}
	}
}
